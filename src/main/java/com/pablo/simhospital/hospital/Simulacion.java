package main.java.com.pablo.simhospital.hospital;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import main.java.com.pablo.simhospital.cola.Cola;
import main.java.com.pablo.simhospital.configuracion.Configuracion;
import main.java.com.pablo.simhospital.configuracion.IdiomaGui;
import main.java.com.pablo.simhospital.util.NumeroAleatorio.Aleatorio;

/**
 * 
 * @author Damián Blanco - Pablo Sosa
 */
public class Simulacion {
	// Creo logger
	private static Logger log = Logger.getLogger("LoggerGui.Simulacion");

	private Cola colaPacientes;
	private List<PeriodoDia> periodos;
	private Estadistica estadistica;
	private ExecutorService poolDeDoctores = null;
	private boolean termino;

	private static int baseMinutoEnMs;
	private int tFin;
	private int tInicio;

	/**
	 * Contructor 1 Inicializa los parametros por defecto.
	 */
	public Simulacion() {
		iniciar(40);
	}

	/**
	 * Contructor 2 Inicializa los parametros.
	 * 
	 * @param baseTiempo
	 *            Se utiliza para la velocidad de la simulación.
	 */
	public Simulacion(int baseTiempo) {
		iniciar(baseTiempo);
	}
	/**
	 * Inicializacion
	 * 
	 * @param baseTiempo de la representacion del minuto en la simulacion
	 */
	public void iniciar(int baseTiempo) {

		Simulacion.setBaseMinutoMs(baseTiempo);
		periodos = new ArrayList<PeriodoDia>();
		colaPacientes = new Cola();
		estadistica = new Estadistica(0, 0, 0, 0, 0, 0, 0);
		setTermino(false);

	}

	/**
	 * Lee de un archivo, el mismo esta compuesto por lineas que en su interior
	 * están divididas con el carácter %. Cada linea es un periodo de tiempo,
	 * compuesto por cinco partes, la primera es el inicio del periodo, la
	 * segunda el fin. Las campos restantes representan el porcentaje de
	 * probabilidad de generar un paciente prioridad alta, media y baja
	 * respectivamente
	 * 
	 * @param nombre
	 *            Nombre del archivo para abrir, debe ir con la extensión
	 * @throws FileNotFoundException
	 */
	public void cargarArchivo(String nombre) throws FileNotFoundException {
		Scanner lector = new Scanner(getClass().getResourceAsStream(nombre));
		while (lector.hasNext()) {
			String linea = lector.nextLine();
			String[] arreglo = linea.split("%");
			double probAlta = Double.parseDouble(arreglo[2]) / 100.0;
			double probMedia = Double.parseDouble(arreglo[3]) / 100.0;
			double probBaja = Double.parseDouble(arreglo[4]) / 100.0;
			PeriodoDia p = new PeriodoDia(arreglo[0], arreglo[1], probAlta,
					probMedia, probBaja);
			periodos.add(p);
			estadistica.setNumPeriodos(estadistica.getNumPeriodos() + 1);

		}
		log.info("Carga Archivo de Urgencias " + "Cantidad de periodos: "
				+ estadistica.getNumPeriodos());
		lector.close();
	}

	/**
	 * Inicia la simulación, corre el programa
	 * 
	 * @param docs
	 *            Cantidad de doctores en la sala.
	 * @param horaInicio
	 *            Hora de inicio de la antención.
	 * @param minutoInicio
	 *            Minutos de inicio de la antención.
	 * @param horaTermino
	 *            Hora de finalización de la antención.
	 * @param minutoTermino
	 *            Minutos de finalización de la antención.
	 * @param porcentaje
	 *            Pocentaje en que puede entrar un nuevo paciente, cada minuto.
	 * @throws Throwable
	 */
	public void simular(int docs, int horaInicio, int minutoInicio,
			int horaTermino, int minutoTermino, double porcentaje)
			throws Throwable {

		// Conversion a minutos
		tFin = 60 * horaTermino + minutoTermino;
		setTinicio(60 * horaInicio + minutoInicio);
		// LOG
		log.info("Comienza Simulación");
		log.info("T inicio: " + tInicio);
		log.info("T fin   : " + tFin);
		// defualt de 1 doctor
		if (docs < 1)
			docs = 1;
		//Inicializa el pool de doctores
		poolDeDoctores = Executors.newCachedThreadPool();
		// LOG
		log.info("Ejecuta los Doctores: " + docs);
		//Agrega la cantidad de doctores seteada
		for (int i = 0; i < docs; i++)
			poolDeDoctores.execute(new Doctor("" + i, this, colaPacientes));

		// Ciclo principal de simulacion
		while (tInicio < tFin || colaPacientes.isNotEmpty()) {
			// ACTUALIZAR DATOS
			// Espero 1' virtual = baseMinutoMs
			Thread.sleep(Simulacion.getBaseMinutoMs());
			if (tInicio < tFin) {
				if (Aleatorio.real(0, 1) < porcentaje) {//probabilidad de ingreseo de un paciente a la sala
					// Ingreso paciente
					PeriodoDia p = buscarPeriodo(tInicio);
					if (p == null) 
						p = (periodos.get(periodos.size() - 1));
					double[] probsActuales = p.getProbs();
					double prioridad = Aleatorio.real(0, 1);
					if (prioridad < probsActuales[0]) {
						log.info(IdiomaGui.getIngresoPacienteAltaMsj());
						colaPacientes.set(new Paciente(gettInicio(), 0));
						estadistica.incrementarPacientesAtendidosAlta();
					} else if (probsActuales[0] < prioridad
							&& prioridad < (probsActuales[0] + probsActuales[1])) {
						Configuracion.getIdioma();
						// LOG
						log.info(IdiomaGui.getIngresoPacienteMediaMsj());
						colaPacientes.set(new Paciente(gettInicio(), 1));
						estadistica.incrementarPacientesAtendidosMedia();
					} else {
						Configuracion.getIdioma();
						// LOG
						log.info(IdiomaGui.getIngresoPacienteBajaMsj());
						colaPacientes.set(new Paciente(gettInicio(), 2));
						estadistica.incrementarPacientesAtendidosBaja();
					}
					Configuracion.getIdioma();
					// LOG
					log.info(IdiomaGui.getPacienteEnColaMsj()
							+ colaPacientes.numPacientesEnCola());
				}
			}
			incrementarTinicio();
		}
		// LOG
		log.info(IdiomaGui.getFinSimulacionMsj());
		// Estadisticas
		estadisticasClientes();
		poolDeDoctores.shutdown();
		setTermino(true);
	}

	/**
	 * Devuelve las estadiscodas de los pacientes. Para lograr esto utiliza la
	 * clase Estadistica, ya que en ella es donde se guarda todo.
	 */
	public void estadisticasClientes() {
		for (int i = 0; i < estadistica.getNumPeriodos(); i++) {
			log.info("Periodo " + periodos.get(i).getHoraInicio() + " - "
					+ periodos.get(i).getHoraTermino());
		}
		log.info(IdiomaGui.getNumeroTotalPacientesMsj()
				+ this.estadistica.getNumPacientesAtendidos());
		log.info(IdiomaGui.getNumeroPacientesUrgenciaAltaMsj()
				+ this.estadistica.getPacientesAtendidosAlta());
		log.info(IdiomaGui.getNumeroPacientesUrgenciaMediaMsj()
				+ this.estadistica.getPacientesAtendidosMedia());
		log.info(IdiomaGui.getNumeroPacientesUrgenciaBajaMsj()
				+ this.estadistica.getPacientesAtendidosBaja());
		log.info(IdiomaGui.getEsperaPromedioMsj() + this.estadistica.esperaPromedio());
		log.info(IdiomaGui.getNumeroTotalPacientesMsj()
				+ this.estadistica.getNumPacientesAtendidos());
		log.info("-------------------");
	}

	/**
	 * Recibe un horario devuelve un periodo del dia.
	 * 
	 * @param t
	 *            Horario
	 * @return Periodo
	 */
	private PeriodoDia buscarPeriodo(int t) {
		for (int i = 0; i < estadistica.getNumPeriodos() - 1; i++) {
			if (periodos.get(i).estaEnPeriodo(t)) {
				return periodos.get(i);
			}
		}
		return null;
	}

	/**
	 * Obtiene el tiempo variable
	 * 
	 * @return Tiempo de inicio.
	 */
	public synchronized int gettInicio() {
		notifyAll();
		return tInicio;
	}

	/**
	 * Incrementa el tiempo variable en uno.
	 */
	private synchronized void incrementarTinicio() {
		tInicio++;
		notifyAll();
	}

	/**
	 * Setea el tiempo variable.
	 * 
	 * @param i
	 *            Tiempo en formato de entero.
	 */
	private synchronized void setTinicio(int i) {
		tInicio = i;
		notifyAll();
	}

	/**
	 * Obtiene el tiempo de finalización
	 * 
	 * @return Tiempo de fin.
	 */
	public synchronized int gettFin() {
		notifyAll();
		return tFin;
	}

	/**
	 * Devuelve la estadistica
	 * 
	 * @return Estadistica.
	 */
	public synchronized Estadistica getEstadistica() {
		notifyAll();
		return estadistica;
	}

	/**
	 * Cierre forzado de la simulacion
	 */
	public void stop() throws InterruptedException {
		setTinicio(gettFin());
		colaPacientes.clear();
		if (poolDeDoctores != null) {
			poolDeDoctores.shutdown();
			try {
				if (!poolDeDoctores.awaitTermination(1, TimeUnit.SECONDS)) {
					poolDeDoctores.shutdownNow();
					if (!poolDeDoctores.awaitTermination(1, TimeUnit.SECONDS))
						System.err.println(IdiomaGui.getErrorPoolDeDoctoresNoTerminaMsj());
				}
			} catch (InterruptedException ie) {
				poolDeDoctores.shutdownNow();
				Thread.currentThread().interrupt();
			}
			poolDeDoctores.awaitTermination(1, TimeUnit.SECONDS);
		}
		setTermino(true);
	}

	/**
	 * Setea la base en milisegundos en que va transcurrir la simulación.
	 * 
	 * @param i
	 *            Base de timepo en milisegundos.
	 */
	private static void setBaseMinutoMs(int i) {
		baseMinutoEnMs = i;
	}

	/**
	 * Obtiene la base de tiempo de la simulación.
	 * 
	 * @return Base de tiempo. (de 1 a 100)
	 */
	public static int getBaseMinutoMs() {
		return baseMinutoEnMs;
	}

	/**
	 * Setea el estado de la simulación.
	 * 
	 * @param estado
	 *            true o false
	 */
	public void setTermino(boolean estado) {
		this.termino = estado;
	}

	/**
	 * Obtiene el estado en que se encuentra la simulación.
	 * 
	 * @return true si termino o false si todavia no termino
	 */
	public boolean getTermino() {
		return termino;
	}

	/******************/
	public Cola getCola() {
		return colaPacientes;
	}
}

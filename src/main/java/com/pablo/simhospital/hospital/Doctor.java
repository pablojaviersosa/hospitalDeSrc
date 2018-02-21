package main.java.com.pablo.simhospital.hospital;

import java.util.Random;

import org.apache.log4j.Logger;

import main.java.com.pablo.simhospital.cola.Buffer;
import main.java.com.pablo.simhospital.configuracion.IdiomaGui;

/**
 * Desencola un paciente Completa la estadistica Demora proporcional en
 * milisegundos con consulta a la simulación
 * 
 * @author Damián Blanco - Pablo Sosa
 * 
 */
public class Doctor implements Runnable {

	private static Logger log = Logger.getLogger("LoggerGui.Simulacion.Doctor");

	private final static Random generator = new Random();
	private final Simulacion sim;
	private final Buffer sharedLocation;
	private String nombre;
	private long tiempoFin;
	private int tiempoAtencion;

	private final int baseTiempoAtencion = 20;
	private final int maxRNDTiempoAtencion = 40;

	/**
	 * Contructor
	 * 
	 * @param nombre
	 *            Nombre del doctor
	 * @param sim
	 *            Simulación
	 * @param shared
	 *            Cola compartida
	 */
	public Doctor(String nombre, Simulacion sim, Buffer shared) {
		sharedLocation = shared;
		this.nombre = nombre;
		this.sim = sim;
		this.tiempoFin = sim.gettFin();
	}

	/**
	 * Inicia el hilo
	 */
	public void run() {
		Paciente paciente;
		int tiempoDeEsperaPaciente;
		int horaActual = 0;

		try {
			while (horaActual < tiempoFin || sharedLocation.isNotEmpty()) {
				paciente = sharedLocation.get(this);//toma un paciente de la cola
				if (paciente != null) {
					// LOG
					log.info( "\t" + IdiomaGui.getDocMsj()+ getNombre() + "\t"+IdiomaGui.getDocAtiendeMsj());
					horaActual = sim.gettInicio();
					//genera un tiempo de espera proporcional a la urgencia del paciente
					tiempoAtencion = generator.nextInt(maxRNDTiempoAtencion) + baseTiempoAtencion;
					tiempoDeEsperaPaciente = horaActual - paciente.getTLlegada();
					sim.getEstadistica().incrementarNumPacientesAtendidos();
					if (tiempoDeEsperaPaciente > paciente.getTiempoVida())
						sim.getEstadistica().incrementarNumPacientesMuertos();

					sim.getEstadistica().setTiempoTotalDeEspera(
							sim.getEstadistica().getTiempoTotalDeEspera() + (tiempoDeEsperaPaciente));
					while (tiempoAtencion + horaActual > sim.gettInicio())
						Thread.sleep(Simulacion.getBaseMinutoMs());
				}
			}
		} catch (InterruptedException e) {
			log.trace(IdiomaGui.getFinDeHiloDoctorMsj() + e);//Cada vez que se realiza un Stop
		}
		log.info(IdiomaGui.getDocMsj()+ nombre +IdiomaGui.getTerminoDocMsj());
	}

	/**
	 * Obtiene el nombre del doctor
	 * 
	 * @return Nombre
	 */
	public String getNombre() {
		return nombre;
	}
}
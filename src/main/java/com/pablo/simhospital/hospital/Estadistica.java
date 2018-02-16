package main.java.com.pablo.simhospital.hospital;

/**
 * Lleva las estadisticas de la simulación.
 * 
 * @author Damián Blanco - Pablo Sosa
 */
public class Estadistica {
	private int tiempoTotalDeEspera;
	private int numPacientesAtendidos;
	private int numPacientesMuertos;
	private int numPeriodos;
	private int pacientesAtenidosAlta;
	private int pacientesAtenidosMedia;
	private int pacientesAtenidosBaja;

	/**
	 * Contructor
	 * 
	 * @param tiempoTotalDeEspera
	 *            Tiempo total de la espera de los pacientes
	 * @param numPacientesAtendidos
	 *            Cantidad total de pacientes atendidos
	 * @param numPacientesMuertos
	 *            Cantidad de pacientes muertos
	 * @param numPeriodos
	 *            Cantidad de periodos del archivo
	 * @param pacientesAtenidosAlta
	 *            Cantidad de pacientes atendidos con prioridad alta
	 * @param pacientesAtenidosMedia
	 *            Cantidad de pacientes atendidos con prioridad media
	 * @param pacientesAtenidosBaja
	 *            Cantidad de pacientes atendidos con prioridad baja
	 */
	public Estadistica(int tiempoTotalDeEspera, int numPacientesAtendidos,
			int numPacientesMuertos, int numPeriodos,
			int pacientesAtenidosAlta, int pacientesAtenidosMedia,
			int pacientesAtenidosBaja) {

		this.setTiempoTotalDeEspera(tiempoTotalDeEspera);
		this.setNumPacientesAtendidos(numPacientesAtendidos);
		this.setNumPacientesMuertos(numPacientesMuertos);
		this.setPacientesAtendidosAlta(pacientesAtenidosAlta);
		this.setPacientesAtendidosMedia(pacientesAtenidosMedia);
		this.setPacientesAtendidosBaja(pacientesAtenidosBaja);
		this.setNumPeriodos(numPeriodos);
	}

	public synchronized int getTiempoTotalDeEspera() {
		return tiempoTotalDeEspera;
	}

	public synchronized void setTiempoTotalDeEspera(int tiempoTotalDeEspera) {
		this.tiempoTotalDeEspera = tiempoTotalDeEspera;
	}

	public synchronized int getNumPacientesAtendidos() {
		return numPacientesAtendidos;
	}

	public synchronized void setNumPacientesAtendidos(int numPacientesAtendidos) {
		this.numPacientesAtendidos = numPacientesAtendidos;
	}

	public synchronized void incrementarNumPacientesAtendidos() {
		this.numPacientesAtendidos++;
	}

	public synchronized int getNumPacientesMuertos() {
		return numPacientesMuertos;
	}

	public synchronized void setNumPacientesMuertos(int numPacientesMuertos) {
		this.numPacientesMuertos = numPacientesMuertos;
	}

	public synchronized void incrementarNumPacientesMuertos() {
		this.numPacientesMuertos++;
	}

	public synchronized int getNumPeriodos() {
		return numPeriodos;
	}

	public synchronized void setNumPeriodos(int numPeriodos) {
		this.numPeriodos = numPeriodos;
	}

	public synchronized int getPacientesAtendidosAlta() {
		return pacientesAtenidosAlta;
	}

	public synchronized void setPacientesAtendidosAlta(int pacientesAtenidosAlta) {
		this.pacientesAtenidosAlta = pacientesAtenidosAlta;
	}

	public synchronized void incrementarPacientesAtendidosAlta() {
		this.pacientesAtenidosAlta++;
	}

	public synchronized int getPacientesAtendidosMedia() {
		return pacientesAtenidosMedia;
	}

	public synchronized void setPacientesAtendidosMedia(
			int pacientesAtenidosMedia) {
		this.pacientesAtenidosMedia = pacientesAtenidosMedia;
	}

	public synchronized void incrementarPacientesAtendidosMedia() {
		this.pacientesAtenidosMedia++;
	}

	public synchronized int getPacientesAtendidosBaja() {
		return pacientesAtenidosBaja;
	}

	public synchronized void setPacientesAtendidosBaja(int pacientesAtenidosBaja) {
		this.pacientesAtenidosBaja = pacientesAtenidosBaja;
	}

	public synchronized int getPacientesAtendidosTotales() {
		return pacientesAtenidosAlta + pacientesAtenidosMedia
				+ pacientesAtenidosBaja;
	}

	public synchronized void incrementarPacientesAtendidosBaja() {
		this.pacientesAtenidosBaja++;
	}

	/**
	 * 
	 * Cuando un paciente es atendido avisa cuanto demoro en la cola incrementa
	 * la cantidad de pacientes atendidos suma el tiempo sumas de las demoras /
	 * cantidad de pacientes
	 * 
	 * @return La espera promedio
	 */
	public double esperaPromedio() {
		return (double) getTiempoTotalDeEspera() / getNumPacientesAtendidos();
	}
}

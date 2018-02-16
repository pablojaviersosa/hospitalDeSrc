package main.java.com.pablo.simhospital.hospital;

/**
 * Probabilidad de tipo de urgencia de acuerdo al periodo del dia.
 * 
 * @author Damian Blanco - Pablo Sosa
 */
public class PeriodoDia {
	private String horaInicio;
	private String horaTermino;
	private int tMin;
	private int tMax;
	private double[] probs;

	/**
	 * Constructor
	 * 
	 * @param _horaInicio
	 *            Hora de inicio del periodo
	 * @param _horaTermino
	 *            Hora de fin del periodo
	 * @param _probAlta
	 *            Porcentaje de probabilidad alta en el periodo (0)
	 * @param _probMedia
	 *            Porcentaje de probabilidad media en el periodo (1)
	 * @param _probBaja
	 *            Porcentaje de probabilidad abaja en el periodo (2)
	 */
	public PeriodoDia(String _horaInicio, String _horaTermino,
			double _probAlta, double _probMedia, double _probBaja) {
		horaInicio = _horaInicio;
		horaTermino = _horaTermino;
		String[] inicio = horaInicio.split(":");
		String[] termino = horaTermino.split(":");
		tMin = horaAMinuto(Integer.parseInt(inicio[0]),
				Integer.parseInt(inicio[1]));
		tMax = horaAMinuto(Integer.parseInt(termino[0]),
				Integer.parseInt(termino[1]));
		probs = new double[3];
		probs[0] = _probAlta;
		probs[1] = _probMedia;
		probs[2] = _probBaja;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public String getHoraTermino() {
		return horaTermino;
	}

	private int horaAMinuto(int hora, int minuto) {
		return minuto + 60 * hora;
	}

	/**
	 * Devuelve si tiempo pertenece a un periodo.
	 * 
	 * @param tiempo
	 *            Tiempo para controlar
	 * @return true o false
	 */
	public boolean estaEnPeriodo(int tiempo) {
		return (tiempo >= tMin && tiempo <= tMax);
	}

	/**
	 * Devuelve las probabilidades para un periodo
	 * 
	 * @return La probabilidad
	 */
	public double[] getProbs() {
		return probs;
	}
}

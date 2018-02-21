package main.java.com.pablo.simhospital.hospital;

import org.apache.log4j.Logger;

import main.java.com.pablo.simhospital.configuracion.IdiomaGui;
import main.java.com.pablo.simhospital.util.NumeroAleatorio;

/**
 * Estructura de un paciente.
 * 
 * @author Damián Blanco - Pablo Sosa
 */
public class Paciente implements Comparable<Paciente> {
	private static Logger log = Logger
			.getLogger("LoggerGui.Simulacion.Paciente");

	private int tLlegada;
	private int tipoPrioridad; // Alta =0 , Media =1 , Baja =2
	private int tiempoVida;

	/*
	 * Constantes parametrizables Paciente
	 */
	public static int baseTiempoDeVidaAlta = 30; // minutos
	public static int baseTiempoDeVidaMedia = 180;//
	public static int baseTiempoDeVidaBaja = Integer.MAX_VALUE; // no puede
																// morir por la
																// afeccion

	public static int rangoTiempoDeVidaAlta = 15; // minutos
	public static int rangoTiempoDeVidaMedia = 660;// 1140 minutos - 1 dia

	/**
	 * Constructor
	 * 
	 * @param _tLlegada
	 *            Tiempo de llegada.
	 * @param _tipoPrioridad
	 *            Tipo de prioridad, alta, media, baja.
	 */
	public Paciente(int _tLlegada, int _tipoPrioridad) {
		tLlegada = _tLlegada;
		tipoPrioridad = _tipoPrioridad;
		setTiempoVida(0);
	}

	public int getTLlegada() {
		return tLlegada;
	}

	public int getTipoServicio() {
		return tipoPrioridad;
	}

	@Override
	public String toString() {
		return IdiomaGui.getHoraLlegadaPacienteMsj() + tLlegada + " "+ IdiomaGui.getPrioridadMsj()+" "+
				+ tipoPrioridad;
	}

	@Override
	public int compareTo(Paciente p1) {
		if (this.tipoPrioridad != ((Paciente) p1).getTipoServicio())
			return this.tipoPrioridad - ((Paciente) p1).tipoPrioridad;
		return this.tLlegada - ((Paciente) p1).tLlegada;
	}

	public int getTiempoVida() {
		return tiempoVida;
	}

	public void setTiempoVida(int tiempoVida) {
		int base = 0;
		switch (this.getTipoServicio()) {
		case 0:
			base = Paciente.baseTiempoDeVidaAlta;
			base += Math.abs(NumeroAleatorio.Aleatorio.entero(base,
					rangoTiempoDeVidaAlta));
			log.debug(IdiomaGui.getuAtiempoDeVidaMsj() + base);
			break;
		case 1:
			base = Paciente.baseTiempoDeVidaMedia;
			base += Math.abs(NumeroAleatorio.Aleatorio.entero(base,
					rangoTiempoDeVidaMedia));
			log.debug(IdiomaGui.getuMtiempoDeVidaMsj() + base);
			break;
		case 2:
			base = Paciente.baseTiempoDeVidaBaja;
			log.debug(IdiomaGui.getuBtiempoDeVidaMsj() + base);
			break;
		default:
			base = Paciente.baseTiempoDeVidaAlta;
			log.debug(IdiomaGui.getuDtiempoDeVidaMsj() + base);
			break;
		}
		this.tiempoVida = base;
	}
}

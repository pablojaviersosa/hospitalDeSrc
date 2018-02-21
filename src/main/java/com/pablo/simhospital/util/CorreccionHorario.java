package main.java.com.pablo.simhospital.util;
/**
 * Metodo que agrega un 0 adelante para los numeros de una cifra
 * @author Pablo Sosa
 *
 */
public abstract class CorreccionHorario {

	public static String arreglarHora(int horario) {
		return "" + ((horario < 10) ? "0" : "") + horario;
	}
}

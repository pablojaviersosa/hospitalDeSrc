package main.java.com.pablo.simhospital.util;

import java.util.Random;

/**
 * Clase de utilidades para la simulacion de urgencias.
 * 
 * @author Damián Blanco - Pablo Sosa
 */
public class NumeroAleatorio {
	/**
	 * Genera un numero aleatorio entre un rango.
	 * 
	 * @author Damián Blanco - Pablo Sosa
	 */
	public static class Aleatorio {
		public static double real(double d1, double d2) {
			return (new Random().nextDouble()) % (d2 - d1);
		}

		public static int entero(int d1, int d2) {
			return ((new Random()).nextInt()) % (d2 - d1);
		}
	}
}

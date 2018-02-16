package main.java.com.pablo.simhospital.util;

public class CorreccionHorario {

	public String arreglarHora(int horario) {
		return "" + ((horario < 10) ? "0" : "") + horario;
	}
}

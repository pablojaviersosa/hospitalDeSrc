package main.java.com.pablo.simhospital.cola;

import main.java.com.pablo.simhospital.hospital.Doctor;
import main.java.com.pablo.simhospital.hospital.Paciente;

/**
 * Interfase para comunicar los doctores con la simulación.
 * 
 * @author Damián Blanco - Pablo Sosa
 */
public interface Buffer {
	public void set(Paciente paciente) throws InterruptedException;

	public Paciente get(Doctor doctor) throws InterruptedException;

	public boolean isNotEmpty() throws InterruptedException;
}

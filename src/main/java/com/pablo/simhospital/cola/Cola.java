package main.java.com.pablo.simhospital.cola;

import main.java.com.pablo.simhospital.configuracion.IdiomaGui;
import main.java.com.pablo.simhospital.hospital.Doctor;
import main.java.com.pablo.simhospital.hospital.Paciente;

import java.util.PriorityQueue;

import org.apache.log4j.Logger;

/**
 * Implementación de la cola de pacientes.
 * 
 * @author Damián Blanco - Pablo Sosa
 */
public class Cola extends PriorityQueue<Paciente> implements Buffer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger("LoggerGui.Cola");

	public PriorityQueue<Paciente> getPacientes(int tipo) {
		PriorityQueue<Paciente> p = new PriorityQueue<Paciente>();
		for (Paciente pc : this) {
			if (pc.getTipoServicio() == tipo)
				p.offer(pc);
		}
		return p;
	}

	/**
	 * Devuelve la cantidad de pacientes en la cola.
	 * 
	 * @return Cantidad de pacientes en la cola.
	 */
	public int numPacientesEnCola() {
		return this.size();
	}

	/**
	 * Agrega un paciente a la cola, sincronizado.
	 */
	@Override
	public synchronized void set(Paciente paciente) throws InterruptedException {
		this.add(paciente);
		notifyAll();
	}

	/**
	 * Devuelve y quita un paciente de la cola.
	 */
	@Override
	public synchronized Paciente get(Doctor doctor) throws InterruptedException {
		Paciente paciente = null;

		while (this.isEmpty()) {
			log.info(IdiomaGui.getDocMsj() + doctor.getNombre() + IdiomaGui.getEsperaPacientesMsj());
			wait();
		}
		if (!this.isEmpty())
			paciente = this.poll();
		notifyAll();
		return paciente;
	}

	/**
	 * Informa si la cola esta vacia
	 */
	@Override
	public synchronized boolean isNotEmpty() {
		return !isEmpty();
	}
}

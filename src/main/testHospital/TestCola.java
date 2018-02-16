package main.testHospital;

//import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import main.java.com.pablo.simhospital.cola.Cola;
import main.java.com.pablo.simhospital.hospital.Paciente;

public class TestCola {
	private Cola colaPacientes;

	@Before
	public void antesDelTest() {
		colaPacientes = new Cola();
	}

	@Test
	public void testColaVacia() {
		assertFalse(colaPacientes.isNotEmpty());
		colaPacientes.add(new Paciente(800, 1));
		assertTrue(colaPacientes.isNotEmpty());
	}

	@Test
	public void testCantidadPacientesEnCola() {
		assertEquals(0, colaPacientes.numPacientesEnCola());
		colaPacientes.add(new Paciente(800, 1));
		assertEquals(1, colaPacientes.numPacientesEnCola());
		colaPacientes.add(new Paciente(900, 2));
		assertEquals(2, colaPacientes.numPacientesEnCola());
	}
}

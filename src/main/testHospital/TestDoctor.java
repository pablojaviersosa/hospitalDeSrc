package main.testHospital;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import main.java.com.pablo.simhospital.hospital.Doctor;
import main.java.com.pablo.simhospital.hospital.Paciente;
import main.java.com.pablo.simhospital.hospital.Simulacion;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDoctor {
	private static Logger log = Logger.getLogger("LoggerGui.junit");
	private Doctor doc;
	private Simulacion sim;

	@Before
	public void antesDelTest() {
		sim = new Simulacion();
		try {
			sim.cargarArchivo("urgencias.txt");
			sim.getCola().set(new Paciente(15, 0));
		} catch (InterruptedException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			log.fatal(e);
		}
		doc = new Doctor("juan", sim, sim.getCola());
	}

	@After
	public void despuesDelTest() {
		try {
			sim.stop();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.fatal(e);
		}
	}

	@Test
	public void testAtiendePaciente() throws Throwable {
		ExecutorService hiloDoctor;

		hiloDoctor = Executors.newCachedThreadPool();
		hiloDoctor.execute(doc);
		hiloDoctor.awaitTermination(1, TimeUnit.SECONDS);
		assertTrue(sim.getCola().isEmpty());
	}

	@Test
	public void testNoAtiendeTodosRun() {
		try {
			sim.getCola().set(new Paciente(15, 0));
			sim.getCola().set(new Paciente(15, 0));
			sim.getCola().set(new Paciente(15, 0));
			sim.getCola().set(new Paciente(15, 0));
			sim.getCola().set(new Paciente(15, 0));
			sim.getCola().set(new Paciente(15, 0));
			sim.getCola().set(new Paciente(15, 0));
			ExecutorService hiloDoctor;
			hiloDoctor = Executors.newCachedThreadPool();
			hiloDoctor.execute(doc);
			hiloDoctor.awaitTermination(1, TimeUnit.SECONDS);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.fatal(e);
		}
		assertTrue(sim.getCola().isNotEmpty());
	}

	@Test
	public void testTamanioCola() throws Throwable {
		sim.getCola().set(new Paciente(15, 0));
		sim.getCola().set(new Paciente(15, 0));
		sim.getCola().set(new Paciente(15, 0));
		sim.getCola().set(new Paciente(15, 0));
		sim.getCola().set(new Paciente(15, 0));
		sim.getCola().set(new Paciente(15, 0));
		sim.getCola().set(new Paciente(15, 0));

		ExecutorService hiloDoctor;
		hiloDoctor = Executors.newCachedThreadPool();
		hiloDoctor.execute(doc);
		hiloDoctor.awaitTermination(1, TimeUnit.SECONDS);

		log.info(sim.getCola().size());

		assertTrue(sim.getCola().size() < 7);
	}
}

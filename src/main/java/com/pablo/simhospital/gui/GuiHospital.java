package main.java.com.pablo.simhospital.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

import main.java.com.pablo.simhospital.configuracion.ConfigGuiPaths;
import main.java.com.pablo.simhospital.configuracion.Configuracion;
import main.java.com.pablo.simhospital.configuracion.IdiomaGui;
import main.java.com.pablo.simhospital.configuracion.ValoresPorDefectoGui;
import main.java.com.pablo.simhospital.hospital.Simulacion;
import main.java.com.pablo.simhospital.util.Archivo;
import main.java.com.pablo.simhospital.util.CorreccionHorario;
import main.java.com.pablo.simhospital.util.MusicaGui;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GuiHospital implements ActionListener, MouseMotionListener {
	private static ExecutorService hiloMusical;
	private static Logger log = Logger.getLogger("LoggerGui");
	private JFrame frmHospital;
	// Configuraciones de iconos funetes y mensajes
	private Configuracion config;
	// Pantallas
	private LogGui logGui;
	private ConfiguracionGui configGui;
	private EstadisticaGui estadisticaGui;
	private SimulacionGui simulGui;

	private estadoApp estado;
	// Simulacion back
	private Simulacion sim;
	// private CounterTask task;
	private Task task1;
	private int cantidadDoc;
	private int hsInicial;
	private int minInicial;
	private int hsFinal;
	private int minFinal;
	private double porcentajeMin;

	public enum estadoApp {
		CONFIGURACION, CORRIENDO, ESTADISTICA, LOG
	};

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final GuiHospital window = new GuiHospital();
					window.frmHospital.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiHospital() {
		initialize();
	}

	private void initialize() {
		// carga las propiedades de todos los recursos del sitema y los
		// instancia
		config = new Configuracion("src/main/config/common.properties");
		configurarLogger();
		//musica
		hiloMusical = Executors.newCachedThreadPool();
		try {
			MusicaGui player = new MusicaGui();
			hiloMusical.execute(player);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//pantallas
		logGui = new LogGui(config);
		configGui = new ConfiguracionGui(config);
		estadisticaGui = new EstadisticaGui(config);
		simulGui = new SimulacionGui(config);
		setEstadoApp(estadoApp.CONFIGURACION);
		// task = new CounterTask();
		task1 = new Task();

		/* Ventana Principal */
		frmHospital = new JFrame();
		frmHospital.getContentPane().setBackground(new Color(177, 177, 177));
		frmHospital.getContentPane().setLayout(null);
		frmHospital.setResizable(false);
		frmHospital.setTitle(IdiomaGui.getTituloHospitalMsj());
		frmHospital.setBounds(100, 100, 800, 600);
		frmHospital.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setearListeners();
	}

	public void setEstadoApp(estadoApp est) {
		estado = est;
	}

	public estadoApp getEstadoApp() {
		return estado;
	}

	public void actualizarInfoEstatica(int cantidad, int hsMin, int hsMax) {
		/* SimulacionGui */
		getSimulGui().getTxt_ContDoctores().setText("" + cantidad);
		getSimulGui().getTxt_TiempoMin().setText(
				new CorreccionHorario().arreglarHora(hsInicial) + ":"
						+ new CorreccionHorario().arreglarHora(minInicial));
		getSimulGui().getTxt_TiempoMax().setText(
				new CorreccionHorario().arreglarHora(hsFinal) + ":"
						+ new CorreccionHorario().arreglarHora(minFinal));
		getSimulGui().getBarraTiempo().setMinimum(hsMin);
		getSimulGui().getBarraTiempo().setMaximum(hsMax);

		/* Estadistica */
		getEstadisticaGui().getTxt_Resultado_EstadHoraInicio().setText(
				new CorreccionHorario().arreglarHora(hsInicial) + ":"
						+ new CorreccionHorario().arreglarHora(minInicial));
		getEstadisticaGui().getTxt_Resultado_EstadHoraFin().setText(
				new CorreccionHorario().arreglarHora(hsFinal) + ":"
						+ new CorreccionHorario().arreglarHora(minFinal));
		getEstadisticaGui().getTxt_Resultado_EstadCantidadDoc().setText(
				"" + cantidad);

		/* SimulacionGui */
		dibujarBoxes(cantidad);
		getSimulGui().getContenedorFilaPacientes().repaint();
		getSimulGui().getContenedorFila().repaint();
		getSimulGui().getContenedorBoxes().repaint();
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void actualizarInfoDinamica() {
		ExecutorService poolPintor = Executors.newCachedThreadPool();
		Runnable pintor = new Runnable() {
			@Override
			public void run() {
				// LOG
				log.info("Inicio Pintor");
				int valorA = 0;
				int valorB = 0;

				while (!sim.getTermino()) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// LOG
						log.fatal("Error de pintor " + e.getMessage());
					}

					if (estado == estadoApp.CORRIENDO) {
						// contenedorFila.removeAll();
						dibujarFilaPaciente(sim.getCola().numPacientesEnCola());
						// contenedorBoxes.repaint();
						// contenedorFilaPacientes.repaint();
						// contenedorFila.repaint();

						getSimulGui()
								.getTxt_ContPacientes()
								.setText(
										""
												+ sim.getEstadistica()
														.getPacientesAtendidosTotales());
						getSimulGui().getBarraTiempo().setValue(
								sim.gettInicio());
						getSimulGui().getTxt_ContMuertos().setText(
								""
										+ sim.getEstadistica()
												.getNumPacientesMuertos());

						getSimulGui()
								.getTxt_PacienteMax()
								.setText(
										""
												+ sim.getEstadistica()
														.getPacientesAtendidosTotales());
						getSimulGui().getBarraPacientes().setMaximum(
								sim.getEstadistica()
										.getPacientesAtendidosTotales());
						getSimulGui().getBarraPacientes()
								.setValue(
										sim.getEstadistica()
												.getNumPacientesAtendidos());
						getSimulGui().getBarraPacientes().setString(
								""
										+ sim.getEstadistica()
												.getNumPacientesAtendidos());

						if (sim.gettInicio() < sim.gettFin()) {
							valorA = (int) (50 * ((double) sim.gettInicio() / (double) sim
									.gettFin()));
						}
						valorB = (int) (50 * (sim.getEstadistica()
								.getNumPacientesAtendidos() / (double) sim
								.getEstadistica()
								.getPacientesAtendidosTotales()));
						getSimulGui().getBarraTotal().setValue(valorA + valorB);

					} else {
						// estado Estadistica
						mostrarEstadistica();
						getEstadisticaGui().getEstadisticaPopUp().repaint();
					}
				}
				// cuando termina la simulacion
				mostrarEstadistica();
				getEstadisticaGui().getEstadisticaPopUp().repaint();
			}
		};
		poolPintor.execute(pintor);
		// LOG
		log.info("Fin Pintor");
		poolPintor.shutdown();
	}

	/* Boxes */
	public void dibujarBoxes(int cantidad) {
		int cantidadDoctores = cantidad;
		int posicion = 15;

		getSimulGui().getContenedorBoxes().removeAll();
		for (int i = 0; i < 9; i++) {
			JLabel box = new JLabel();
			box.setBounds(posicion, ValoresPorDefectoGui.getBox_posY_A(),
					ValoresPorDefectoGui.getAnchoBox(),
					ValoresPorDefectoGui.getAltoBox());
			if (i < cantidadDoctores) {
				box.setIcon(config.getIconos().getIconBoxOcupado());
			} else {
				box.setIcon(config.getIconos().getIconBoxLibre());
			}
			getSimulGui().getContenedorBoxes().add(box);
			posicion += 65;
		}
		posicion = 15;
		for (int i = 0; i < 6; i++) {
			JLabel box = new JLabel();
			box.setBounds(posicion, ValoresPorDefectoGui.getBox_posY_B(),
					ValoresPorDefectoGui.getAnchoBox(),
					ValoresPorDefectoGui.getAltoBox());
			if (i + 9 < cantidadDoctores) {
				box.setIcon(config.getIconos().getIconBoxOcupado());
			} else {
				box.setIcon(config.getIconos().getIconBoxLibre());
			}
			getSimulGui().getContenedorBoxes().add(box);
			posicion += 65;
		}
		getSimulGui().getContenedorBoxes().repaint();
	}

	/* Fila pacientes */
	public void dibujarFilaPaciente(int cantidad) {
		int posX = 425;
		int posY = 0;

		if (cantidad > 23)
			cantidad = 23;

		// contenedorFila.removeAll();
		getSimulGui().getContenedorFilaPacientes().removeAll();
		log.info("Pacientes en cola: " + cantidad);
		for (int i = 0; i < 23; i++) {
			if (i < cantidad) {
				dibujarPaciente(posX, posY, config.getIconos()
						.getIconPacienteFila());
			} else {
				dibujarPaciente(posX, posY, config.getIconos()
						.getIconPacienteFilaVacio());
			}
			if (i < 2) {
				posY += 50;
			} else if (i < 10) {
				posY = 105;
				posX -= 44;
			} else if (i < 11) {
				posY = 160;
				posX = 55;
			} else if (i < 19) {
				posY = 170;
				posX += 43;
			} else {
				posY += 50;
				posX = 405;
			}
		}
		getSimulGui().getContenedorFila().repaint();
		getSimulGui().getContenedorFilaPacientes().repaint();
	}

	public void dibujarPaciente(int posX, int posY, Icon icono) {
		JLabel paciente = new JLabel();
		paciente.setBounds(posX, posY, 35, 43);
		paciente.setIcon(icono);
		getSimulGui().getContenedorFilaPacientes().add(paciente);
	}

	public void mostrarEstadistica() {
		getEstadisticaGui()
				.getTxt_Resultado_EstadHoraActual()
				.setText(
						new CorreccionHorario().arreglarHora(sim.gettInicio() / 60)
								+ ":"
								+ new CorreccionHorario().arreglarHora(sim
										.gettInicio() % 60));
		getEstadisticaGui().getTxt_Resultado_EstadPacientesTotales().setText(
				"" + sim.getEstadistica().getNumPacientesAtendidos());
		getEstadisticaGui().getTxt_Resultado_EstadPacientesAlta().setText(
				"" + sim.getEstadistica().getPacientesAtendidosAlta());
		getEstadisticaGui().getTxt_Resultado_EstadPacientesMedia().setText(
				"" + sim.getEstadistica().getPacientesAtendidosMedia());
		getEstadisticaGui().getTxt_Resultado_EstadPacientesBaja().setText(
				"" + sim.getEstadistica().getPacientesAtendidosBaja());
		getEstadisticaGui().getTxt_Resultado_EstadPacientesMuertos().setText(
				"" + sim.getEstadistica().getNumPacientesMuertos());
		getEstadisticaGui().getTxt_Resultado_EstadPacientesFila().setText(
				"" + sim.getCola().numPacientesEnCola());
		int esperaPromedio = (int) sim.getEstadistica().esperaPromedio();
		getEstadisticaGui().getTxt_Resultado_EstadEsperaPromedio().setText(
				new CorreccionHorario().arreglarHora(esperaPromedio / 60)
						+ ":"
						+ new CorreccionHorario()
								.arreglarHora(esperaPromedio % 60));
		int tiempoEspera = sim.getEstadistica().getTiempoTotalDeEspera();
		getEstadisticaGui().getTxt_Resultado_EstadTiempoEsperaTotal().setText(
				new CorreccionHorario().arreglarHora(tiempoEspera / 60)
						+ ":"
						+ new CorreccionHorario()
								.arreglarHora(tiempoEspera % 60));
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private class Task extends SwingWorker<Integer, Integer> {
		@Override
		protected Integer doInBackground() throws Exception {
			int velocidad = Integer.parseInt(getConfigGui()
					.getTxt_ConfResultadoVelocidad().getText());
			velocidad = (velocidad - 100) * -1;// acomoda la velocidad
			sim = new Simulacion(velocidad);
			try {
				sim.cargarArchivo(ConfigGuiPaths.getPathUrgenciasStr());
				sim.simular(cantidadDoc, hsInicial, minInicial, hsFinal,
						minFinal, porcentajeMin);
			} catch (FileNotFoundException e2) {
				// LOG
				log.fatal("Error simulacion abrir archivo: " + e2.getMessage());
			} catch (Throwable e1) {
				// LOG
				log.fatal("Error simular: " + e1.getClass());
			}
			log.info("Fin de Simulacion");
			return 0;
		}

		public void doTask() {
			Task task = new Task();
			task.execute();
		}

		@Override
		protected void done() {
			if (isCancelled()) {
				// LOG
				log.info("DoInBackGround Cancelado");
			} else {
				// LOG
				log.info("DoInBackGround Terminado");
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void configurarLogger() {
		try {
			PropertyConfigurator.configure(new FileInputStream(ConfigGuiPaths
					.getPathLog4jPropertiesStr()));
		} catch (FileNotFoundException e1) {
			try {
				PropertyConfigurator.configure(InputStream.class
						.getResourceAsStream(ConfigGuiPaths
								.getPathLog4jPropertiesStr()));
			} catch (Exception e) {
				System.err.println(IdiomaGui.getErrorAlcargarLogger());
				e1.printStackTrace();
			}
		}
	}
	public void setearListeners(){
		/**
		 * El orden de incorporacion de los eventos a cada boton sera:
		 * 
		 * 1) Obtengo el boton de la Gui y le agrego el listener 2) Lo agrego
		 * nuevamente a su popUp 3) Cargo el popUp nuevamente en el JFrame
		 * 
		 */

		// 1) El unico boton que tiene es el de Back
		getLogGui().getBtn_BackLog().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (getEstadoApp() == estadoApp.LOG) {
					getConfigGui().getConfiguracionPopUp().setVisible(true);
					getLogGui().getLogPopUp().setVisible(false);
					setEstadoApp(estadoApp.CONFIGURACION);
				}
			}
		});

		// 2
		getLogGui().getLogPopUp().add(getLogGui().getBtn_BackLog());

		// 3 Agrego logPopUp a la ventana principal
		frmHospital.getContentPane().add(getLogGui().getLogPopUp());

		// Agrego Simulacion Botonde Stop y Boton de Estadistica

		getSimulGui().getBtn_Stop().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (getEstadoApp() == estadoApp.CORRIENDO) {
					try {
						sim.stop();
					} catch (InterruptedException e1) {
						log.fatal("No puedo parar!");
					}
					estado = estadoApp.CONFIGURACION;
					getConfigGui().getConfiguracionPopUp().setVisible(true);
					getSimulGui().getMenu().setVisible(false);// ojo
					getSimulGui().getSala().setVisible(false);
				}
			}
		});
		getSimulGui().getBtn_Estadistica().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (getEstadoApp() == estadoApp.CORRIENDO) {
					getEstadisticaGui().getEstadisticaPopUp().setVisible(true);
					estado = estadoApp.ESTADISTICA;
				}
			}
		});
		getSimulGui().getContenedorBotones().add(getSimulGui().getBtn_Stop());
		getSimulGui().getContenedorBotones().add(
				getSimulGui().getBtn_Estadistica());
		// Agrego simulacionPopUp a la ventana principal

		getSimulGui().getSala().add(getSimulGui().getContenedorBotones());
		frmHospital.getContentPane().add(getSimulGui().getSala());
		frmHospital.getContentPane().add(getSimulGui().getMenu());

		getEstadisticaGui().getBtn_Back().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (estado == estadoApp.ESTADISTICA) {
					getEstadisticaGui().getEstadisticaPopUp().setVisible(false);
					estado = estadoApp.CORRIENDO;
				}

			}
		});

		getEstadisticaGui().getEstadisticaPopUp().add(
				getEstadisticaGui().getBtn_Back());
		frmHospital.add(getEstadisticaGui().getEstadisticaPopUp());
		// 1 agrego un listener al bonton de log de la congfigGui
		getConfigGui().getBtnLog().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (getEstadoApp() == estadoApp.CONFIGURACION) {
					getConfigGui().getConfiguracionPopUp().setVisible(false);
					getLogGui().getLogPopUp().setVisible(true);
					setEstadoApp(estadoApp.LOG);
					String txtlog = new Archivo()
							.leerArchivo("log/simulacion.log");
					getLogGui().getTxt_resultadoScrollLog().setText(txtlog);
				}
			}
		});

		// 1 Agrego el listener al boton de play de la misma ventana
		getConfigGui().getBtnPlay().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				boolean valido = true;
				int hsMin = 60
						* Integer.parseInt(getConfigGui()
								.getTxt_Conf_HsInicio().getText())
						+ Integer.parseInt(getConfigGui()
								.getTxt_Conf_MinInicio().getText());
				int hsMax = 60
						* Integer.parseInt(getConfigGui().getTxt_Conf_HsFin()
								.getText())
						+ Integer.parseInt(getConfigGui().getTxt_Conf_MinFin()
								.getText());

				cantidadDoc = (int) getConfigGui().getSelectorConfCantidadDoc()
						.getValue();
				hsInicial = Integer.parseInt(getConfigGui()
						.getTxt_Conf_HsInicio().getText());
				minInicial = Integer.parseInt(getConfigGui()
						.getTxt_Conf_MinInicio().getText());
				hsFinal = Integer.parseInt(getConfigGui().getTxt_Conf_HsFin()
						.getText());
				minFinal = Integer.parseInt(getConfigGui().getTxt_Conf_MinFin()
						.getText());
				porcentajeMin = Double.parseDouble(getConfigGui()
						.getTxt_ConfResultadoPorcentajeMin().getText()) / 100;

				if (getEstadoApp() == estadoApp.CONFIGURACION) {
					// 24:00 -> 1440
					// 1439 -> 1439
					// valido de 0 a 23:59
					if (0 > hsMin || hsMin > 1439 || 0 > hsMax || hsMax > 1439)// valido
						// una
						// hora
						// valida
						valido = false;
					if (hsMin > hsMax)
						valido = false;

					if (valido) {
						task1.doTask();// este llama
						// a la
						// simulacion
						getConfigGui().getConfiguracionPopUp()
								.setVisible(false);
						getSimulGui().getMenu().setVisible(true);
						getSimulGui().getSala().setVisible(true);
						actualizarInfoEstatica(cantidadDoc, hsMin, hsMax);// acomoda
																			// lo
						// del panel
						actualizarInfoDinamica();
						estado = estadoApp.CORRIENDO;
					} else {
						// cartel o focus en los errores
						JOptionPane.showMessageDialog(null,
								"Error en la configuración");
					}
				}
			}
		});
		// 2 log y play al popUp

		getConfigGui().getConfiguracionPopUp().add(getConfigGui().getBtnLog());
		getConfigGui().getConfiguracionPopUp().add(getConfigGui().getBtnPlay());

		// Agrego configGuiPopUp a la ventana
		frmHospital.getContentPane()
				.add(getConfigGui().getConfiguracionPopUp());
	}

	public LogGui getLogGui() {
		return logGui;
	}

	public void setLogGui(LogGui logGui) {
		this.logGui = logGui;
	}

	public ConfiguracionGui getConfigGui() {
		return configGui;
	}

	public void setConfigGui(ConfiguracionGui configGui) {
		this.configGui = configGui;
	}

	public EstadisticaGui getEstadisticaGui() {
		return estadisticaGui;
	}

	public void setEstadisticaGui(EstadisticaGui estadisticaGui) {
		this.estadisticaGui = estadisticaGui;
	}

	public SimulacionGui getSimulGui() {
		return simulGui;
	}

	public void setSimulGui(SimulacionGui simulGui) {
		this.simulGui = simulGui;
	}
}

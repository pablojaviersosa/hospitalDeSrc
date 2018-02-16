package main.java.com.pablo.simhospital.gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
//TODO
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import main.java.com.pablo.simhospital.configuracion.Configuracion;
import javax.swing.ImageIcon;

public class SimulacionGui {
	/* SimulacionGui */
	private JPanel sala, menu, contenedorBoxes, contenedorFila,
			contenedorFilaPacientes;
	/* Menu */
	private JTextPane txt_ContPacientes, txt_ContDoctores, txt_ContMuertos;
	private JTextPane txt_TiempoMin, txt_TiempoMax, txt_PacienteMin,
			txt_PacienteMax, txt_TotalMin, txt_TotalMax;
	private JTextPane txt_BarraTiempo, txt_TiempoHs, txt_BarraPacientes,
			txt_BarraTotal, txt_TotalPorcentaje;
	private JProgressBar barraTiempo, barraPacientes, barraTotal;
	private JPanel contenedorBotones;
	private JButton btn_Estadistica;
	private JButton btn_Stop;
	private JTextPane txt_Titulo;
	private JPanel contenedorPaciente;
	private JLabel ic_pacientes;
	private JTextPane txt_puntos_pacientes;
	private JPanel contenedorDoc;
	private JLabel ic_doctores;
	private JTextPane txt_puntos_doctores;
	private JPanel contenedorMuertos;
	private JLabel ic_muertos;
	private JTextPane txt_puntos_muertos;
	private JPanel contenedorBarraTiempo;
	private JPanel contenedorBarraPacientes;
	private JPanel contenedorBarraTotal;

	public SimulacionGui(Configuracion config) {

		/************************************************/
		/* Columna derecha - Menu */
		menu = new JPanel();
		menu.setBounds(599, 0, 206, 574);
		menu.setBackground(new Color(152, 152, 152));
		menu.setLayout(null);
		menu.setVisible(false);
		// TODO
		// frmHospital.getContentPane().add(menu);

		txt_Titulo = new JTextPane();
		txt_Titulo.setEnabled(false);
		txt_Titulo.setFont(config.getFuentes().getInderBold40());
		txt_Titulo.setText(config.getIdioma().getTituloHospitalMsj());
		txt_Titulo.setDisabledTextColor(Color.BLACK);
		txt_Titulo.setEditable(false);
		txt_Titulo.setBounds(0, 12, 190, 60);
		txt_Titulo.setBackground(null);
		menu.add(txt_Titulo);

		/* Paciente */
		contenedorPaciente = new JPanel();
		contenedorPaciente.setBounds(5, 70, 185, 62);
		contenedorPaciente.setLayout(null);
		contenedorPaciente.setBackground(null);
		menu.add(contenedorPaciente);

		ic_pacientes = new JLabel();
		ic_pacientes.setBounds(0, 0, 51, 62);
		ic_pacientes.setIcon(new ImageIcon(SimulacionGui.class
				.getResource("/main/recursos/iconos/ic_paciente.png")));
		contenedorPaciente.add(ic_pacientes);

		txt_puntos_pacientes = new JTextPane();
		txt_puntos_pacientes.setText(":");
		txt_puntos_pacientes.setFont(config.getFuentes().getInderBold40());
		txt_puntos_pacientes.setBounds(65, 0, 18, 62);
		txt_puntos_pacientes.setDisabledTextColor(Color.BLACK);
		txt_puntos_pacientes.setEnabled(false);
		txt_puntos_pacientes.setEditable(false);
		txt_puntos_pacientes.setBackground(null);
		contenedorPaciente.add(txt_puntos_pacientes);

		txt_ContPacientes = new JTextPane();
		txt_ContPacientes.setEditable(false);
		txt_ContPacientes.setEnabled(false);
		txt_ContPacientes.setDisabledTextColor(Color.BLACK);
		txt_ContPacientes.setText("0");
		txt_ContPacientes.setBounds(90, 12, 90, 38);
		txt_ContPacientes.setFont(config.getFuentes().getInderBold25());
		txt_ContPacientes.setBackground(null);
		contenedorPaciente.add(txt_ContPacientes);

		/* Doctor */
		contenedorDoc = new JPanel();
		contenedorDoc.setBounds(5, 140, 185, 62);
		contenedorDoc.setLayout(null);
		contenedorDoc.setBackground(null);
		menu.add(contenedorDoc);

		ic_doctores = new JLabel();
		ic_doctores.setIcon(new ImageIcon(SimulacionGui.class
				.getResource("/main/recursos/iconos/ic_doc.png")));
		ic_doctores.setBounds(0, 0, 51, 62);
		contenedorDoc.add(ic_doctores);

		txt_puntos_doctores = new JTextPane();
		txt_puntos_doctores.setText(":");
		txt_puntos_doctores.setFont(config.getFuentes().getInderBold40());
		txt_puntos_doctores.setBounds(65, 0, 18, 62);
		txt_puntos_doctores.setDisabledTextColor(Color.BLACK);
		txt_puntos_doctores.setEnabled(false);
		txt_puntos_doctores.setEditable(false);
		txt_puntos_doctores.setBackground(null);
		contenedorDoc.add(txt_puntos_doctores);

		txt_ContDoctores = new JTextPane();
		txt_ContDoctores.setEditable(false);
		txt_ContDoctores.setEnabled(false);
		txt_ContDoctores.setDisabledTextColor(Color.BLACK);
		txt_ContDoctores.setText("0");
		txt_ContDoctores.setBounds(90, 12, 90, 38);
		txt_ContDoctores.setFont(config.getFuentes().getInderBold25());
		txt_ContDoctores.setBackground(null);
		contenedorDoc.add(txt_ContDoctores);

		/* Muertos */
		contenedorMuertos = new JPanel();
		contenedorMuertos.setBounds(5, 210, 185, 62);
		contenedorMuertos.setLayout(null);
		contenedorMuertos.setBackground(null);
		menu.add(contenedorMuertos);

		ic_muertos = new JLabel();
		ic_muertos.setIcon((ImageIcon) config.getIconos().getIconMuertos());
		ic_muertos.setBounds(0, 0, 61, 62);
		contenedorMuertos.add(ic_muertos);

		txt_puntos_muertos = new JTextPane();
		txt_puntos_muertos.setText(":");
		txt_puntos_muertos.setFont(config.getFuentes().getInderBold40());
		txt_puntos_muertos.setBounds(65, 0, 18, 62);
		txt_puntos_muertos.setDisabledTextColor(Color.BLACK);
		txt_puntos_muertos.setEnabled(false);
		txt_puntos_muertos.setEditable(false);
		txt_puntos_muertos.setBackground(null);
		contenedorMuertos.add(txt_puntos_muertos);

		txt_ContMuertos = new JTextPane();
		txt_ContMuertos.setEditable(false);
		txt_ContMuertos.setEnabled(false);
		txt_ContMuertos.setDisabledTextColor(Color.BLACK);
		txt_ContMuertos.setText("0");
		txt_ContMuertos.setBounds(90, 12, 90, 38);
		txt_ContMuertos.setFont(config.getFuentes().getInderBold25());
		txt_ContMuertos.setBackground(null);
		contenedorMuertos.add(txt_ContMuertos);

		/* Barra Tiempo */
		contenedorBarraTiempo = new JPanel();
		contenedorBarraTiempo.setBounds(0, 280, 190, 85);
		contenedorBarraTiempo.setBackground(null);
		contenedorBarraTiempo.setLayout(null);
		menu.add(contenedorBarraTiempo);

		txt_BarraTiempo = new JTextPane();
		txt_BarraTiempo.setEditable(false);
		txt_BarraTiempo.setEnabled(false);
		txt_BarraTiempo.setDisabledTextColor(Color.BLACK);
		txt_BarraTiempo.setText(config.getIdioma().getTiempoMsj());
		txt_BarraTiempo.setFont(config.getFuentes().getInderBold20());
		txt_BarraTiempo.setBounds(0, 0, 85, 32);
		txt_BarraTiempo.setBackground(null);
		contenedorBarraTiempo.add(txt_BarraTiempo);

		txt_TiempoHs = new JTextPane();
		txt_TiempoHs.setEditable(false);
		txt_TiempoHs.setEnabled(false);
		txt_TiempoHs.setDisabledTextColor(Color.BLACK);
		txt_TiempoHs.setText(config.getIdioma().getHsMsj());
		txt_TiempoHs.setFont(config.getFuentes().getInderBold15());
		txt_TiempoHs.setBounds(85, 5, 40, 27);
		txt_TiempoHs.setBackground(null);
		contenedorBarraTiempo.add(txt_TiempoHs);

		barraTiempo = new JProgressBar();
		barraTiempo.setBorder(new LineBorder(Color.BLACK, 1));
		barraTiempo.setForeground(new Color(82, 82, 82));
		barraTiempo.setBounds(5, 35, 180, 30);
		contenedorBarraTiempo.add(barraTiempo);

		txt_TiempoMin = new JTextPane();
		txt_TiempoMin.setEditable(false);
		txt_TiempoMin.setEnabled(false);
		txt_TiempoMin.setDisabledTextColor(Color.BLACK);
		txt_TiempoMin.setBounds(0, 67, 40, 17);
		txt_TiempoMin.setFont(config.getFuentes().getInderBold10());
		txt_TiempoMin.setText("16:00");
		txt_TiempoMin.setBackground(null);
		contenedorBarraTiempo.add(txt_TiempoMin);

		txt_TiempoMax = new JTextPane();
		txt_TiempoMax.setEditable(false);
		txt_TiempoMax.setEnabled(false);
		txt_TiempoMax.setDisabledTextColor(Color.BLACK);
		txt_TiempoMax.setBounds(143, 67, 42, 17);
		txt_TiempoMax.setFont(config.getFuentes().getInderBold10());
		txt_TiempoMax.setText("18:00");
		txt_TiempoMax.setBackground(null);
		contenedorBarraTiempo.add(txt_TiempoMax);

		/* Barra Pacientes */
		contenedorBarraPacientes = new JPanel();
		contenedorBarraPacientes.setBounds(0, 370, 190, 85);
		contenedorBarraPacientes.setBackground(null);
		getMenu().add(contenedorBarraPacientes);
		contenedorBarraPacientes.setLayout(null);

		txt_BarraPacientes = new JTextPane();
		txt_BarraPacientes.setEditable(false);
		txt_BarraPacientes.setEnabled(false);
		txt_BarraPacientes.setDisabledTextColor(Color.BLACK);
		txt_BarraPacientes.setText(config.getIdioma().getPacientesMsj());
		txt_BarraPacientes.setFont(config.getFuentes().getInderBold20());
		txt_BarraPacientes.setBounds(0, 0, 110, 32);
		txt_BarraPacientes.setBackground(null);
		contenedorBarraPacientes.add(txt_BarraPacientes);

		barraPacientes = new JProgressBar();
		barraPacientes.setBorder(new LineBorder(Color.BLACK, 1));
		barraPacientes.setForeground(new Color(82, 82, 82));
		barraPacientes.setStringPainted(true);
		barraPacientes.setBounds(5, 35, 180, 30);
		barraPacientes.setMaximum(0);
		barraPacientes.setMinimum(0);
		contenedorBarraPacientes.add(barraPacientes);

		txt_PacienteMin = new JTextPane();
		txt_PacienteMin.setForeground(Color.BLACK);
		txt_PacienteMin.setEditable(false);
		txt_PacienteMin.setBounds(0, 67, 15, 17);
		txt_PacienteMin.setFont(config.getFuentes().getInderBold10());
		txt_PacienteMin.setText("0");
		txt_PacienteMin.setBackground(null);
		contenedorBarraPacientes.add(txt_PacienteMin);

		txt_PacienteMax = new JTextPane();
		txt_PacienteMax.setText("0");
		txt_PacienteMax.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txt_PacienteMax.setForeground(Color.BLACK);
		txt_PacienteMax.setEditable(false);
		txt_PacienteMax.setBounds(160, 67, 28, 17);
		txt_PacienteMax.setFont(config.getFuentes().getInderBold10());
		txt_PacienteMax.setBackground(null);
		contenedorBarraPacientes.add(txt_PacienteMax);

		/* Barra Total */
		contenedorBarraTotal = new JPanel();
		contenedorBarraTotal.setBounds(0, 460, 190, 85);
		contenedorBarraTotal.setBackground(null);
		getMenu().add(contenedorBarraTotal);
		contenedorBarraTotal.setLayout(null);

		txt_BarraTotal = new JTextPane();
		txt_BarraTotal.setEditable(false);
		txt_BarraTotal.setEnabled(false);
		txt_BarraTotal.setDisabledTextColor(Color.BLACK);
		txt_BarraTotal.setText(config.getIdioma().getTotalMsj());
		txt_BarraTotal.setFont(config.getFuentes().getInderBold20());
		txt_BarraTotal.setBounds(0, 0, 70, 32);
		txt_BarraTotal.setBackground(null);
		contenedorBarraTotal.add(txt_BarraTotal);

		txt_TotalPorcentaje = new JTextPane();
		txt_TotalPorcentaje.setEnabled(false);
		txt_TotalPorcentaje.setEditable(false);
		txt_TotalPorcentaje.setEnabled(false);
		txt_TotalPorcentaje.setDisabledTextColor(Color.BLACK);
		txt_TotalPorcentaje.setForeground(Color.BLACK);
		txt_TotalPorcentaje.setText(config.getIdioma().getPorcentajeMsj());
		txt_TotalPorcentaje.setFont(config.getFuentes().getInderBold15());
		txt_TotalPorcentaje.setBounds(70, 5, 40, 27);
		txt_TotalPorcentaje.setBackground(null);
		contenedorBarraTotal.add(txt_TotalPorcentaje);

		barraTotal = new JProgressBar();
		barraTotal.setValue(0);
		barraTotal.setMinimum(0);
		barraTotal.setMaximum(100);
		barraTotal.setForeground(new Color(82, 82, 82));
		barraTotal.setBorder(new LineBorder(Color.BLACK, 1));
		barraTotal.setBounds(5, 35, 180, 30);
		contenedorBarraTotal.add(barraTotal);

		txt_TotalMin = new JTextPane();
		txt_TotalMin.setForeground(Color.BLACK);
		txt_TotalMin.setEditable(false);
		txt_TotalMin.setText("0");
		txt_TotalMin.setFont(new Font("Inder", Font.BOLD, 10));
		txt_TotalMin.setBounds(0, 67, 35, 17);
		txt_TotalMin.setBackground(null);
		contenedorBarraTotal.add(txt_TotalMin);

		txt_TotalMax = new JTextPane();
		txt_TotalMax.setForeground(Color.BLACK);
		txt_TotalMax.setEditable(false);
		txt_TotalMax.setText("100");
		txt_TotalMax.setFont(new Font("Inder", Font.BOLD, 10));
		txt_TotalMax.setBounds(160, 67, 27, 17);
		txt_TotalMax.setBackground(null);
		contenedorBarraTotal.add(txt_TotalMax);

		/* Fin - ColDer */
		/* Columna izq - sala */
		sala = new JPanel();
		sala.setBounds(0, 0, 599, 574);
		sala.setBackground(new Color(203, 203, 203));
		sala.setVisible(false);
		sala.setLayout(null);
		// TODO listo
		// frmHospital.getContentPane().add(sala);

		contenedorFila = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(Color.BLACK);
				// g.drawLine(400, 0, 400,50);
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(3));
				// baranda izquierda
				g2.draw(new Line2D.Float(420, 0, 420, 100));
				g2.draw(new Line2D.Float(420, 100, 50, 100));
				g2.draw(new Line2D.Float(50, 100, 50, 215));
				g2.draw(new Line2D.Float(50, 215, 400, 215));
				g2.draw(new Line2D.Float(400, 215, 400, 230));

				// baranda derecha
				g2.draw(new Line2D.Float(470, 0, 470, 150));
				g2.draw(new Line2D.Float(470, 150, 100, 150));
				g2.draw(new Line2D.Float(100, 150, 100, 165));
				g2.draw(new Line2D.Float(100, 165, 450, 165));
				g2.draw(new Line2D.Float(450, 165, 450, 230));
			}
		};
		contenedorFila.setBounds(0, 200, 600, 374);
		contenedorFila.setBackground(null);
		contenedorFila.setLayout(null);
		sala.add(contenedorFila);

		contenedorFilaPacientes = new JPanel();
		contenedorFilaPacientes.setBounds(1, 0, 598, 372);
		contenedorFilaPacientes.setBackground(new Color(100, 100, 100, 0));
		contenedorFilaPacientes.setLayout(null);
		contenedorFila.add(contenedorFilaPacientes);

		contenedorBoxes = new JPanel();
		contenedorBoxes.setBounds(0, 0, 600, 350);
		contenedorBoxes.setBackground(null);
		contenedorBoxes.setLayout(null);
		sala.add(contenedorBoxes);

		/* Botones */
		contenedorBotones = new JPanel();
		contenedorBotones.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		contenedorBotones.setBounds(388, 500, 192, 62);
		contenedorBotones.setBackground(null);
		sala.add(contenedorBotones);

		btn_Estadistica = new JButton();
		btn_Estadistica.setIcon(config.getIconos().getIconEsadistica());
		btn_Estadistica.setToolTipText(config.getIdioma()
				.getBtnEstadisticaAyudaMsj());
		btn_Estadistica.setBackground(null);
		btn_Estadistica.setBorderPainted(false);
		btn_Estadistica.setFocusPainted(false);
		btn_Estadistica.setContentAreaFilled(false);// para q no cambie de color
													// al clickear
		btn_Estadistica.setFocusable(false);
		btn_Estadistica.setBorder(null);
		// TODO LISTO
		// btn_Estadistica.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseReleased(MouseEvent e) {
		// if (estado == estadoApp.CORRIENDO) {
		// estadisticaPopUp.setVisible(true);
		// estado = estadoApp.ESTADISTICA;
		// }
		// }
		// });
		contenedorBotones.add(btn_Estadistica);

		btn_Stop = new JButton();
		btn_Stop.setIcon(config.getIconos().getIconStop());
		btn_Stop.setToolTipText(config.getIdioma().getBtnStopAyudaMsj());
		btn_Stop.setBackground(null);
		btn_Stop.setBorderPainted(false);
		btn_Stop.setFocusPainted(false);
		btn_Stop.setContentAreaFilled(false);
		btn_Stop.setFocusable(false);
		btn_Stop.setBorder(null);
		// Stop de simulacion ---------------------------------Listo
		// btn_Stop.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseReleased(MouseEvent e) {
		// if (estado == estadoApp.CORRIENDO) {
		// try {
		// sim.stop();
		// } catch (InterruptedException e1) {
		// log.fatal("No puedo parar!");
		// }
		// estado = estadoApp.CONFIGURACION;
		// configuracionPopUp.setVisible(true);
		// menu.setVisible(false);//ojo
		// sala.setVisible(false);
		// }
		// }
		// });
		contenedorBotones.add(btn_Stop);
		/* Fin - Columna Izquierda */

	}

	public JPanel getSala() {
		return sala;
	}

	public void setSala(JPanel sala) {
		this.sala = sala;
	}

	public JPanel getMenu() {
		return menu;
	}

	public void setMenu(JPanel menu) {
		this.menu = menu;
	}

	public JPanel getContenedorBoxes() {
		return contenedorBoxes;
	}

	public void setContenedorBoxes(JPanel contenedorBoxes) {
		this.contenedorBoxes = contenedorBoxes;
	}

	public JPanel getContenedorFila() {
		return contenedorFila;
	}

	public void setContenedorFila(JPanel contenedorFila) {
		this.contenedorFila = contenedorFila;
	}

	public JPanel getContenedorFilaPacientes() {
		return contenedorFilaPacientes;
	}

	public void setContenedorFilaPacientes(JPanel contenedorFilaPacientes) {
		this.contenedorFilaPacientes = contenedorFilaPacientes;
	}

	public JTextPane getTxt_ContPacientes() {
		return txt_ContPacientes;
	}

	public void setTxt_ContPacientes(JTextPane txt_ContPacientes) {
		this.txt_ContPacientes = txt_ContPacientes;
	}

	public JTextPane getTxt_ContDoctores() {
		return txt_ContDoctores;
	}

	public void setTxt_ContDoctores(JTextPane txt_ContDoctores) {
		this.txt_ContDoctores = txt_ContDoctores;
	}

	public JTextPane getTxt_ContMuertos() {
		return txt_ContMuertos;
	}

	public void setTxt_ContMuertos(JTextPane txt_ContMuertos) {
		this.txt_ContMuertos = txt_ContMuertos;
	}

	public JTextPane getTxt_TiempoMin() {
		return txt_TiempoMin;
	}

	public void setTxt_TiempoMin(JTextPane txt_TiempoMin) {
		this.txt_TiempoMin = txt_TiempoMin;
	}

	public JTextPane getTxt_TiempoMax() {
		return txt_TiempoMax;
	}

	public void setTxt_TiempoMax(JTextPane txt_TiempoMax) {
		this.txt_TiempoMax = txt_TiempoMax;
	}

	public JTextPane getTxt_PacienteMin() {
		return txt_PacienteMin;
	}

	public void setTxt_PacienteMin(JTextPane txt_PacienteMin) {
		this.txt_PacienteMin = txt_PacienteMin;
	}

	public JTextPane getTxt_PacienteMax() {
		return txt_PacienteMax;
	}

	public void setTxt_PacienteMax(JTextPane txt_PacienteMax) {
		this.txt_PacienteMax = txt_PacienteMax;
	}

	public JTextPane getTxt_TotalMin() {
		return txt_TotalMin;
	}

	public void setTxt_TotalMin(JTextPane txt_TotalMin) {
		this.txt_TotalMin = txt_TotalMin;
	}

	public JTextPane getTxt_TotalMax() {
		return txt_TotalMax;
	}

	public void setTxt_TotalMax(JTextPane txt_TotalMax) {
		this.txt_TotalMax = txt_TotalMax;
	}

	public JTextPane getTxt_BarraTiempo() {
		return txt_BarraTiempo;
	}

	public void setTxt_BarraTiempo(JTextPane txt_BarraTiempo) {
		this.txt_BarraTiempo = txt_BarraTiempo;
	}

	public JTextPane getTxt_TiempoHs() {
		return txt_TiempoHs;
	}

	public void setTxt_TiempoHs(JTextPane txt_TiempoHs) {
		this.txt_TiempoHs = txt_TiempoHs;
	}

	public JTextPane getTxt_BarraPacientes() {
		return txt_BarraPacientes;
	}

	public void setTxt_BarraPacientes(JTextPane txt_BarraPacientes) {
		this.txt_BarraPacientes = txt_BarraPacientes;
	}

	public JTextPane getTxt_BarraTotal() {
		return txt_BarraTotal;
	}

	public void setTxt_BarraTotal(JTextPane txt_BarraTotal) {
		this.txt_BarraTotal = txt_BarraTotal;
	}

	public JTextPane getTxt_TotalPorcentaje() {
		return txt_TotalPorcentaje;
	}

	public void setTxt_TotalPorcentaje(JTextPane txt_TotalPorcentaje) {
		this.txt_TotalPorcentaje = txt_TotalPorcentaje;
	}

	public JProgressBar getBarraTiempo() {
		return barraTiempo;
	}

	public void setBarraTiempo(JProgressBar barraTiempo) {
		this.barraTiempo = barraTiempo;
	}

	public JProgressBar getBarraPacientes() {
		return barraPacientes;
	}

	public void setBarraPacientes(JProgressBar barraPacientes) {
		this.barraPacientes = barraPacientes;
	}

	public JProgressBar getBarraTotal() {
		return barraTotal;
	}

	public void setBarraTotal(JProgressBar barraTotal) {
		this.barraTotal = barraTotal;
	}

	public JPanel getContenedorBotones() {
		return contenedorBotones;
	}

	public void setContenedorBotones(JPanel contenedorBotones) {
		this.contenedorBotones = contenedorBotones;
	}

	public JButton getBtn_Estadistica() {
		return btn_Estadistica;
	}

	public void setBtn_Estadistica(JButton btn_Estadistica) {
		this.btn_Estadistica = btn_Estadistica;
	}

	public JButton getBtn_Stop() {
		return btn_Stop;
	}

	public void setBtn_Stop(JButton btn_Stop) {
		this.btn_Stop = btn_Stop;
	}

	public JTextPane getTxt_Titulo() {
		return txt_Titulo;
	}

	public void setTxt_Titulo(JTextPane txt_Titulo) {
		this.txt_Titulo = txt_Titulo;
	}

	public JPanel getContenedorPaciente() {
		return contenedorPaciente;
	}

	public void setContenedorPaciente(JPanel contenedorPaciente) {
		this.contenedorPaciente = contenedorPaciente;
	}

	public JLabel getIc_pacientes() {
		return ic_pacientes;
	}

	public void setIc_pacientes(JLabel ic_pacientes) {
		this.ic_pacientes = ic_pacientes;
	}

	public JTextPane getTxt_puntos_pacientes() {
		return txt_puntos_pacientes;
	}

	public void setTxt_puntos_pacientes(JTextPane txt_puntos_pacientes) {
		this.txt_puntos_pacientes = txt_puntos_pacientes;
	}

	public JPanel getContenedorDoc() {
		return contenedorDoc;
	}

	public void setContenedorDoc(JPanel contenedorDoc) {
		this.contenedorDoc = contenedorDoc;
	}

	public JLabel getIc_doctores() {
		return ic_doctores;
	}

	public void setIc_doctores(JLabel ic_doctores) {
		this.ic_doctores = ic_doctores;
	}

	public JTextPane getTxt_puntos_doctores() {
		return txt_puntos_doctores;
	}

	public void setTxt_puntos_doctores(JTextPane txt_puntos_doctores) {
		this.txt_puntos_doctores = txt_puntos_doctores;
	}

	public JPanel getContenedorMuertos() {
		return contenedorMuertos;
	}

	public void setContenedorMuertos(JPanel contenedorMuertos) {
		this.contenedorMuertos = contenedorMuertos;
	}

	public JLabel getIc_muertos() {
		return ic_muertos;
	}

	public void setIc_muertos(JLabel ic_muertos) {
		this.ic_muertos = ic_muertos;
	}

	public JTextPane getTxt_puntos_muertos() {
		return txt_puntos_muertos;
	}

	public void setTxt_puntos_muertos(JTextPane txt_puntos_muertos) {
		this.txt_puntos_muertos = txt_puntos_muertos;
	}

	public JPanel getContenedorBarraTiempo() {
		return contenedorBarraTiempo;
	}

	public void setContenedorBarraTiempo(JPanel contenedorBarraTiempo) {
		this.contenedorBarraTiempo = contenedorBarraTiempo;
	}

	public JPanel getContenedorBarraPacientes() {
		return contenedorBarraPacientes;
	}

	public void setContenedorBarraPacientes(JPanel contenedorBarraPacientes) {
		this.contenedorBarraPacientes = contenedorBarraPacientes;
	}

	public JPanel getContenedorBarraTotal() {
		return contenedorBarraTotal;
	}

	public void setContenedorBarraTotal(JPanel contenedorBarraTotal) {
		this.contenedorBarraTotal = contenedorBarraTotal;
	}

}

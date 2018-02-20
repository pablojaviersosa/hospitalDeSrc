package main.java.com.pablo.simhospital.gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import main.java.com.pablo.simhospital.configuracion.Configuracion;
import main.java.com.pablo.simhospital.configuracion.IdiomaGui;
import main.java.com.pablo.simhospital.configuracion.ValoresPorDefectoGui;

public class ConfiguracionGui {
	/* ConfigGui */
	private JPanel configuracionPopUp;
	private JTextPane txt_ConfCantidadDoc, txt_ConfHoraInicio, txt_ConfHoraFin,
			txt_ConfResultadoPorcentajeMin, txt_ConfResultadoVelocidad;
	private JTextField txt_Conf_HsInicio, txt_Conf_MinInicio, txt_Conf_HsFin,
			txt_Conf_MinFin;
	private JSpinner selectorConfCantidadDoc;
	private JSlider selectorConfPorcentajeMin, selectorConfVelocidad;
	private JButton btnLog, btnPlay;
	private JPanel contenedorConfVelocidad;
	private JTextPane txt_ConfVelocidad;
	private JTextPane txt_ConfPorcentajeMin;
	private JPanel contenedorConfPorcentajeMinuto;
	private JTextPane txt_ConfHsFin_puntos;
	private JPanel contenedorConfTxtHsFin;
	private JTextPane txt_ConfHsInicio_puntos;
	private JPanel contenedorConfTxtHsInicio;
	private JTextPane txt_TituloConfig;
	private JPanel contenedorConfTxtCantDoc;

	public ConfiguracionGui(Configuracion config) {
		/* Configuracion */
		configuracionPopUp = new JPanel();
		configuracionPopUp.setBounds(100, 50, 600, 440);
		configuracionPopUp.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		configuracionPopUp.setBackground(new Color(232, 232, 232));
		configuracionPopUp.setLayout(null);
		
		txt_TituloConfig = new JTextPane();
		txt_TituloConfig.setForeground(Color.BLACK);
		txt_TituloConfig.setEditable(false);
		txt_TituloConfig.setText(IdiomaGui.getTituloConfiguracionMsj());
		txt_TituloConfig.setFont(config.getFuentes().getFontInderBold30());
		txt_TituloConfig.setBackground(null);
		txt_TituloConfig.setBounds(90, 20, 225, 45);
		configuracionPopUp.add(txt_TituloConfig);

		/* Cantidad de Doctores */
		contenedorConfTxtCantDoc = new JPanel();
		contenedorConfTxtCantDoc.setBorder(null);
		contenedorConfTxtCantDoc.setBackground(null);
		contenedorConfTxtCantDoc.setBounds(45, 90, 415, 35);
		configuracionPopUp.add(contenedorConfTxtCantDoc);
		contenedorConfTxtCantDoc.setLayout(null);

		txt_ConfCantidadDoc = new JTextPane();
		txt_ConfCantidadDoc.setBounds(0, 0, 360, 35);
		txt_ConfCantidadDoc.setText(IdiomaGui.getCantidadDeDoctoresMsj());
		txt_ConfCantidadDoc.setForeground(Color.BLACK);
		txt_ConfCantidadDoc.setBackground(null);
		txt_ConfCantidadDoc.setEditable(false);
		txt_ConfCantidadDoc.setFont(config.getFuentes().getFontInderBold20());
		contenedorConfTxtCantDoc.add(txt_ConfCantidadDoc);

		selectorConfCantidadDoc = new JSpinner();
		selectorConfCantidadDoc.setBackground(null);
		selectorConfCantidadDoc.setBounds(360, 0, 50, 35);
		selectorConfCantidadDoc.setModel(new SpinnerNumberModel(ValoresPorDefectoGui.getDocDefault(), ValoresPorDefectoGui.getDocMin(), ValoresPorDefectoGui.getDocMax(), 1));
		selectorConfCantidadDoc.setMinimumSize(new Dimension(30, 20));
		selectorConfCantidadDoc.setPreferredSize(new Dimension(30, 20));
		selectorConfCantidadDoc.setFont(config.getFuentes().getFontInderBold20());
		contenedorConfTxtCantDoc.add(selectorConfCantidadDoc);

		/* Hs inicio */
		contenedorConfTxtHsInicio = new JPanel();
		contenedorConfTxtHsInicio.setBounds(45, 140, 250, 35);
		contenedorConfTxtHsInicio.setBackground(null);
		configuracionPopUp.add(contenedorConfTxtHsInicio);
		contenedorConfTxtHsInicio.setLayout(null);

		txt_ConfHoraInicio = new JTextPane();
		txt_ConfHoraInicio.setText(IdiomaGui.getHoraDeInicioMsj());
		txt_ConfHoraInicio.setForeground(Color.BLACK);
		txt_ConfHoraInicio.setBackground(null);
		txt_ConfHoraInicio.setEditable(false);
		txt_ConfHoraInicio.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfHoraInicio.setBounds(0, 0, 160, 35);
		contenedorConfTxtHsInicio.add(txt_ConfHoraInicio);

		txt_Conf_HsInicio = new JTextField();
		txt_Conf_HsInicio.setText("06");
		txt_Conf_HsInicio.setForeground(Color.BLACK);
		txt_Conf_HsInicio.setFont(config.getFuentes().getFontInderBold20());
		txt_Conf_HsInicio.setBounds(165, 0, 35, 35);
		contenedorConfTxtHsInicio.add(txt_Conf_HsInicio);

		txt_ConfHsInicio_puntos = new JTextPane();
		txt_ConfHsInicio_puntos.setText(":");
		txt_ConfHsInicio_puntos.setEditable(false);
		txt_ConfHsInicio_puntos.setBackground(null);
		txt_ConfHsInicio_puntos.setForeground(Color.BLACK);
		txt_ConfHsInicio_puntos.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfHsInicio_puntos.setBounds(200, 0, 15, 35);
		contenedorConfTxtHsInicio.add(txt_ConfHsInicio_puntos);

		txt_Conf_MinInicio = new JTextField();
		txt_Conf_MinInicio.setText("00");
		txt_Conf_MinInicio.setForeground(Color.BLACK);
		txt_Conf_MinInicio.setFont(config.getFuentes().getFontInderBold20());
		txt_Conf_MinInicio.setBounds(215, 0, 35, 35);
		contenedorConfTxtHsInicio.add(txt_Conf_MinInicio);

		/* Hs Fin */
		contenedorConfTxtHsFin = new JPanel();
		contenedorConfTxtHsFin.setBounds(45, 190, 250, 35);
		contenedorConfTxtHsFin.setBackground(null);
		configuracionPopUp.add(contenedorConfTxtHsFin);
		contenedorConfTxtHsFin.setLayout(null);

		txt_ConfHoraFin = new JTextPane();
		txt_ConfHoraFin.setText("Hora de Fin:");
		txt_ConfHoraFin.setForeground(Color.BLACK);
		txt_ConfHoraFin.setBackground(null);
		txt_ConfHoraFin.setEditable(false);
		txt_ConfHoraFin.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfHoraFin.setBounds(0, 0, 160, 35);
		contenedorConfTxtHsFin.add(txt_ConfHoraFin);

		txt_Conf_HsFin = new JTextField();
		txt_Conf_HsFin.setText("18");
		txt_Conf_HsFin.setForeground(Color.BLACK);
		txt_Conf_HsFin.setFont(config.getFuentes().getFontInderBold20());
		txt_Conf_HsFin.setBounds(165, 0, 35, 35);
		contenedorConfTxtHsFin.add(txt_Conf_HsFin);

		txt_ConfHsFin_puntos = txt_ConfHoraFin;
		txt_ConfHsFin_puntos.setText(":");
		txt_ConfHsFin_puntos.setEditable(false);
		txt_ConfHsFin_puntos.setBackground(null);
		txt_ConfHsFin_puntos.setForeground(Color.BLACK);
		txt_ConfHsFin_puntos.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfHsFin_puntos.setBounds(200, 0, 15, 35);
		contenedorConfTxtHsFin.add(txt_ConfHsFin_puntos);

		txt_Conf_MinFin = new JTextField();
		txt_Conf_MinFin.setText("00");
		txt_Conf_MinFin.setForeground(Color.BLACK);
		txt_Conf_MinFin.setFont(config.getFuentes().getFontInderBold20());
		txt_Conf_MinFin.setBounds(215, 0, 35, 35);
		contenedorConfTxtHsFin.add(txt_Conf_MinFin);

		/* % por minuto */
		contenedorConfPorcentajeMinuto = new JPanel();
		contenedorConfPorcentajeMinuto.setBounds(45, 250, 440, 70);
		contenedorConfPorcentajeMinuto.setBackground(null);
		contenedorConfPorcentajeMinuto.setLayout(null);
		configuracionPopUp.add(contenedorConfPorcentajeMinuto);

		txt_ConfPorcentajeMin = new JTextPane();
		txt_ConfPorcentajeMin.setEditable(false);
		txt_ConfPorcentajeMin.setText(IdiomaGui
				.getPorcentajaPacientesMinMsj());
		txt_ConfPorcentajeMin.setForeground(Color.BLACK);
		txt_ConfPorcentajeMin.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfPorcentajeMin.setBackground(null);
		txt_ConfPorcentajeMin.setBounds(0, 0, 400, 35);
		contenedorConfPorcentajeMinuto.add(txt_ConfPorcentajeMin);

		txt_ConfResultadoPorcentajeMin = new JTextPane();
		txt_ConfResultadoPorcentajeMin.setText(ValoresPorDefectoGui
				.getPorcentajePacientesPorMinutoStr());
		txt_ConfResultadoPorcentajeMin.setEditable(false);
		txt_ConfResultadoPorcentajeMin.setBackground(null);
		txt_ConfResultadoPorcentajeMin.setForeground(Color.BLACK);
		txt_ConfResultadoPorcentajeMin.setFont(config.getFuentes()
				.getFontInderBold20());
		txt_ConfResultadoPorcentajeMin.setBounds(410, 0, 45, 35);
		contenedorConfPorcentajeMinuto.add(txt_ConfResultadoPorcentajeMin);

		selectorConfPorcentajeMin = new JSlider();
		selectorConfPorcentajeMin.setMaximum(100);
		selectorConfPorcentajeMin.setMinimum(1);
		selectorConfPorcentajeMin.setValue(20);
		selectorConfPorcentajeMin.setBackground(null);
		selectorConfPorcentajeMin.setBounds(5, 35, 425, 35);
		selectorConfPorcentajeMin.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txt_ConfResultadoPorcentajeMin.setText(""
						+ selectorConfPorcentajeMin.getValue());
			}
		});
		contenedorConfPorcentajeMinuto.add(selectorConfPorcentajeMin);

		/* Velocidad */
		contenedorConfVelocidad = new JPanel();
		contenedorConfVelocidad.setBounds(45, 340, 425, 70);
		contenedorConfVelocidad.setBackground(null);
		contenedorConfVelocidad.setLayout(null);
		configuracionPopUp.add(contenedorConfVelocidad);

		txt_ConfVelocidad = new JTextPane();
		txt_ConfVelocidad.setEditable(false);
		txt_ConfVelocidad.setText(IdiomaGui.getVelocidadMsj());
		txt_ConfVelocidad.setForeground(Color.BLACK);
		txt_ConfVelocidad.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfVelocidad.setBackground(null);
		txt_ConfVelocidad.setBounds(0, 0, 120, 35);
		contenedorConfVelocidad.add(txt_ConfVelocidad);

		txt_ConfResultadoVelocidad = new JTextPane();
		txt_ConfResultadoVelocidad.setText(ValoresPorDefectoGui
				.getVelocidadPorDefectoStr());
		txt_ConfResultadoVelocidad.setEditable(false);
		txt_ConfResultadoVelocidad.setBackground(null);
		txt_ConfResultadoVelocidad.setForeground(Color.BLACK);
		txt_ConfResultadoVelocidad
				.setFont(config.getFuentes().getFontInderBold20());
		txt_ConfResultadoVelocidad.setBounds(120, 0, 45, 35);
		contenedorConfVelocidad.add(txt_ConfResultadoVelocidad);

		selectorConfVelocidad = new JSlider();
		selectorConfVelocidad.setMaximum(99);
		selectorConfVelocidad.setMinimum(1);
		selectorConfVelocidad.setValue(60);
		selectorConfVelocidad.setBackground(null);
		selectorConfVelocidad.setBounds(5, 35, 415, 35);
		selectorConfVelocidad.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txt_ConfResultadoVelocidad.setText(""
						+ selectorConfVelocidad.getValue());
			}
		});
		contenedorConfVelocidad.add(selectorConfVelocidad);

		/* Boton */
		btnLog = new JButton();
		btnLog.setIcon(new ImageIcon(ConfiguracionGui.class
				.getResource("/main/recursos/iconos/btn_Log.png")));
		btnLog.setToolTipText(IdiomaGui.getBtnLogAyudaMsj());
		btnLog.setBackground(null);
		btnLog.setBorderPainted(false);
		btnLog.setFocusPainted(false);
		btnLog.setContentAreaFilled(false);
		btnLog.setFocusable(false);
		btnLog.setBorder(null);
		btnLog.setBounds(520, 315, 60, 55);
		configuracionPopUp.add(btnLog);

		btnPlay = new JButton();
		btnPlay.setIcon(config.getIconos().getIconPLay());
		btnPlay.setToolTipText(IdiomaGui.getBtnPlayAyudaMsj());
		btnPlay.setBackground(null);
		btnPlay.setBorderPainted(false);
		btnPlay.setFocusPainted(false);
		btnPlay.setContentAreaFilled(false);
		btnPlay.setFocusable(false);
		btnPlay.setBorder(null);
		btnPlay.setBounds(520, 370, 60, 55);
		configuracionPopUp.add(btnPlay);
		/* Fin configuracion */
	}

	public JPanel getConfiguracionPopUp() {
		return configuracionPopUp;
	}

	public void setConfiguracionPopUp(JPanel configuracionPopUp) {
		this.configuracionPopUp = configuracionPopUp;
	}

	public JTextPane getTxt_ConfCantidadDoc() {
		return txt_ConfCantidadDoc;
	}

	public void setTxt_ConfCantidadDoc(JTextPane txt_ConfCantidadDoc) {
		this.txt_ConfCantidadDoc = txt_ConfCantidadDoc;
	}

	public JTextPane getTxt_ConfHoraInicio() {
		return txt_ConfHoraInicio;
	}

	public void setTxt_ConfHoraInicio(JTextPane txt_ConfHoraInicio) {
		this.txt_ConfHoraInicio = txt_ConfHoraInicio;
	}

	public JTextPane getTxt_ConfHoraFin() {
		return txt_ConfHoraFin;
	}

	public void setTxt_ConfHoraFin(JTextPane txt_ConfHoraFin) {
		this.txt_ConfHoraFin = txt_ConfHoraFin;
	}

	public JTextPane getTxt_ConfResultadoPorcentajeMin() {
		return txt_ConfResultadoPorcentajeMin;
	}

	public void setTxt_ConfResultadoPorcentajeMin(
			JTextPane txt_ConfResultadoPorcentajeMin) {
		this.txt_ConfResultadoPorcentajeMin = txt_ConfResultadoPorcentajeMin;
	}

	public JTextPane getTxt_ConfResultadoVelocidad() {
		return txt_ConfResultadoVelocidad;
	}

	public void setTxt_ConfResultadoVelocidad(
			JTextPane txt_ConfResultadoVelocidad) {
		this.txt_ConfResultadoVelocidad = txt_ConfResultadoVelocidad;
	}

	public JTextField getTxt_Conf_HsInicio() {
		return txt_Conf_HsInicio;
	}

	public void setTxt_Conf_HsInicio(JTextField txt_Conf_HsInicio) {
		this.txt_Conf_HsInicio = txt_Conf_HsInicio;
	}

	public JTextField getTxt_Conf_MinInicio() {
		return txt_Conf_MinInicio;
	}

	public void setTxt_Conf_MinInicio(JTextField txt_Conf_MinInicio) {
		this.txt_Conf_MinInicio = txt_Conf_MinInicio;
	}

	public JTextField getTxt_Conf_HsFin() {
		return txt_Conf_HsFin;
	}

	public void setTxt_Conf_HsFin(JTextField txt_Conf_HsFin) {
		this.txt_Conf_HsFin = txt_Conf_HsFin;
	}

	public JTextField getTxt_Conf_MinFin() {
		return txt_Conf_MinFin;
	}

	public void setTxt_Conf_MinFin(JTextField txt_Conf_MinFin) {
		this.txt_Conf_MinFin = txt_Conf_MinFin;
	}

	public JSpinner getSelectorConfCantidadDoc() {
		return selectorConfCantidadDoc;
	}

	public void setSelectorConfCantidadDoc(JSpinner selectorConfCantidadDoc) {
		this.selectorConfCantidadDoc = selectorConfCantidadDoc;
	}

	public JSlider getSelectorConfPorcentajeMin() {
		return selectorConfPorcentajeMin;
	}

	public void setSelectorConfPorcentajeMin(JSlider selectorConfPorcentajeMin) {
		this.selectorConfPorcentajeMin = selectorConfPorcentajeMin;
	}

	public JSlider getSelectorConfVelocidad() {
		return selectorConfVelocidad;
	}

	public void setSelectorConfVelocidad(JSlider selectorConfVelocidad) {
		this.selectorConfVelocidad = selectorConfVelocidad;
	}

	public JButton getBtnLog() {
		return btnLog;
	}

	public void setBtnLog(JButton btnLog) {
		this.btnLog = btnLog;
	}

	public JButton getBtnPlay() {
		return btnPlay;
	}

	public void setBtnPlay(JButton btnPlay) {
		this.btnPlay = btnPlay;
	}

	public JPanel getContenedorConfVelocidad() {
		return contenedorConfVelocidad;
	}

	public void setContenedorConfVelocidad(JPanel contenedorConfVelocidad) {
		this.contenedorConfVelocidad = contenedorConfVelocidad;
	}

	public JTextPane getTxt_ConfVelocidad() {
		return txt_ConfVelocidad;
	}

	public void setTxt_ConfVelocidad(JTextPane txt_ConfVelocidad) {
		this.txt_ConfVelocidad = txt_ConfVelocidad;
	}

	public JTextPane getTxt_ConfPorcentajeMin() {
		return txt_ConfPorcentajeMin;
	}

	public void setTxt_ConfPorcentajeMin(JTextPane txt_ConfPorcentajeMin) {
		this.txt_ConfPorcentajeMin = txt_ConfPorcentajeMin;
	}

	public JPanel getContenedorConfPorcentajeMinuto() {
		return contenedorConfPorcentajeMinuto;
	}

	public void setContenedorConfPorcentajeMinuto(
			JPanel contenedorConfPorcentajeMinuto) {
		this.contenedorConfPorcentajeMinuto = contenedorConfPorcentajeMinuto;
	}

	public JTextPane getTxt_ConfHsFin_puntos() {
		return txt_ConfHsFin_puntos;
	}

	public void setTxt_ConfHsFin_puntos(JTextPane txt_ConfHsFin_puntos) {
		this.txt_ConfHsFin_puntos = txt_ConfHsFin_puntos;
	}

	public JPanel getContenedorConfTxtHsFin() {
		return contenedorConfTxtHsFin;
	}

	public void setContenedorConfTxtHsFin(JPanel contenedorConfTxtHsFin) {
		this.contenedorConfTxtHsFin = contenedorConfTxtHsFin;
	}

	public JTextPane getTxt_ConfHsInicio_puntos() {
		return txt_ConfHsInicio_puntos;
	}

	public void setTxt_ConfHsInicio_puntos(JTextPane txt_ConfHsInicio_puntos) {
		this.txt_ConfHsInicio_puntos = txt_ConfHsInicio_puntos;
	}

	public JPanel getContenedorConfTxtHsInicio() {
		return contenedorConfTxtHsInicio;
	}

	public void setContenedorConfTxtHsInicio(JPanel contenedorConfTxtHsInicio) {
		this.contenedorConfTxtHsInicio = contenedorConfTxtHsInicio;
	}

	public JTextPane getTxt_TituloConfig() {
		return txt_TituloConfig;
	}

	public void setTxt_TituloConfig(JTextPane txt_TituloConfig) {
		this.txt_TituloConfig = txt_TituloConfig;
	}

	public JPanel getContenedorConfTxtCantDoc() {
		return contenedorConfTxtCantDoc;
	}

	public void setContenedorConfTxtCantDoc(JPanel contenedorConfTxtCantDoc) {
		this.contenedorConfTxtCantDoc = contenedorConfTxtCantDoc;
	}

}

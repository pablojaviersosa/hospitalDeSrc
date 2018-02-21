package main.java.com.pablo.simhospital.gui;

import java.awt.Color;
// Pasar control
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import main.java.com.pablo.simhospital.configuracion.Configuracion;
import main.java.com.pablo.simhospital.configuracion.IdiomaGui;

public class EstadisticaGui {

	/* Estadistica */
	private JPanel estadisticaPopUp, contendorEstadisticaHora,
			contenedorEstadHsInicio, contenedorEstadHsFin,
			ContendorEstadisticaCantidadDoc,
			ContendorEstadisticasPacientesAlta,
			ContendorEstadisticasPacientesMuertos,
			ContendorEstadisticasEsperaPromedio,
			ContendorEstadisticasPacientesFila,
			ContendorEstadisticasPacientesMedia,
			ContendorEstadisticasTiempoEsperaTotal,
			ContendorEstadisticasAtencionPromedio,
			ContendorEstadisticasPacientesBaja,
			ContendorEstadisticasPacientesTotales, contenedorEstadHsActual;
	private JTextPane txt_EstadTituloEstadistica,
			txt_Resultado_EstadCantidadDoc,
			txt_Resultado_EstadPacientesTotales,
			txt_Resultado_EstadPacientesAlta,
			txt_Resultado_EstadPacientesMedia,
			txt_Resultado_EstadPacientesBaja,
			txt_Resultado_EstadPacientesMuertos,
			txt_Resultado_EstadPacientesFila,
			txt_Resultado_EstadEsperaPromedio,
			txt_Resultado_EstadAtencionPromedio, txt_EstadHoraFin,
			txt_EstadHoraActual, txt_Estad_CantidadDoc,
			txt_Resultado_EstadTiempoEsperaTotal, txt_EstadHoraInicio,
			txt_Resultado_EstadHoraInicio, txt_Estad_PacientesTotales,
			txt_Estad_PacientesAlta, txt_Estad_PacientesMedia,
			txt_Estad_PacientesBaja, txt_Estad_PacientesMuertos,
			txt_Estad_PacientesFila, txt_Estad_AtencionPromedio,
			txt_Estad_EsperaPromedio, txt_Estad_TiempoEsperaTotal,
			txt_Resultado_EstadHoraFin, txt_Resultado_EstadHoraActual;

	private JButton btn_Back;

	public EstadisticaGui(Configuracion config) {
		/* Estadisticas */
		estadisticaPopUp = new JPanel();
		estadisticaPopUp.setBounds(100, 50, 600, 440);
		estadisticaPopUp.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		estadisticaPopUp.setBackground(new Color(232, 232, 232));
		estadisticaPopUp.setLayout(null);
		estadisticaPopUp.setVisible(false);
		
		txt_EstadTituloEstadistica = new JTextPane();
		txt_EstadTituloEstadistica.setText(IdiomaGui
				.getTituloEstadisticaMsj());
		txt_EstadTituloEstadistica
				.setFont(config.getFuentes().getFontInderBold30());
		txt_EstadTituloEstadistica.setForeground(Color.BLACK);
		txt_EstadTituloEstadistica.setEditable(false);
		txt_EstadTituloEstadistica.setBackground(null);
		txt_EstadTituloEstadistica.setBounds(90, 20, 180, 45);
		estadisticaPopUp.add(txt_EstadTituloEstadistica);

		contendorEstadisticaHora = new JPanel();
		contendorEstadisticaHora.setBounds(375, 90, 210, 85);
		contendorEstadisticaHora.setBackground(null);
		contendorEstadisticaHora.setLayout(null);
		estadisticaPopUp.add(contendorEstadisticaHora);

		/* Hs inicio */
		contenedorEstadHsInicio = new JPanel();
		contenedorEstadHsInicio.setBounds(0, 0, 210, 25);
		contenedorEstadHsInicio.setBackground(null);
		contenedorEstadHsInicio.setLayout(null);
		contendorEstadisticaHora.add(contenedorEstadHsInicio);

		txt_EstadHoraInicio = new JTextPane();
		txt_EstadHoraInicio.setText(IdiomaGui.getHoraDeInicioMsj());
		txt_EstadHoraInicio.setForeground(Color.BLACK);
		txt_EstadHoraInicio.setBackground(null);
		txt_EstadHoraInicio.setEditable(false);
		txt_EstadHoraInicio.setFont(config.getFuentes().getFontInderBold15());
		txt_EstadHoraInicio.setBounds(0, 0, 140, 25);
		contenedorEstadHsInicio.add(txt_EstadHoraInicio);

		txt_Resultado_EstadHoraInicio = new JTextPane();
		txt_Resultado_EstadHoraInicio.setText("06:00");
		txt_Resultado_EstadHoraInicio.setForeground(Color.BLACK);
		txt_Resultado_EstadHoraInicio.setBounds(140, 0, 70, 25);
		txt_Resultado_EstadHoraInicio.setBackground(null);
		txt_Resultado_EstadHoraInicio.setEditable(false);
		txt_Resultado_EstadHoraInicio.setFont(config.getFuentes()
				.getFontInderBold15());
		contenedorEstadHsInicio.add(txt_Resultado_EstadHoraInicio);

		/* Hs fin */
		contenedorEstadHsFin = new JPanel();
		contenedorEstadHsFin.setBounds(0, 30, 210, 25);
		contenedorEstadHsFin.setBackground(null);
		contenedorEstadHsFin.setLayout(null);
		contendorEstadisticaHora.add(contenedorEstadHsFin);

		txt_EstadHoraFin = new JTextPane();
		txt_EstadHoraFin.setText("Hora de fin:");
		txt_EstadHoraFin.setForeground(Color.BLACK);
		txt_EstadHoraFin.setBackground(null);
		txt_EstadHoraFin.setEditable(false);
		txt_EstadHoraFin.setFont(config.getFuentes().getFontInderBold15());
		txt_EstadHoraFin.setBounds(0, 0, 140, 25);
		contenedorEstadHsFin.add(txt_EstadHoraFin);

		txt_Resultado_EstadHoraFin = new JTextPane();
		txt_Resultado_EstadHoraFin.setText("18:00");
		txt_Resultado_EstadHoraFin.setForeground(Color.BLACK);
		txt_Resultado_EstadHoraFin.setBounds(140, 0, 70, 25);
		txt_Resultado_EstadHoraFin.setBackground(null);
		txt_Resultado_EstadHoraFin.setEditable(false);
		txt_Resultado_EstadHoraFin
				.setFont(config.getFuentes().getFontInderBold15());
		contenedorEstadHsFin.add(txt_Resultado_EstadHoraFin);

		/* Hs actual */
		contenedorEstadHsActual = new JPanel();
		contenedorEstadHsActual.setBounds(0, 60, 210, 25);
		contenedorEstadHsActual.setBackground(null);
		contenedorEstadHsActual.setLayout(null);
		contendorEstadisticaHora.add(contenedorEstadHsActual);

		txt_EstadHoraActual = new JTextPane();
		txt_EstadHoraActual.setText("Hora actual:");
		txt_EstadHoraActual.setForeground(Color.BLACK);
		txt_EstadHoraActual.setBackground(null);
		txt_EstadHoraActual.setEditable(false);
		txt_EstadHoraActual.setFont(config.getFuentes().getFontInderBold15());
		txt_EstadHoraActual.setBounds(0, 0, 140, 25);
		contenedorEstadHsActual.add(txt_EstadHoraActual);

		txt_Resultado_EstadHoraActual = new JTextPane();
		txt_Resultado_EstadHoraActual.setText("18:00");
		txt_Resultado_EstadHoraActual.setForeground(Color.BLACK);
		txt_Resultado_EstadHoraActual.setBounds(140, 0, 70, 25);
		txt_Resultado_EstadHoraActual.setBackground(null);
		txt_Resultado_EstadHoraActual.setEditable(false);
		txt_Resultado_EstadHoraActual.setFont(config.getFuentes()
				.getFontInderBold15());
		contenedorEstadHsActual.add(txt_Resultado_EstadHoraActual);

		ContendorEstadisticaCantidadDoc = new JPanel();
		ContendorEstadisticaCantidadDoc.setBounds(20, 90, 350, 25);
		ContendorEstadisticaCantidadDoc.setLayout(null);
		ContendorEstadisticaCantidadDoc.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticaCantidadDoc);

		/*-----------------------------*/
		txt_Estad_CantidadDoc = new JTextPane();
		txt_Estad_CantidadDoc.setBounds(0, 0, 300, 25);
		txt_Estad_CantidadDoc.setText("Cantidad de doctores:");
		txt_Estad_CantidadDoc.setForeground(Color.BLACK);
		txt_Estad_CantidadDoc.setBackground(null);
		txt_Estad_CantidadDoc.setEditable(false);
		txt_Estad_CantidadDoc.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticaCantidadDoc.add(txt_Estad_CantidadDoc);

		txt_Resultado_EstadCantidadDoc = new JTextPane();
		txt_Resultado_EstadCantidadDoc.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadCantidadDoc.setForeground(Color.BLACK);
		txt_Resultado_EstadCantidadDoc.setBackground(null);
		txt_Resultado_EstadCantidadDoc.setEditable(false);
		txt_Resultado_EstadCantidadDoc.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticaCantidadDoc.add(txt_Resultado_EstadCantidadDoc);

		ContendorEstadisticasPacientesTotales = new JPanel();
		ContendorEstadisticasPacientesTotales.setBounds(20, 120, 350, 25);
		ContendorEstadisticasPacientesTotales.setLayout(null);
		ContendorEstadisticasPacientesTotales.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasPacientesTotales);

		txt_Estad_PacientesTotales = new JTextPane();
		txt_Estad_PacientesTotales.setBounds(0, 0, 300, 25);
		txt_Estad_PacientesTotales.setText("Cantidad de pacientes atendidos:");
		txt_Estad_PacientesTotales.setForeground(Color.BLACK);
		txt_Estad_PacientesTotales.setBackground(null);
		txt_Estad_PacientesTotales.setEditable(false);
		txt_Estad_PacientesTotales
				.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasPacientesTotales.add(txt_Estad_PacientesTotales);

		txt_Resultado_EstadPacientesTotales = new JTextPane();
		txt_Resultado_EstadPacientesTotales.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadPacientesTotales.setForeground(Color.BLACK);
		txt_Resultado_EstadPacientesTotales.setBackground(null);
		txt_Resultado_EstadPacientesTotales.setEditable(false);
		txt_Resultado_EstadPacientesTotales.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasPacientesTotales
				.add(txt_Resultado_EstadPacientesTotales);

		ContendorEstadisticasPacientesAlta = new JPanel();
		ContendorEstadisticasPacientesAlta.setBounds(20, 150, 350, 25);
		ContendorEstadisticasPacientesAlta.setLayout(null);
		ContendorEstadisticasPacientesAlta.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasPacientesAlta);

		txt_Estad_PacientesAlta = new JTextPane();
		txt_Estad_PacientesAlta.setBounds(0, 0, 300, 25);
		txt_Estad_PacientesAlta.setText("Pacientes prioridad alta:");
		txt_Estad_PacientesAlta.setForeground(Color.BLACK);
		txt_Estad_PacientesAlta.setBackground(null);
		txt_Estad_PacientesAlta.setEditable(false);
		txt_Estad_PacientesAlta.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasPacientesAlta.add(txt_Estad_PacientesAlta);

		txt_Resultado_EstadPacientesAlta = new JTextPane();
		txt_Resultado_EstadPacientesAlta.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadPacientesAlta.setForeground(Color.BLACK);
		txt_Resultado_EstadPacientesAlta.setBackground(null);
		txt_Resultado_EstadPacientesAlta.setEditable(false);
		txt_Resultado_EstadPacientesAlta.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasPacientesAlta
				.add(txt_Resultado_EstadPacientesAlta);

		ContendorEstadisticasPacientesMedia = new JPanel();
		ContendorEstadisticasPacientesMedia.setBounds(20, 180, 350, 25);
		ContendorEstadisticasPacientesMedia.setLayout(null);
		ContendorEstadisticasPacientesMedia.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasPacientesMedia);

		txt_Estad_PacientesMedia = new JTextPane();
		txt_Estad_PacientesMedia.setBounds(0, 0, 300, 25);
		txt_Estad_PacientesMedia.setText("Pacientes prioridad media:");
		txt_Estad_PacientesMedia.setForeground(Color.BLACK);
		txt_Estad_PacientesMedia.setBackground(null);
		txt_Estad_PacientesMedia.setEditable(false);
		txt_Estad_PacientesMedia.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasPacientesMedia.add(txt_Estad_PacientesMedia);

		txt_Resultado_EstadPacientesMedia = new JTextPane();
		txt_Resultado_EstadPacientesMedia.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadPacientesMedia.setForeground(Color.BLACK);
		txt_Resultado_EstadPacientesMedia.setBackground(null);
		txt_Resultado_EstadPacientesMedia.setEditable(false);
		txt_Resultado_EstadPacientesMedia.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasPacientesMedia
				.add(txt_Resultado_EstadPacientesMedia);

		ContendorEstadisticasPacientesBaja = new JPanel();
		ContendorEstadisticasPacientesBaja.setBounds(20, 210, 350, 25);
		ContendorEstadisticasPacientesBaja.setLayout(null);
		ContendorEstadisticasPacientesBaja.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasPacientesBaja);

		txt_Estad_PacientesBaja = new JTextPane();
		txt_Estad_PacientesBaja.setBounds(0, 0, 300, 25);
		txt_Estad_PacientesBaja.setText("Pacientes prioridad baja:");
		txt_Estad_PacientesBaja.setForeground(Color.BLACK);
		txt_Estad_PacientesBaja.setBackground(null);
		txt_Estad_PacientesBaja.setEditable(false);
		txt_Estad_PacientesBaja.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasPacientesBaja.add(txt_Estad_PacientesBaja);

		txt_Resultado_EstadPacientesBaja = new JTextPane();
		txt_Resultado_EstadPacientesBaja.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadPacientesBaja.setForeground(Color.BLACK);
		txt_Resultado_EstadPacientesBaja.setBackground(null);
		txt_Resultado_EstadPacientesBaja.setEditable(false);
		txt_Resultado_EstadPacientesBaja.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasPacientesBaja
				.add(txt_Resultado_EstadPacientesBaja);

		ContendorEstadisticasPacientesMuertos = new JPanel();
		ContendorEstadisticasPacientesMuertos.setBounds(20, 240, 350, 25);
		ContendorEstadisticasPacientesMuertos.setLayout(null);
		ContendorEstadisticasPacientesMuertos.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasPacientesMuertos);

		txt_Estad_PacientesMuertos = new JTextPane();
		txt_Estad_PacientesMuertos.setBounds(0, 0, 300, 25);
		txt_Estad_PacientesMuertos.setText("Pacientes muertos:");
		txt_Estad_PacientesMuertos.setForeground(Color.BLACK);
		txt_Estad_PacientesMuertos.setBackground(null);
		txt_Estad_PacientesMuertos.setEditable(false);
		txt_Estad_PacientesMuertos
				.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasPacientesMuertos.add(txt_Estad_PacientesMuertos);

		txt_Resultado_EstadPacientesMuertos = new JTextPane();
		txt_Resultado_EstadPacientesMuertos.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadPacientesMuertos.setForeground(Color.BLACK);
		txt_Resultado_EstadPacientesMuertos.setBackground(null);
		txt_Resultado_EstadPacientesMuertos.setEditable(false);
		txt_Resultado_EstadPacientesMuertos.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasPacientesMuertos
				.add(txt_Resultado_EstadPacientesMuertos);

		ContendorEstadisticasPacientesFila = new JPanel();
		ContendorEstadisticasPacientesFila.setBounds(20, 270, 350, 25);
		ContendorEstadisticasPacientesFila.setLayout(null);
		ContendorEstadisticasPacientesFila.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasPacientesFila);

		txt_Estad_PacientesFila = new JTextPane();
		txt_Estad_PacientesFila.setBounds(0, 0, 300, 25);
		txt_Estad_PacientesFila.setText("Pacientes en la fila:");
		txt_Estad_PacientesFila.setForeground(Color.BLACK);
		txt_Estad_PacientesFila.setBackground(null);
		txt_Estad_PacientesFila.setEditable(false);
		txt_Estad_PacientesFila.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasPacientesFila.add(txt_Estad_PacientesFila);

		txt_Resultado_EstadPacientesFila = new JTextPane();
		txt_Resultado_EstadPacientesFila.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadPacientesFila.setForeground(Color.BLACK);
		txt_Resultado_EstadPacientesFila.setBackground(null);
		txt_Resultado_EstadPacientesFila.setEditable(false);
		txt_Resultado_EstadPacientesFila.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasPacientesFila
				.add(txt_Resultado_EstadPacientesFila);

		ContendorEstadisticasEsperaPromedio = new JPanel();
		ContendorEstadisticasEsperaPromedio.setBounds(20, 300, 350, 25);
		ContendorEstadisticasEsperaPromedio.setLayout(null);
		ContendorEstadisticasEsperaPromedio.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasEsperaPromedio);

		txt_Estad_EsperaPromedio = new JTextPane();
		txt_Estad_EsperaPromedio.setBounds(0, 0, 300, 25);
		txt_Estad_EsperaPromedio.setText("Espera promedio:");
		txt_Estad_EsperaPromedio.setForeground(Color.BLACK);
		txt_Estad_EsperaPromedio.setBackground(null);
		txt_Estad_EsperaPromedio.setEditable(false);
		txt_Estad_EsperaPromedio.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasEsperaPromedio.add(txt_Estad_EsperaPromedio);

		txt_Resultado_EstadEsperaPromedio = new JTextPane();
		txt_Resultado_EstadEsperaPromedio.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadEsperaPromedio.setForeground(Color.BLACK);
		txt_Resultado_EstadEsperaPromedio.setBackground(null);
		txt_Resultado_EstadEsperaPromedio.setEditable(false);
		txt_Resultado_EstadEsperaPromedio.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasEsperaPromedio
				.add(txt_Resultado_EstadEsperaPromedio);

		ContendorEstadisticasAtencionPromedio = new JPanel();
		ContendorEstadisticasAtencionPromedio.setBounds(20, 330, 350, 25);
		ContendorEstadisticasAtencionPromedio.setLayout(null);
		ContendorEstadisticasAtencionPromedio.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasAtencionPromedio);

		txt_Estad_AtencionPromedio = new JTextPane();
		txt_Estad_AtencionPromedio.setBounds(0, 0, 300, 25);
		txt_Estad_AtencionPromedio.setText("Atención promedio:");
		txt_Estad_AtencionPromedio.setForeground(Color.BLACK);
		txt_Estad_AtencionPromedio.setBackground(null);
		txt_Estad_AtencionPromedio.setEditable(false);
		txt_Estad_AtencionPromedio
				.setFont(config.getFuentes().getFontInderBold15());
		ContendorEstadisticasAtencionPromedio.add(txt_Estad_AtencionPromedio);

		txt_Resultado_EstadAtencionPromedio = new JTextPane();
		txt_Resultado_EstadAtencionPromedio.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadAtencionPromedio.setForeground(Color.BLACK);
		txt_Resultado_EstadAtencionPromedio.setBackground(null);
		txt_Resultado_EstadAtencionPromedio.setEditable(false);
		txt_Resultado_EstadAtencionPromedio.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasAtencionPromedio
				.add(txt_Resultado_EstadAtencionPromedio);

		ContendorEstadisticasTiempoEsperaTotal = new JPanel();
		ContendorEstadisticasTiempoEsperaTotal.setBounds(20, 360, 350, 25);
		ContendorEstadisticasTiempoEsperaTotal.setLayout(null);
		ContendorEstadisticasTiempoEsperaTotal.setBackground(null);
		estadisticaPopUp.add(ContendorEstadisticasTiempoEsperaTotal);

		txt_Estad_TiempoEsperaTotal = new JTextPane();
		txt_Estad_TiempoEsperaTotal.setBounds(0, 0, 300, 25);
		txt_Estad_TiempoEsperaTotal.setText("Tiempo espera total:");
		txt_Estad_TiempoEsperaTotal.setForeground(Color.BLACK);
		txt_Estad_TiempoEsperaTotal.setBackground(null);
		txt_Estad_TiempoEsperaTotal.setEditable(false);
		txt_Estad_TiempoEsperaTotal.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasTiempoEsperaTotal.add(txt_Estad_TiempoEsperaTotal);

		txt_Resultado_EstadTiempoEsperaTotal = new JTextPane();
		txt_Resultado_EstadTiempoEsperaTotal.setBounds(295, 0, 55, 25);
		txt_Resultado_EstadTiempoEsperaTotal.setForeground(Color.BLACK);
		txt_Resultado_EstadTiempoEsperaTotal.setBackground(null);
		txt_Resultado_EstadTiempoEsperaTotal.setEditable(false);
		txt_Resultado_EstadTiempoEsperaTotal.setFont(config.getFuentes()
				.getFontInderBold15());
		ContendorEstadisticasTiempoEsperaTotal
				.add(txt_Resultado_EstadTiempoEsperaTotal);

		/* Boton */
		btn_Back = new JButton();
		btn_Back.setIcon(config.getIconos().getIconBack());
//		btn_Back.setToolTipText(IdiomaGui.getBtnBackAyudaMsj());
		btn_Back.setBackground(null);
		btn_Back.setBorderPainted(false);
		btn_Back.setFocusPainted(false);
		btn_Back.setContentAreaFilled(false);
		btn_Back.setFocusable(false);
		btn_Back.setBorder(null);
		btn_Back.setBounds(520, 370, 60, 55);
		estadisticaPopUp.add(btn_Back);
		/**********************************************************************/
		/* Fin Estadisticas */

	}

	public JPanel getEstadisticaPopUp() {
		return estadisticaPopUp;
	}

	public void setEstadisticaPopUp(JPanel estadisticaPopUp) {
		this.estadisticaPopUp = estadisticaPopUp;
	}

	public JTextPane getTxt_Resultado_EstadCantidadDoc() {
		return txt_Resultado_EstadCantidadDoc;
	}

	public void setTxt_Resultado_EstadCantidadDoc(
			JTextPane txt_Resultado_EstadCantidadDoc) {
		this.txt_Resultado_EstadCantidadDoc = txt_Resultado_EstadCantidadDoc;
	}

	public JTextPane getTxt_Resultado_EstadPacientesTotales() {
		return txt_Resultado_EstadPacientesTotales;
	}

	public void setTxt_Resultado_EstadPacientesTotales(
			JTextPane txt_Resultado_EstadPacientesTotales) {
		this.txt_Resultado_EstadPacientesTotales = txt_Resultado_EstadPacientesTotales;
	}

	public JTextPane getTxt_Resultado_EstadPacientesAlta() {
		return txt_Resultado_EstadPacientesAlta;
	}

	public void setTxt_Resultado_EstadPacientesAlta(
			JTextPane txt_Resultado_EstadPacientesAlta) {
		this.txt_Resultado_EstadPacientesAlta = txt_Resultado_EstadPacientesAlta;
	}

	public JTextPane getTxt_Resultado_EstadPacientesMedia() {
		return txt_Resultado_EstadPacientesMedia;
	}

	public void setTxt_Resultado_EstadPacientesMedia(
			JTextPane txt_Resultado_EstadPacientesMedia) {
		this.txt_Resultado_EstadPacientesMedia = txt_Resultado_EstadPacientesMedia;
	}

	public JTextPane getTxt_Resultado_EstadPacientesBaja() {
		return txt_Resultado_EstadPacientesBaja;
	}

	public void setTxt_Resultado_EstadPacientesBaja(
			JTextPane txt_Resultado_EstadPacientesBaja) {
		this.txt_Resultado_EstadPacientesBaja = txt_Resultado_EstadPacientesBaja;
	}

	public JTextPane getTxt_Resultado_EstadPacientesMuertos() {
		return txt_Resultado_EstadPacientesMuertos;
	}

	public void setTxt_Resultado_EstadPacientesMuertos(
			JTextPane txt_Resultado_EstadPacientesMuertos) {
		this.txt_Resultado_EstadPacientesMuertos = txt_Resultado_EstadPacientesMuertos;
	}

	public JTextPane getTxt_Resultado_EstadPacientesFila() {
		return txt_Resultado_EstadPacientesFila;
	}

	public void setTxt_Resultado_EstadPacientesFila(
			JTextPane txt_Resultado_EstadPacientesFila) {
		this.txt_Resultado_EstadPacientesFila = txt_Resultado_EstadPacientesFila;
	}

	public JTextPane getTxt_Resultado_EstadEsperaPromedio() {
		return txt_Resultado_EstadEsperaPromedio;
	}

	public void setTxt_Resultado_EstadEsperaPromedio(
			JTextPane txt_Resultado_EstadEsperaPromedio) {
		this.txt_Resultado_EstadEsperaPromedio = txt_Resultado_EstadEsperaPromedio;
	}

	public JTextPane getTxt_Resultado_EstadAtencionPromedio() {
		return txt_Resultado_EstadAtencionPromedio;
	}

	public void setTxt_Resultado_EstadAtencionPromedio(
			JTextPane txt_Resultado_EstadAtencionPromedio) {
		this.txt_Resultado_EstadAtencionPromedio = txt_Resultado_EstadAtencionPromedio;
	}

	public JTextPane getTxt_Resultado_EstadTiempoEsperaTotal() {
		return txt_Resultado_EstadTiempoEsperaTotal;
	}

	public void setTxt_Resultado_EstadTiempoEsperaTotal(
			JTextPane txt_Resultado_EstadTiempoEsperaTotal) {
		this.txt_Resultado_EstadTiempoEsperaTotal = txt_Resultado_EstadTiempoEsperaTotal;
	}

	public JTextPane getTxt_Resultado_EstadHoraInicio() {
		return txt_Resultado_EstadHoraInicio;
	}

	public void setTxt_Resultado_EstadHoraInicio(
			JTextPane txt_Resultado_EstadHoraInicio) {
		this.txt_Resultado_EstadHoraInicio = txt_Resultado_EstadHoraInicio;
	}

	public JTextPane getTxt_Resultado_EstadHoraFin() {
		return txt_Resultado_EstadHoraFin;
	}

	public void setTxt_Resultado_EstadHoraFin(
			JTextPane txt_Resultado_EstadHoraFin) {
		this.txt_Resultado_EstadHoraFin = txt_Resultado_EstadHoraFin;
	}

	public JTextPane getTxt_Resultado_EstadHoraActual() {
		return txt_Resultado_EstadHoraActual;
	}

	public void setTxt_Resultado_EstadHoraActual(
			JTextPane txt_Resultado_EstadHoraActual) {
		this.txt_Resultado_EstadHoraActual = txt_Resultado_EstadHoraActual;
	}

	public JTextPane getTxt_EstadTituloEstadistica() {
		return txt_EstadTituloEstadistica;
	}

	public void setTxt_EstadTituloEstadistica(
			JTextPane txt_EstadTituloEstadistica) {
		this.txt_EstadTituloEstadistica = txt_EstadTituloEstadistica;
	}

	public JPanel getContendorEstadisticaHora() {
		return contendorEstadisticaHora;
	}

	public void setContendorEstadisticaHora(JPanel contendorEstadisticaHora) {
		this.contendorEstadisticaHora = contendorEstadisticaHora;
	}

	public JPanel getContenedorEstadHsInicio() {
		return contenedorEstadHsInicio;
	}

	public void setContenedorEstadHsInicio(JPanel contenedorEstadHsInicio) {
		this.contenedorEstadHsInicio = contenedorEstadHsInicio;
	}

	public JPanel getContenedorEstadHsFin() {
		return contenedorEstadHsFin;
	}

	public void setContenedorEstadHsFin(JPanel contenedorEstadHsFin) {
		this.contenedorEstadHsFin = contenedorEstadHsFin;
	}

	public JPanel getContendorEstadisticaCantidadDoc() {
		return ContendorEstadisticaCantidadDoc;
	}

	public void setContendorEstadisticaCantidadDoc(
			JPanel contendorEstadisticaCantidadDoc) {
		ContendorEstadisticaCantidadDoc = contendorEstadisticaCantidadDoc;
	}

	public JPanel getContendorEstadisticasPacientesAlta() {
		return ContendorEstadisticasPacientesAlta;
	}

	public void setContendorEstadisticasPacientesAlta(
			JPanel contendorEstadisticasPacientesAlta) {
		ContendorEstadisticasPacientesAlta = contendorEstadisticasPacientesAlta;
	}

	public JPanel getContendorEstadisticasPacientesMuertos() {
		return ContendorEstadisticasPacientesMuertos;
	}

	public void setContendorEstadisticasPacientesMuertos(
			JPanel contendorEstadisticasPacientesMuertos) {
		ContendorEstadisticasPacientesMuertos = contendorEstadisticasPacientesMuertos;
	}

	public JPanel getContendorEstadisticasEsperaPromedio() {
		return ContendorEstadisticasEsperaPromedio;
	}

	public void setContendorEstadisticasEsperaPromedio(
			JPanel contendorEstadisticasEsperaPromedio) {
		ContendorEstadisticasEsperaPromedio = contendorEstadisticasEsperaPromedio;
	}

	public JPanel getContendorEstadisticasPacientesFila() {
		return ContendorEstadisticasPacientesFila;
	}

	public void setContendorEstadisticasPacientesFila(
			JPanel contendorEstadisticasPacientesFila) {
		ContendorEstadisticasPacientesFila = contendorEstadisticasPacientesFila;
	}

	public JPanel getContendorEstadisticasPacientesMedia() {
		return ContendorEstadisticasPacientesMedia;
	}

	public void setContendorEstadisticasPacientesMedia(
			JPanel contendorEstadisticasPacientesMedia) {
		ContendorEstadisticasPacientesMedia = contendorEstadisticasPacientesMedia;
	}

	public JPanel getContendorEstadisticasTiempoEsperaTotal() {
		return ContendorEstadisticasTiempoEsperaTotal;
	}

	public void setContendorEstadisticasTiempoEsperaTotal(
			JPanel contendorEstadisticasTiempoEsperaTotal) {
		ContendorEstadisticasTiempoEsperaTotal = contendorEstadisticasTiempoEsperaTotal;
	}

	public JPanel getContendorEstadisticasAtencionPromedio() {
		return ContendorEstadisticasAtencionPromedio;
	}

	public void setContendorEstadisticasAtencionPromedio(
			JPanel contendorEstadisticasAtencionPromedio) {
		ContendorEstadisticasAtencionPromedio = contendorEstadisticasAtencionPromedio;
	}

	public JPanel getContendorEstadisticasPacientesBaja() {
		return ContendorEstadisticasPacientesBaja;
	}

	public void setContendorEstadisticasPacientesBaja(
			JPanel contendorEstadisticasPacientesBaja) {
		ContendorEstadisticasPacientesBaja = contendorEstadisticasPacientesBaja;
	}

	public JPanel getContendorEstadisticasPacientesTotales() {
		return ContendorEstadisticasPacientesTotales;
	}

	public void setContendorEstadisticasPacientesTotales(
			JPanel contendorEstadisticasPacientesTotales) {
		ContendorEstadisticasPacientesTotales = contendorEstadisticasPacientesTotales;
	}

	public JPanel getContenedorEstadHsActual() {
		return contenedorEstadHsActual;
	}

	public void setContenedorEstadHsActual(JPanel contenedorEstadHsActual) {
		this.contenedorEstadHsActual = contenedorEstadHsActual;
	}

	public JTextPane getTxt_EstadHoraFin() {
		return txt_EstadHoraFin;
	}

	public void setTxt_EstadHoraFin(JTextPane txt_EstadHoraFin) {
		this.txt_EstadHoraFin = txt_EstadHoraFin;
	}

	public JTextPane getTxt_EstadHoraActual() {
		return txt_EstadHoraActual;
	}

	public void setTxt_EstadHoraActual(JTextPane txt_EstadHoraActual) {
		this.txt_EstadHoraActual = txt_EstadHoraActual;
	}

	public JTextPane getTxt_Estad_CantidadDoc() {
		return txt_Estad_CantidadDoc;
	}

	public void setTxt_Estad_CantidadDoc(JTextPane txt_Estad_CantidadDoc) {
		this.txt_Estad_CantidadDoc = txt_Estad_CantidadDoc;
	}

	public JTextPane getTxt_EstadHoraInicio() {
		return txt_EstadHoraInicio;
	}

	public void setTxt_EstadHoraInicio(JTextPane txt_EstadHoraInicio) {
		this.txt_EstadHoraInicio = txt_EstadHoraInicio;
	}

	public JTextPane getTxt_Estad_PacientesTotales() {
		return txt_Estad_PacientesTotales;
	}

	public void setTxt_Estad_PacientesTotales(
			JTextPane txt_Estad_PacientesTotales) {
		this.txt_Estad_PacientesTotales = txt_Estad_PacientesTotales;
	}

	public JTextPane getTxt_Estad_PacientesAlta() {
		return txt_Estad_PacientesAlta;
	}

	public void setTxt_Estad_PacientesAlta(JTextPane txt_Estad_PacientesAlta) {
		this.txt_Estad_PacientesAlta = txt_Estad_PacientesAlta;
	}

	public JTextPane getTxt_Estad_PacientesMedia() {
		return txt_Estad_PacientesMedia;
	}

	public void setTxt_Estad_PacientesMedia(JTextPane txt_Estad_PacientesMedia) {
		this.txt_Estad_PacientesMedia = txt_Estad_PacientesMedia;
	}

	public JTextPane getTxt_Estad_PacientesBaja() {
		return txt_Estad_PacientesBaja;
	}

	public void setTxt_Estad_PacientesBaja(JTextPane txt_Estad_PacientesBaja) {
		this.txt_Estad_PacientesBaja = txt_Estad_PacientesBaja;
	}

	public JTextPane getTxt_Estad_PacientesMuertos() {
		return txt_Estad_PacientesMuertos;
	}

	public void setTxt_Estad_PacientesMuertos(
			JTextPane txt_Estad_PacientesMuertos) {
		this.txt_Estad_PacientesMuertos = txt_Estad_PacientesMuertos;
	}

	public JTextPane getTxt_Estad_PacientesFila() {
		return txt_Estad_PacientesFila;
	}

	public void setTxt_Estad_PacientesFila(JTextPane txt_Estad_PacientesFila) {
		this.txt_Estad_PacientesFila = txt_Estad_PacientesFila;
	}

	public JTextPane getTxt_Estad_AtencionPromedio() {
		return txt_Estad_AtencionPromedio;
	}

	public void setTxt_Estad_AtencionPromedio(
			JTextPane txt_Estad_AtencionPromedio) {
		this.txt_Estad_AtencionPromedio = txt_Estad_AtencionPromedio;
	}

	public JTextPane getTxt_Estad_EsperaPromedio() {
		return txt_Estad_EsperaPromedio;
	}

	public void setTxt_Estad_EsperaPromedio(JTextPane txt_Estad_EsperaPromedio) {
		this.txt_Estad_EsperaPromedio = txt_Estad_EsperaPromedio;
	}

	public JTextPane getTxt_Estad_TiempoEsperaTotal() {
		return txt_Estad_TiempoEsperaTotal;
	}

	public void setTxt_Estad_TiempoEsperaTotal(
			JTextPane txt_Estad_TiempoEsperaTotal) {
		this.txt_Estad_TiempoEsperaTotal = txt_Estad_TiempoEsperaTotal;
	}

	public JButton getBtn_Back() {
		return btn_Back;
	}

	public void setBtn_Back(JButton btn_Back) {
		this.btn_Back = btn_Back;
	}

}

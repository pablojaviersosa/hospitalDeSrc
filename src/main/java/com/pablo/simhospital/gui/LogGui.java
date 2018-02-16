package main.java.com.pablo.simhospital.gui;

import java.awt.Color;
//TODO pasar el control al controler
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

import main.java.com.pablo.simhospital.configuracion.Configuracion;

public class LogGui {
	/* Log */
	private JPanel logPopUp;
	private JTextPane txt_resultadoScrollLog;
	private JTextPane txt_TituloLog;
	private JScrollPane contenedorScroll_Log;
	private JButton btn_BackLog;

	public LogGui(Configuracion config) {
		/* Log */
		logPopUp = new JPanel();
		logPopUp.setVisible(false);
		logPopUp.setBounds(100, 50, 600, 440);
		logPopUp.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		logPopUp.setBackground(new Color(232, 232, 232));
		logPopUp.setLayout(null);
		// TODO Agregar el logPopUP al Jframe ----------------------Hecho
		// frmHospital.getContentPane().add(logPopUp);

		txt_TituloLog = new JTextPane();
		txt_TituloLog.setForeground(Color.BLACK);
		txt_TituloLog.setEditable(false);
		txt_TituloLog.setText(config.getIdioma().getTituloLogMsj());
		txt_TituloLog.setFont(config.getFuentes().getInderBold30());
		txt_TituloLog.setBackground(null);
		txt_TituloLog.setBounds(90, 20, 225, 45);
		logPopUp.add(txt_TituloLog);

		contenedorScroll_Log = new JScrollPane();
		contenedorScroll_Log
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contenedorScroll_Log.setBounds(20, 90, 560, 275);
		logPopUp.add(contenedorScroll_Log);

		txt_resultadoScrollLog = new JTextPane();
		txt_resultadoScrollLog.setEditable(false);
		txt_resultadoScrollLog.setBackground(null);
		txt_resultadoScrollLog.setDisabledTextColor(Color.BLACK);
		txt_resultadoScrollLog.setFont(config.getFuentes().getInderBold10());
		contenedorScroll_Log.setViewportView(txt_resultadoScrollLog);

		/* Boton back */
		btn_BackLog = new JButton();
		btn_BackLog.setIcon(config.getIconos().getIconBack());
		btn_BackLog.setToolTipText(config.getIdioma().getBtnBackAyudaMsj());
		btn_BackLog.setBackground(null);
		btn_BackLog.setBorderPainted(false);
		btn_BackLog.setFocusPainted(false);
		btn_BackLog.setContentAreaFilled(false);
		btn_BackLog.setFocusable(false);
		btn_BackLog.setBorder(null);
		btn_BackLog.setBounds(520, 370, 60, 55);
		// TODO Pasar al controlador listo!
		// back del log
		// btn_BackLog.addMouseListener(new MouseAdapter() {
		// @Override
		// public void mouseReleased(MouseEvent e) {
		// if (mainGui.getEstadoApp() == estadoApp.LOG) {
		// configGui.getConfiguracionPopUp().setVisible(true);
		// getLogPopUp().setVisible(false);
		// mainGui.setEstadoApp(estadoApp.CONFIGURACION);
		// }
		// }
		// });
		logPopUp.add(btn_BackLog);
		/* Fin Log */
	}

	public JPanel getLogPopUp() {
		return logPopUp;
	}

	public void setLogPopUp(JPanel logPopUp) {
		this.logPopUp = logPopUp;
	}

	public JTextPane getTxt_resultadoScrollLog() {
		return txt_resultadoScrollLog;
	}

	public void setTxt_resultadoScrollLog(JTextPane txt_resultadoScrollLog) {
		this.txt_resultadoScrollLog = txt_resultadoScrollLog;
	}

	public JTextPane getTxt_TituloLog() {
		return txt_TituloLog;
	}

	public void setTxt_TituloLog(JTextPane txt_TituloLog) {
		this.txt_TituloLog = txt_TituloLog;
	}

	public JScrollPane getContenedorScroll_Log() {
		return contenedorScroll_Log;
	}

	public void setContenedorScroll_Log(JScrollPane contenedorScroll_Log) {
		this.contenedorScroll_Log = contenedorScroll_Log;
	}

	public JButton getBtn_BackLog() {
		return btn_BackLog;
	}

	public void setBtn_BackLog(JButton btn_BackLog) {
		this.btn_BackLog = btn_BackLog;
	}

}

package main.java.com.pablo.simhospital.configuracion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import main.java.com.pablo.simhospital.gui.GuiHospital;
import main.java.com.pablo.simhospital.gui.SimulacionGui;

public class IconosGui {

	/* Nombres de los Iconos */
	private String iconLogStr = "btn_Log.png";
	private String iconPLayStr = "btn_Play.png";
	private String iconBackStr = "btn_Back.png";
	private String iconEsadisticaStr = "btn_Estadistica.png";
	private String iconStopStr = "btn_Stop.png";
	private String iconPacienteStr = "ic_paciente.png";
	private String iconPacienteFilaStr = "ic_paciente_fila.png";
	private String iconPacienteFilaVacioStr = "ic_paciente_fila_vacio.png";
	private String iconDocStr = "ic_doc.png";
	private String iconMuertosStr = "ic_muertos.png";
	private String iconBoxOcupadoStr = "boxOcupado.png";
	private String iconBoxLibreStr = "boxLibre.png";

	/**
	 * Iconos
	 **/
	// De EstadisticaGui
	private Icon iconLog;
	private Icon iconBack;
	// DeGuiHospital
	private Icon iconPLay;
	private Icon iconEsadistica;
	private Icon iconStop;
	private Icon iconPaciente;
	private Icon iconPacienteFila;
	private Icon iconPacienteFilaVacio;
	private Icon iconDoc;
	private Icon iconMuertos;
	private Icon iconBoxOcupado;
	private Icon iconBoxLibre;

	public IconosGui(String ruta_raiz_iconos) {
		// Carga todos los iconos de la gui
		Properties prop = new Properties();
		InputStream input = null;

		try {
			if (ruta_raiz_iconos == null) {
				ruta_raiz_iconos = " ";

			}
			ruta_raiz_iconos = new String(ruta_raiz_iconos
					+ "/main/config/iconos.properties").trim();
			if (GuiHospital.esJar.equals("SI")) {
				input = InputStream.class.getResourceAsStream(ruta_raiz_iconos);
			} else {
				input = new FileInputStream(ruta_raiz_iconos);
			}
			// load a properties file
			prop.load(input);

			setIconLog(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconLogStr"))));
			setIconBack(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconBackStr"))));
			setIconPLay(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconPLayStr"))));
			setIconEsadistica(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconEsadisticaStr"))));
			setIconStop(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconStopStr"))));
			setIconPaciente(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconPacienteStr"))));
			setIconPacienteFila(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconPacienteFilaStr"))));
			setIconDoc(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconDocStr"))));
			setIconMuertos(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconMuertosStr"))));
			setIconPacienteFilaVacio(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconPacienteFilaVacioStr"))));

			setIconBoxOcupado(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconBoxOcupadoStr"))));
			setIconBoxLibre(new ImageIcon(
					SimulacionGui.class.getResource("/main/recursos/iconos/"
							+ prop.getProperty("iconBoxLibreStr"))));
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Throwable e) {
			System.err.println(e);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public String getIconLogStr() {
		return iconLogStr;
	}

	public void setIconLogStr(String iconLogStr) {
		this.iconLogStr = iconLogStr;
	}

	public String getIconPLayStr() {
		return iconPLayStr;
	}

	public void setIconPLayStr(String iconPLayStr) {
		this.iconPLayStr = iconPLayStr;
	}

	public String getIconBackStr() {
		return iconBackStr;
	}

	public void setIconBackStr(String iconBackStr) {
		this.iconBackStr = iconBackStr;
	}

	public String getIconEsadisticaStr() {
		return iconEsadisticaStr;
	}

	public void setIconEsadisticaStr(String iconEsadisticaStr) {
		this.iconEsadisticaStr = iconEsadisticaStr;
	}

	public String getIconStopStr() {
		return iconStopStr;
	}

	public void setIconStopStr(String iconStopStr) {
		this.iconStopStr = iconStopStr;
	}

	public String getIconPacienteStr() {
		return iconPacienteStr;
	}

	public void setIconPacienteStr(String iconPacienteStr) {
		this.iconPacienteStr = iconPacienteStr;
	}

	public String getIconPacienteFilaStr() {
		return iconPacienteFilaStr;
	}

	public void setIconPacienteFilaStr(String iconPacienteFilaStr) {
		this.iconPacienteFilaStr = iconPacienteFilaStr;
	}

	public String getIconPacienteFilaVacioStr() {
		return iconPacienteFilaVacioStr;
	}

	public void setIconPacienteFilaVacioStr(String iconPacienteFilaVacioStr) {
		this.iconPacienteFilaVacioStr = iconPacienteFilaVacioStr;
	}

	public String getIconDocStr() {
		return iconDocStr;
	}

	public void setIconDocStr(String iconDocStr) {
		this.iconDocStr = iconDocStr;
	}

	public String getIconMuertosStr() {
		return iconMuertosStr;
	}

	public void setIconMuertosStr(String iconMuertosStr) {
		this.iconMuertosStr = iconMuertosStr;
	}

	public String getIconBoxOcupadoStr() {
		return iconBoxOcupadoStr;
	}

	public void setIconBoxOcupadoStr(String iconBoxOcupadoStr) {
		this.iconBoxOcupadoStr = iconBoxOcupadoStr;
	}

	public String getIconBoxLibreStr() {
		return iconBoxLibreStr;
	}

	public void setIconBoxLibreStr(String iconBoxLibreStr) {
		this.iconBoxLibreStr = iconBoxLibreStr;
	}

	public Icon getIconLog() {
		return iconLog;
	}

	public void setIconLog(Icon iconLog) {
		this.iconLog = iconLog;
	}

	public Icon getIconBack() {
		return iconBack;
	}

	public void setIconBack(Icon iconBack) {
		this.iconBack = iconBack;
	}

	public Icon getIconPLay() {
		return iconPLay;
	}

	public void setIconPLay(Icon iconPLay) {
		this.iconPLay = iconPLay;
	}

	public Icon getIconEsadistica() {
		return iconEsadistica;
	}

	public void setIconEsadistica(Icon iconEsadistica) {
		this.iconEsadistica = iconEsadistica;
	}

	public Icon getIconStop() {
		return iconStop;
	}

	public void setIconStop(Icon iconStop) {
		this.iconStop = iconStop;
	}

	public Icon getIconPaciente() {
		return iconPaciente;
	}

	public void setIconPaciente(Icon iconPaciente) {
		this.iconPaciente = iconPaciente;
	}

	public Icon getIconPacienteFila() {
		return iconPacienteFila;
	}

	public void setIconPacienteFila(Icon iconPacienteFila) {
		this.iconPacienteFila = iconPacienteFila;
	}

	public Icon getIconPacienteFilaVacio() {
		return iconPacienteFilaVacio;
	}

	public void setIconPacienteFilaVacio(Icon iconPacienteFilaVacio) {
		this.iconPacienteFilaVacio = iconPacienteFilaVacio;
	}

	public Icon getIconDoc() {
		return iconDoc;
	}

	public void setIconDoc(Icon iconDoc) {
		this.iconDoc = iconDoc;
	}

	public Icon getIconMuertos() {
		return iconMuertos;
	}

	public void setIconMuertos(Icon iconMuertos) {
		this.iconMuertos = iconMuertos;
	}

	public Icon getIconBoxOcupado() {
		return iconBoxOcupado;
	}

	public void setIconBoxOcupado(Icon iconBoxOcupado) {
		this.iconBoxOcupado = iconBoxOcupado;
	}

	public Icon getIconBoxLibre() {
		return iconBoxLibre;
	}

	public void setIconBoxLibre(Icon iconBoxLibre) {
		this.iconBoxLibre = iconBoxLibre;
	}
}
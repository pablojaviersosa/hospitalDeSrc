package main.java.com.pablo.simhospital.configuracion;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import main.java.com.pablo.simhospital.gui.SimulacionGui;

public class IconosGui {

	static String pathRecursoIconos;
	/* Nombres de los Iconos */
	static String iconLogStr;
	static String iconPLayStr;
	static String iconBackStr;
	static String iconEsadisticaStr;
	static String iconStopStr;
	static String iconPacienteStr;
	static String iconPacienteFilaStr;
	static String iconPacienteFilaVacioStr;
	static String iconDocStr;
	static String iconMuertosStr;
	static String iconBoxOcupadoStr;
	static String iconBoxLibreStr;

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

	public IconosGui() {
		load();
	}

	private void load() {
		setIconLog(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconLogStr())));
		setIconBack(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconBackStr())));
		setIconPLay(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconPLayStr())));
		setIconEsadistica(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconEsadisticaStr())));
		setIconStop(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconStopStr())));
		setIconPaciente(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconPacienteStr())));
		setIconPacienteFila(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconPacienteFilaStr())));
		setIconDoc(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconDocStr())));
		setIconMuertos(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconMuertosStr())));
		setIconPacienteFilaVacio(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconPacienteFilaVacioStr())));
		setIconBoxOcupado(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconBoxOcupadoStr())));
		setIconBoxLibre(new ImageIcon(
				SimulacionGui.class.getResource(getPathRecursoIconos()
						+ getIconBoxLibreStr())));
	}

	public String getIconLogStr() {
		return iconLogStr;
	}

	public void setIconLogStr(String iconLogStr) {
		IconosGui.iconLogStr = iconLogStr;
	}

	public String getIconPLayStr() {
		return iconPLayStr;
	}

	public void setIconPLayStr(String iconPLayStr) {
		IconosGui.iconPLayStr = iconPLayStr;
	}

	public String getIconBackStr() {
		return iconBackStr;
	}

	public void setIconBackStr(String iconBackStr) {
		IconosGui.iconBackStr = iconBackStr;
	}

	public String getIconEsadisticaStr() {
		return iconEsadisticaStr;
	}

	public void setIconEsadisticaStr(String iconEsadisticaStr) {
		IconosGui.iconEsadisticaStr = iconEsadisticaStr;
	}

	public String getIconStopStr() {
		return iconStopStr;
	}

	public void setIconStopStr(String iconStopStr) {
		IconosGui.iconStopStr = iconStopStr;
	}

	public String getIconPacienteStr() {
		return iconPacienteStr;
	}

	public void setIconPacienteStr(String iconPacienteStr) {
		IconosGui.iconPacienteStr = iconPacienteStr;
	}

	public String getIconPacienteFilaStr() {
		return iconPacienteFilaStr;
	}

	public void setIconPacienteFilaStr(String iconPacienteFilaStr) {
		IconosGui.iconPacienteFilaStr = iconPacienteFilaStr;
	}

	public String getIconPacienteFilaVacioStr() {
		return iconPacienteFilaVacioStr;
	}

	public void setIconPacienteFilaVacioStr(String iconPacienteFilaVacioStr) {
		IconosGui.iconPacienteFilaVacioStr = iconPacienteFilaVacioStr;
	}

	public String getIconDocStr() {
		return iconDocStr;
	}

	public void setIconDocStr(String iconDocStr) {
		IconosGui.iconDocStr = iconDocStr;
	}

	public String getIconMuertosStr() {
		return iconMuertosStr;
	}

	public void setIconMuertosStr(String iconMuertosStr) {
		IconosGui.iconMuertosStr = iconMuertosStr;
	}

	public String getIconBoxOcupadoStr() {
		return iconBoxOcupadoStr;
	}

	public void setIconBoxOcupadoStr(String iconBoxOcupadoStr) {
		IconosGui.iconBoxOcupadoStr = iconBoxOcupadoStr;
	}

	public String getIconBoxLibreStr() {
		return iconBoxLibreStr;
	}

	public void setIconBoxLibreStr(String iconBoxLibreStr) {
		IconosGui.iconBoxLibreStr = iconBoxLibreStr;
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

	public static String getPathRecursoIconos() {
		return pathRecursoIconos;
	}

	public static void setPathRecursoIconos(String pathRecursoIconos) {
		IconosGui.pathRecursoIconos = pathRecursoIconos;
	}
}
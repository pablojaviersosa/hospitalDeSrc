package main.java.com.pablo.simhospital.configuracion;

import java.awt.Font;
import java.util.Properties;

import javax.swing.Icon;

public class Constantes {
//	Rutas
	private Properties prop;
	private String pathUrgenciasStr;
	private String pathLog4jPropertiesStr;
	private String pathMusicaStr;
	private Font tipografia;
//	Fuentes
	private Font inderBold10 = null;
	private Font inderBold15 = null;
	private Font inderBold20 = null;
	private Font inderBold25 = null;
	private Font inderBold30 = null;
	private Font inderBold40 = null;
//	Nombres de los Iconos         
	private String iconLogStr;
	private String iconPLayStr;
	private String iconBackStr;
	private String iconEsadisticaStr;
	private String iconStopStr;
	private String iconPacienteStr;
	private String iconPacienteFilaStr;
	private String iconPacienteFilaVacioStr;
	private String iconDocStr;
	private String iconMuertosStr;
	private String iconBoxOcupadoStr;
	private String iconBoxLibreStr;
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
//	Titulo de la aplicacion
	private String TITULO_HOSPITAL_MSJ;
	private String CANTIDAD_DE_DOCTORES_MSJ;
//	Config
	private String TITULO_CONFIGURACION_MSJ;
	private String TIEMPO_MSJ;
	private String HS_MSJ;
	private String PACIENTES_MSJ;
	private String TOTAL_MSJ;
	private String PORCENTAJE_MSJ;
	private String HORA_DE_INICIO_MSJ;
//	Estadistica
	private String TITULO_ESTADISTICA_MSJ;
	private String PORCENTAJE_PACIENTES_MIN_MSJ;
	/* LOG */
	private String TITULO_LOG_MSJ;
//	BOTONES 
	private String BTN_PLAY_AYUDA_MSJ;
	private String BTN_STOP_AYUDA_MSJ;
	private String BTN_ESTADISTICA_AYUDA_MSJ;
	private String BTN_BACK_AYUDA_MSJ;
	private String BTN_LOG_AYUDA_MSJ;
	private String MAX_DOCTORES_MSJ;
	private String VELOCIDAD_MSJ;
	private String VELOCIDAD_POR_DEFECTO_MSJ;
	
	/* GUI */
	private int DocMin;
	private int DocMax;
	private int DocDefault;

	/* BOXES */
	private int altoBox;
	private int anchoBox;
	private int box_posY_A;
	private int box_posY_B;
	private String velocidadPorDefectoStr;
	private String porcentajePacientesPorMinutoStr;

	
	public Constantes() {
		// TODO Auto-generated constructor stub
	}


	public Properties getProp() {
		return prop;
	}


	public void setProp(Properties prop) {
		this.prop = prop;
	}


	public String getPathUrgenciasStr() {
		return pathUrgenciasStr;
	}


	public void setPathUrgenciasStr(String pathUrgenciasStr) {
		this.pathUrgenciasStr = pathUrgenciasStr;
	}


	public String getPathLog4jPropertiesStr() {
		return pathLog4jPropertiesStr;
	}


	public void setPathLog4jPropertiesStr(String pathLog4jPropertiesStr) {
		this.pathLog4jPropertiesStr = pathLog4jPropertiesStr;
	}


	public String getPathMusicaStr() {
		return pathMusicaStr;
	}


	public void setPathMusicaStr(String pathMusicaStr) {
		this.pathMusicaStr = pathMusicaStr;
	}


	public Font getTipografia() {
		return tipografia;
	}


	public void setTipografia(Font tipografia) {
		this.tipografia = tipografia;
	}


	public Font getInderBold10() {
		return inderBold10;
	}


	public void setInderBold10(Font inderBold10) {
		this.inderBold10 = inderBold10;
	}


	public Font getInderBold15() {
		return inderBold15;
	}


	public void setInderBold15(Font inderBold15) {
		this.inderBold15 = inderBold15;
	}


	public Font getInderBold20() {
		return inderBold20;
	}


	public void setInderBold20(Font inderBold20) {
		this.inderBold20 = inderBold20;
	}


	public Font getInderBold25() {
		return inderBold25;
	}


	public void setInderBold25(Font inderBold25) {
		this.inderBold25 = inderBold25;
	}


	public Font getInderBold30() {
		return inderBold30;
	}


	public void setInderBold30(Font inderBold30) {
		this.inderBold30 = inderBold30;
	}


	public Font getInderBold40() {
		return inderBold40;
	}


	public void setInderBold40(Font inderBold40) {
		this.inderBold40 = inderBold40;
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


	public String getTITULO_HOSPITAL_MSJ() {
		return TITULO_HOSPITAL_MSJ;
	}


	public void setTITULO_HOSPITAL_MSJ(String tITULO_HOSPITAL_MSJ) {
		TITULO_HOSPITAL_MSJ = tITULO_HOSPITAL_MSJ;
	}


	public String getCANTIDAD_DE_DOCTORES_MSJ() {
		return CANTIDAD_DE_DOCTORES_MSJ;
	}


	public void setCANTIDAD_DE_DOCTORES_MSJ(String cANTIDAD_DE_DOCTORES_MSJ) {
		CANTIDAD_DE_DOCTORES_MSJ = cANTIDAD_DE_DOCTORES_MSJ;
	}


	public String getTITULO_CONFIGURACION_MSJ() {
		return TITULO_CONFIGURACION_MSJ;
	}


	public void setTITULO_CONFIGURACION_MSJ(String tITULO_CONFIGURACION_MSJ) {
		TITULO_CONFIGURACION_MSJ = tITULO_CONFIGURACION_MSJ;
	}


	public String getTIEMPO_MSJ() {
		return TIEMPO_MSJ;
	}


	public void setTIEMPO_MSJ(String tIEMPO_MSJ) {
		TIEMPO_MSJ = tIEMPO_MSJ;
	}


	public String getHS_MSJ() {
		return HS_MSJ;
	}


	public void setHS_MSJ(String hS_MSJ) {
		HS_MSJ = hS_MSJ;
	}


	public String getPACIENTES_MSJ() {
		return PACIENTES_MSJ;
	}


	public void setPACIENTES_MSJ(String pACIENTES_MSJ) {
		PACIENTES_MSJ = pACIENTES_MSJ;
	}


	public String getTOTAL_MSJ() {
		return TOTAL_MSJ;
	}


	public void setTOTAL_MSJ(String tOTAL_MSJ) {
		TOTAL_MSJ = tOTAL_MSJ;
	}


	public String getPORCENTAJE_MSJ() {
		return PORCENTAJE_MSJ;
	}


	public void setPORCENTAJE_MSJ(String pORCENTAJE_MSJ) {
		PORCENTAJE_MSJ = pORCENTAJE_MSJ;
	}


	public String getHORA_DE_INICIO_MSJ() {
		return HORA_DE_INICIO_MSJ;
	}


	public void setHORA_DE_INICIO_MSJ(String hORA_DE_INICIO_MSJ) {
		HORA_DE_INICIO_MSJ = hORA_DE_INICIO_MSJ;
	}


	public String getTITULO_ESTADISTICA_MSJ() {
		return TITULO_ESTADISTICA_MSJ;
	}


	public void setTITULO_ESTADISTICA_MSJ(String tITULO_ESTADISTICA_MSJ) {
		TITULO_ESTADISTICA_MSJ = tITULO_ESTADISTICA_MSJ;
	}


	public String getPORCENTAJE_PACIENTES_MIN_MSJ() {
		return PORCENTAJE_PACIENTES_MIN_MSJ;
	}


	public void setPORCENTAJE_PACIENTES_MIN_MSJ(String pORCENTAJE_PACIENTES_MIN_MSJ) {
		PORCENTAJE_PACIENTES_MIN_MSJ = pORCENTAJE_PACIENTES_MIN_MSJ;
	}


	public String getTITULO_LOG_MSJ() {
		return TITULO_LOG_MSJ;
	}


	public void setTITULO_LOG_MSJ(String tITULO_LOG_MSJ) {
		TITULO_LOG_MSJ = tITULO_LOG_MSJ;
	}


	public String getBTN_PLAY_AYUDA_MSJ() {
		return BTN_PLAY_AYUDA_MSJ;
	}


	public void setBTN_PLAY_AYUDA_MSJ(String bTN_PLAY_AYUDA_MSJ) {
		BTN_PLAY_AYUDA_MSJ = bTN_PLAY_AYUDA_MSJ;
	}


	public String getBTN_STOP_AYUDA_MSJ() {
		return BTN_STOP_AYUDA_MSJ;
	}


	public void setBTN_STOP_AYUDA_MSJ(String bTN_STOP_AYUDA_MSJ) {
		BTN_STOP_AYUDA_MSJ = bTN_STOP_AYUDA_MSJ;
	}


	public String getBTN_ESTADISTICA_AYUDA_MSJ() {
		return BTN_ESTADISTICA_AYUDA_MSJ;
	}


	public void setBTN_ESTADISTICA_AYUDA_MSJ(String bTN_ESTADISTICA_AYUDA_MSJ) {
		BTN_ESTADISTICA_AYUDA_MSJ = bTN_ESTADISTICA_AYUDA_MSJ;
	}


	public String getBTN_BACK_AYUDA_MSJ() {
		return BTN_BACK_AYUDA_MSJ;
	}


	public void setBTN_BACK_AYUDA_MSJ(String bTN_BACK_AYUDA_MSJ) {
		BTN_BACK_AYUDA_MSJ = bTN_BACK_AYUDA_MSJ;
	}


	public String getBTN_LOG_AYUDA_MSJ() {
		return BTN_LOG_AYUDA_MSJ;
	}


	public void setBTN_LOG_AYUDA_MSJ(String bTN_LOG_AYUDA_MSJ) {
		BTN_LOG_AYUDA_MSJ = bTN_LOG_AYUDA_MSJ;
	}


	public String getMAX_DOCTORES_MSJ() {
		return MAX_DOCTORES_MSJ;
	}


	public void setMAX_DOCTORES_MSJ(String mAX_DOCTORES_MSJ) {
		MAX_DOCTORES_MSJ = mAX_DOCTORES_MSJ;
	}


	public String getVELOCIDAD_MSJ() {
		return VELOCIDAD_MSJ;
	}


	public void setVELOCIDAD_MSJ(String vELOCIDAD_MSJ) {
		VELOCIDAD_MSJ = vELOCIDAD_MSJ;
	}


	public String getVELOCIDAD_POR_DEFECTO_MSJ() {
		return VELOCIDAD_POR_DEFECTO_MSJ;
	}


	public void setVELOCIDAD_POR_DEFECTO_MSJ(String vELOCIDAD_POR_DEFECTO_MSJ) {
		VELOCIDAD_POR_DEFECTO_MSJ = vELOCIDAD_POR_DEFECTO_MSJ;
	}


	public int getDocMin() {
		return DocMin;
	}


	public void setDocMin(int docMin) {
		DocMin = docMin;
	}


	public int getDocMax() {
		return DocMax;
	}


	public void setDocMax(int docMax) {
		DocMax = docMax;
	}


	public int getDocDefault() {
		return DocDefault;
	}


	public void setDocDefault(int docDefault) {
		DocDefault = docDefault;
	}


	public int getAltoBox() {
		return altoBox;
	}


	public void setAltoBox(int altoBox) {
		this.altoBox = altoBox;
	}


	public int getAnchoBox() {
		return anchoBox;
	}


	public void setAnchoBox(int anchoBox) {
		this.anchoBox = anchoBox;
	}


	public int getBox_posY_A() {
		return box_posY_A;
	}


	public void setBox_posY_A(int box_posY_A) {
		this.box_posY_A = box_posY_A;
	}


	public int getBox_posY_B() {
		return box_posY_B;
	}


	public void setBox_posY_B(int box_posY_B) {
		this.box_posY_B = box_posY_B;
	}


	public String getVelocidadPorDefectoStr() {
		return velocidadPorDefectoStr;
	}


	public void setVelocidadPorDefectoStr(String velocidadPorDefectoStr) {
		this.velocidadPorDefectoStr = velocidadPorDefectoStr;
	}


	public String getPorcentajePacientesPorMinutoStr() {
		return porcentajePacientesPorMinutoStr;
	}


	public void setPorcentajePacientesPorMinutoStr(
			String porcentajePacientesPorMinutoStr) {
		this.porcentajePacientesPorMinutoStr = porcentajePacientesPorMinutoStr;
	}

}

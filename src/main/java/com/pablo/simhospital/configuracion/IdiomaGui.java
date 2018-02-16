package main.java.com.pablo.simhospital.configuracion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

import main.java.com.pablo.simhospital.gui.GuiHospital;

//import com.sun.tools.classfile.Method;

public class IdiomaGui {
	/* TXT */
	private String TITULO_HOSPITAL_MSJ;
	private String CANTIDAD_DE_DOCTORES_MSJ;
	/* Config */
	private String TITULO_CONFIGURACION_MSJ;
	private String TIEMPO_MSJ;
	private String HS_MSJ;
	private String PACIENTES_MSJ;
	private String TOTAL_MSJ;
	private String PORCENTAJE_MSJ;
	private String HORA_DE_INICIO_MSJ;
	/* Estadistica */
	private String TITULO_ESTADISTICA_MSJ;
	private String PORCENTAJE_PACIENTES_MIN_MSJ;
	/* LOG */
	private String TITULO_LOG_MSJ;
	/* BOTONES */
	private String BTN_PLAY_AYUDA_MSJ;
	private String BTN_STOP_AYUDA_MSJ;
	private String BTN_ESTADISTICA_AYUDA_MSJ;
	private String BTN_BACK_AYUDA_MSJ;
	private String BTN_LOG_AYUDA_MSJ;
	private String MAX_DOCTORES_MSJ;
	private String VELOCIDAD_MSJ;
	private String VELOCIDAD_POR_DEFECTO_MSJ;

	public IdiomaGui(String lang) {
		Properties prop = new Properties();
		InputStream input = null;

		try {
			if (lang == null)
				lang = " ";
			lang = new String(lang + "/main/config/idioma/ES.properties")
					.trim();
			if (GuiHospital.esJar.equals("SI"))
				input = InputStream.class.getResourceAsStream(lang);
			else {
				input = new FileInputStream(lang);
			}
			// load a properties file
			prop.load(input);

			//
			// java.lang.reflect.Method[] m =
			// Class.forName("Lang").getMethods();
			// for (int i = 0; i < m.length; i++)
			// if (m[i].getName().startsWith("get")){
			// System.out.println("instanceName."+m[i].getName());//+"(\"valOne\");"
			// }
			setTiempoMsj(prop.getProperty("TIEMPO_STR"));
			setTituloHospitalMsj(prop.getProperty("TITULO_HOSPITAL_STR"));
			setHaMsj(prop.getProperty("HS_STR"));
			setTituloLogMsj(prop.getProperty("TITULO_LOG_STR"));
			setBtnPlayAyudaMsj(prop.getProperty("BTN_PLAY_AYUDA_STR"));
			setBtnStopAyudaMsj(prop.getProperty("BTN_STOP_AYUDA_STR"));
			setBtnEstadisticaAyudaMsj(prop
					.getProperty("BTN_ESTADISTICA_AYUDA_STR"));
			setBtnBackAyudaMsj(prop.getProperty("BTN_BACK_AYUDA_STR"));
			setBtnLogAyudaMsj(prop.getProperty("BTN_LOG_AYUDA_STR"));
			setPacientesMsj(prop.getProperty("PACIENTES_STR"));
			setTotalMsj(prop.getProperty("TOTAL_STR"));
			setPorcentajeMsj(prop.getProperty("PORCENTAJE_STR"));
			setTituloEstadisticaMsj(prop.getProperty("TITULO_ESTADISTICA_STR"));
			setTituloConfiguracionMsj(prop
					.getProperty("TITULO_CONFIGURACION_STR"));
			setCantidadDeDoctoresMsj(prop
					.getProperty("CANTIDAD_DE_DOCTORES_STR"));
			setHoraDeInicioMsj(prop.getProperty("HORA_DE_INICIO_STR"));
			setPorcentajePacientesPorMinutoMsj(prop
					.getProperty("PORCENTAJE_PACIENTES_MIN_STR"));
			setMaxDoctoreMsj(prop.getProperty("MAX_DOCTORES_STR"));
			setVelocidadMsj(prop.getProperty("VELOCIDAD_STR"));
			setVelocidadPorDefectoMsj(prop
					.getProperty("VELOCIDAD_POR_DEFECTO_STR"));

			for (Field pro : prop.getClass().getDeclaredFields()) {
				System.err.println(pro.toString());
			}

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

	public void setCantidadDeDoctoresMsj(String s) {
		this.CANTIDAD_DE_DOCTORES_MSJ = s;
	}

	public void setTiempoMsj(String s) {
		this.TIEMPO_MSJ = new String(s);
	}

	public void setTituloConfiguracionMsj(String s) {
		this.TITULO_CONFIGURACION_MSJ = s;
	}

	public void setTituloHospitalMsj(String s) {
		this.TITULO_HOSPITAL_MSJ = s;
	}

	public void setHaMsj(String s) {
		this.HS_MSJ = s;
	}

	public void setTituloLogMsj(String s) {
		this.TITULO_LOG_MSJ = s;
	}

	public void setBtnPlayAyudaMsj(String s) {
		this.BTN_PLAY_AYUDA_MSJ = s;
	}

	public void setBtnStopAyudaMsj(String s) {
		this.BTN_STOP_AYUDA_MSJ = s;
	}

	public void setBtnEstadisticaAyudaMsj(String s) {
		this.BTN_ESTADISTICA_AYUDA_MSJ = s;
	}

	public void setBtnBackAyudaMsj(String s) {
		this.BTN_BACK_AYUDA_MSJ = s;
	}

	public void setBtnLogAyudaMsj(String s) {
		this.BTN_LOG_AYUDA_MSJ = s;
	}

	public void setPacientesMsj(String s) {
		this.PACIENTES_MSJ = s;
	}

	public void setTotalMsj(String s) {
		this.TOTAL_MSJ = s;
	}

	public void setPorcentajeMsj(String s) {
		this.PORCENTAJE_MSJ = s;
	}

	public void setTituloEstadisticaMsj(String s) {
		this.TITULO_ESTADISTICA_MSJ = s;
	}

	public String getTituloHospitalMsj() {
		return TITULO_HOSPITAL_MSJ;
	}

	public String getTituloConfiguracionMsj() {
		return TITULO_CONFIGURACION_MSJ;
	}

	public String getTiempoMsj() {
		return TIEMPO_MSJ;
	}

	public String getHsMsj() {
		return HS_MSJ;
	}

	public String getPacientesMsj() {
		return PACIENTES_MSJ;
	}

	public String getTotalMsj() {
		return TOTAL_MSJ;
	}

	public String getPorcentajeMsj() {
		return PORCENTAJE_MSJ;
	}

	public String getTituloEstadisticaMsj() {
		return TITULO_ESTADISTICA_MSJ;
	}

	public String getTituloLogMsj() {
		return TITULO_LOG_MSJ;
	}

	public String getBtnPlayAyudaMsj() {
		return BTN_PLAY_AYUDA_MSJ;
	}

	public String getBtnStopAyudaMsj() {
		return BTN_STOP_AYUDA_MSJ;
	}

	public String getBtnEstadisticaAyudaMsj() {
		return BTN_ESTADISTICA_AYUDA_MSJ;
	}

	public String getBtnBackAyudaMsj() {
		return BTN_BACK_AYUDA_MSJ;
	}

	public String getBtnLogAyudaMsj() {
		return BTN_LOG_AYUDA_MSJ;
	}

	public String getCantidadDeDoctoresMsj() {
		return CANTIDAD_DE_DOCTORES_MSJ;
	}

	public String getHoraDeInicoMsj() {
		return HORA_DE_INICIO_MSJ;
	}

	public void setHoraDeInicioMsj(String s) {
		HORA_DE_INICIO_MSJ = s;
	}

	public String getPorcentajePacientesPorMinutoMsj() {
		return PORCENTAJE_PACIENTES_MIN_MSJ;
	}

	public void setPorcentajePacientesPorMinutoMsj(String s) {
		PORCENTAJE_PACIENTES_MIN_MSJ = s;
	}

	public String getMaxDoctoreMsj() {
		return MAX_DOCTORES_MSJ;
	}

	public void setMaxDoctoreMsj(String maxDoctoreMsj) {
		MAX_DOCTORES_MSJ = maxDoctoreMsj;
	}

	public String getVelocidadMsj() {
		return VELOCIDAD_MSJ;
	}

	public void setVelocidadMsj(String s) {
		VELOCIDAD_MSJ = s;
	}

	public String getVelocidadPorDefectoMsj() {
		return VELOCIDAD_POR_DEFECTO_MSJ;
	}

	public void setVelocidadPorDefectoMsj(String s) {
		VELOCIDAD_POR_DEFECTO_MSJ = s;
	}
}
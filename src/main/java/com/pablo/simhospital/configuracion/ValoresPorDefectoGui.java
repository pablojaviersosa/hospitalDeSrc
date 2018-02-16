package main.java.com.pablo.simhospital.configuracion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import main.java.com.pablo.simhospital.gui.GuiHospital;

//import com.sun.tools.corba.se.idl.toJavaPortable.Util;

/**
 * @author Pablo Sosa
 * 
 */
public class ValoresPorDefectoGui {

	public static enum nombreDoc {
		Juan, Pedro, Marcelo, Pablo, Ezequiel, Damian, Jorge, Gustavo, David, Omar, Diego, Brian, Seba
	}

	/* GUI */
	private int DocMin = 1;
	private int DocMax = 15;
	private int DocDefault = 5;

	/* BOXES */
	private int altoBox = 75;
	private int anchoBox = 55;
	private int box_posY_A = 15;
	private int box_posY_B = 200;
	private String velocidadPorDefectoStr = "60";
	private String porcentajePacientesPorMinutoStr = "20";

	public ValoresPorDefectoGui(String ArchivoConf) {
		// TODO Auto-generated constructor stub
		Properties prop = new Properties();
		InputStream input = null;

		try {
			if (ArchivoConf == null) {
				ArchivoConf = " ";
			}
			ArchivoConf = new String(ArchivoConf
					+ "/main/config/valores_por_defecto.properties").trim();
			if (GuiHospital.esJar.equals("SI")) {
				input = InputStream.class.getResourceAsStream(ArchivoConf);
			} else {
				input = new FileInputStream(ArchivoConf);
			}
			// load a properties file
			prop.load(input);

			setDocMin(Integer.parseInt(prop.getProperty("DocMin")));
			setDocMax(Integer.parseInt(prop.getProperty("DocMax")));
			setDocDefault(Integer.parseInt(prop.getProperty("DocDefault")));
			setAltoBox(Integer.parseInt(prop.getProperty("altoBox")));
			setAnchoBox(Integer.parseInt(prop.getProperty("anchoBox")));
			setBox_posY_A(Integer.parseInt(prop.getProperty("box_posY_A")));
			setBox_posY_B(Integer.parseInt(prop.getProperty("box_posY_B")));
			setVelocidadPorDefectoStr(prop
					.getProperty("velocidadPorDefectoStr"));
			setPorcentajePacientesPorMinutoStr(prop
					.getProperty("porcentajePacientesPorMinutoStr"));
			//
			// java.lang.reflect.Method[] m =
			// Class.forName("Lang").getMethods();
			// for (int i = 0; i < m.length; i++)
			// if (m[i].getName().startsWith("get")){
			// System.out.println("instanceName."+m[i].getName());//+"(\"valOne\");"
			// }

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

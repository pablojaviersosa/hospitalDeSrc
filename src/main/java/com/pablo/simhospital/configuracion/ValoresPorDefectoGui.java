package main.java.com.pablo.simhospital.configuracion;

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
	static int DocMin;
	static int DocMax;
	static int DocDefault;

	/* BOXES */
	static int altoBox;
	static int anchoBox;
	static int box_posY_A;
	static int box_posY_B;
	static String velocidadPorDefectoStr;
	static String porcentajePacientesPorMinutoStr;

	public ValoresPorDefectoGui() {
	}

	// public ValoresPorDefectoGui(String ArchivoConf) {
	// // TODO Auto-generated constructor stub
	// Properties prop = new Properties();
	// InputStream input = null;
	//
	// try {
	// if (ArchivoConf == null) {
	// ArchivoConf = " ";
	// }
	// ArchivoConf = new String(ArchivoConf
	// + "/main/config/valores_por_defecto.properties").trim();
	// if (GuiHospital.esJar.equals("SI")) {
	// input = InputStream.class.getResourceAsStream(ArchivoConf);
	// } else {
	// input = new FileInputStream(ArchivoConf);
	// }
	// // load a properties file
	// prop.load(input);
	//
	// setDocMin(Integer.parseInt(prop.getProperty("DocMin")));
	// setDocMax(Integer.parseInt(prop.getProperty("DocMax")));
	// setDocDefault(Integer.parseInt(prop.getProperty("DocDefault")));
	// setAltoBox(Integer.parseInt(prop.getProperty("altoBox")));
	// setAnchoBox(Integer.parseInt(prop.getProperty("anchoBox")));
	// setBox_posY_A(Integer.parseInt(prop.getProperty("box_posY_A")));
	// setBox_posY_B(Integer.parseInt(prop.getProperty("box_posY_B")));
	// setVelocidadPorDefectoStr(prop
	// .getProperty("velocidadPorDefectoStr"));
	// setPorcentajePacientesPorMinutoStr(prop
	// .getProperty("porcentajePacientesPorMinutoStr"));
	// //
	// // java.lang.reflect.Method[] m =
	// // Class.forName("Lang").getMethods();
	// // for (int i = 0; i < m.length; i++)
	// // if (m[i].getName().startsWith("get")){
	// // System.out.println("instanceName."+m[i].getName());//+"(\"valOne\");"
	// // }
	//
	// } catch (IOException ex) {
	// ex.printStackTrace();
	// } catch (Throwable e) {
	// System.err.println(e);
	// } finally {
	// if (input != null) {
	// try {
	// input.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// }
	//

	public static int getDocMin() {
		return DocMin;
	}

	public static void setDocMin(int docMin) {
		DocMin = docMin;
	}

	public static int getDocMax() {
		return DocMax;
	}

	public static void setDocMax(int docMax) {
		DocMax = docMax;
	}

	public static int getDocDefault() {
		return DocDefault;
	}

	public static void setDocDefault(int docDefault) {
		DocDefault = docDefault;
	}

	public static int getAltoBox() {
		return altoBox;
	}

	public static void setAltoBox(int altoBox) {
		ValoresPorDefectoGui.altoBox = altoBox;
	}

	public static int getAnchoBox() {
		return anchoBox;
	}

	public static void setAnchoBox(int anchoBox) {
		ValoresPorDefectoGui.anchoBox = anchoBox;
	}

	public static int getBox_posY_A() {
		return box_posY_A;
	}

	public static void setBox_posY_A(int box_posY_A) {
		ValoresPorDefectoGui.box_posY_A = box_posY_A;
	}

	public static int getBox_posY_B() {
		return box_posY_B;
	}

	public static void setBox_posY_B(int box_posY_B) {
		ValoresPorDefectoGui.box_posY_B = box_posY_B;
	}

	public static String getVelocidadPorDefectoStr() {
		return velocidadPorDefectoStr;
	}

	public static void setVelocidadPorDefectoStr(String velocidadPorDefectoStr) {
		ValoresPorDefectoGui.velocidadPorDefectoStr = velocidadPorDefectoStr;
	}

	public static String getPorcentajePacientesPorMinutoStr() {
		return porcentajePacientesPorMinutoStr;
	}

	public static void setPorcentajePacientesPorMinutoStr(
			String porcentajePacientesPorMinutoStr) {
		ValoresPorDefectoGui.porcentajePacientesPorMinutoStr = porcentajePacientesPorMinutoStr;
	}
}

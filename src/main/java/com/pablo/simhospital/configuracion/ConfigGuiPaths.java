package main.java.com.pablo.simhospital.configuracion;

public class ConfigGuiPaths {

	/// Rutas
//	static private Properties prop;
	static String pathUrgenciasStr;
	static String pathLog4jPropertiesStr;
	static String pathMusicaStr;
//	
	public ConfigGuiPaths(){
		
	}
//	public ConfigGuiPaths(String path){
//		prop = new Properties();
//		InputStream input = null;
//
//		try {
//			if (path == null)
//				path = " ";
//			path = new String(path + "/main/config/paths.properties")
//					.trim();
//			if (GuiHospital.esJar.equals("SI"))
//				input = InputStream.class.getResourceAsStream(path);
//			else {
//				input = new FileInputStream(path);
//			}
//			// load a properties file
//			prop.load(input);
//			}catch(IOException e){
//				System.err.println(e.getStackTrace());
//			}
//				
//	}
	public static String getPathUrgenciasStr() {
		return pathUrgenciasStr;
	}
	public static void setPathUrgenciasStr(String pathUrgenciasStr) {
		ConfigGuiPaths.pathUrgenciasStr = pathUrgenciasStr;
	}
	public static String getPathLog4jPropertiesStr() {
		return pathLog4jPropertiesStr;
	}
	public static void setPathLog4jPropertiesStr(String pathLog4jPropertiesStr) {
		ConfigGuiPaths.pathLog4jPropertiesStr = pathLog4jPropertiesStr;
	}
	public static String getPathMusicaStr() {
		return pathMusicaStr;
	}
	public static void setPathMusicaStr(String pathMusicaStr) {
		ConfigGuiPaths.pathMusicaStr = pathMusicaStr;
	}
}

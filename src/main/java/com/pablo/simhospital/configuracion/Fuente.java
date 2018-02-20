package main.java.com.pablo.simhospital.configuracion;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//import main.java.com.pablo.simhospital.gui.GuiHospital;
//
public abstract class Fuente {}
//	private Properties props;
//	private String ruta_raiz_fuente;
//
//	protected void loadProps(Fuente obj) {
//		String className = obj.getClass().getSimpleName();
//		props = new Properties();
//		InputStream input = null;
//		try {
//			String s = new String(obj.getRutaRaizFuente()
//						+ "/main/config/fuentes/" + className + ".properties")
//						.trim();
//				input = InputStream.class.getResourceAsStream(s);
//			} else {
//				input = new FileInputStream(obj.getRutaRaizFuente()
//						+ "/main/config/fuentes/" + className + ".properties");
//			}
//			props.load(input);
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		} finally {
//			if (input != null) {
//				try {
//					input.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//
//	protected String getProp(String s) {
//		return props.getProperty(s);
//	}
//
//	protected String getRutaRaizFuente() {
//		return ruta_raiz_fuente;
//	}
//
//	protected void setRutaRaizFuente(String s) {
//		ruta_raiz_fuente = s;
//	}
//}

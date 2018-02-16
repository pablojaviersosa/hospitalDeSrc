package main.java.com.pablo.simhospital.util;

import java.io.File;
import java.io.FileReader;

public class Archivo {

	public String leerArchivo(String path) {
		String texto = "";
		File file = new File(path);
		try {
			FileReader reader = new FileReader(file);
			char[] chars = new char[(int) file.length()];
			reader.read(chars);
			texto = new String(chars);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			texto = "Error al leer el archivo.";
		}
		return texto;
	}
}

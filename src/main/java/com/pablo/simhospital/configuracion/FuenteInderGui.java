package main.java.com.pablo.simhospital.configuracion;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.InputStream;

public final class FuenteInderGui extends Fuente {
	static String pathRecursoFuente;
	static String nombreRecursoFuente;

	static int inderBold10;
	static int inderBold15;
	static int inderBold20;
	static int inderBold25;
	static int inderBold30;
	static int inderBold40;
	// Fuentes
	private Font fontTipografia = null;
	private Font fontInderBold10 = null;
	private Font fontInderBold15 = null;
	private Font fontInderBold20 = null;
	private Font fontInderBold25 = null;
	private Font fontInderBold30 = null;
	private Font fontInderBold40 = null;

	public FuenteInderGui() {
		if (getPathRecursoFuente() != null)			
			load();
	}

	private void load() {
		loadTipografia();
		loadInderBold10();
		loadInderBold15();
		loadInderBold20();
		loadInderBold25();
		loadInderBold30();
		loadInderBold40();
	}

	private void loadTipografia() {
		try {
			setFontTipografia(Font.createFont(
					Font.TRUETYPE_FONT,
					InputStream.class.getResourceAsStream(pathRecursoFuente
							+ nombreRecursoFuente)));

		} catch (Exception e) {
			e.printStackTrace();
			try {
				setFontTipografia(Font.createFont(Font.TRUETYPE_FONT,
						new FileInputStream(pathRecursoFuente
								+ nombreRecursoFuente)));
			} catch (Exception e2) {
				// TODO: handle exception
			}
			// TODO: handle exception
		}

	}

	private void loadInderBold10() {
		try {
			setFontInderBold10(getFontTipografia().deriveFont(Font.BOLD, inderBold10));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void loadInderBold15() {
		try {
			setFontInderBold15(getFontTipografia().deriveFont(Font.BOLD, inderBold15));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void loadInderBold20() {
		try {
			setFontInderBold20(getFontTipografia().deriveFont(Font.BOLD, inderBold20));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void loadInderBold25() {
		try {
			setFontInderBold25(getFontTipografia().deriveFont(Font.BOLD, inderBold25));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void loadInderBold30() {
		try {
			setFontInderBold30(getFontTipografia().deriveFont(Font.BOLD, inderBold30));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void loadInderBold40() {
		try {
			setFontInderBold40(getFontTipografia().deriveFont(Font.BOLD, inderBold40));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static String getPathRecursoFuente() {
		return pathRecursoFuente;
	}

	public static void setPathRecursoFuente(String pathRecursoFuente) {
		FuenteInderGui.pathRecursoFuente = pathRecursoFuente;
	}

	public static String getNombreRecursoFuente() {
		return nombreRecursoFuente;
	}

	public static void setNombreRecursoFuente(String nombreRecursoFuente) {
		FuenteInderGui.nombreRecursoFuente = nombreRecursoFuente;
	}

	public static int getInderBold10() {
		return inderBold10;
	}

	public static void setInderBold10(int inderBold10) {
		FuenteInderGui.inderBold10 = inderBold10;
	}

	public static int getInderBold15() {
		return inderBold15;
	}

	public static void setInderBold15(int inderBold15) {
		FuenteInderGui.inderBold15 = inderBold15;
	}

	public static int getInderBold20() {
		return inderBold20;
	}

	public static void setInderBold20(int inderBold20) {
		FuenteInderGui.inderBold20 = inderBold20;
	}

	public static int getInderBold25() {
		return inderBold25;
	}

	public static void setInderBold25(int inderBold25) {
		FuenteInderGui.inderBold25 = inderBold25;
	}

	public static int getInderBold30() {
		return inderBold30;
	}

	public static void setInderBold30(int inderBold30) {
		FuenteInderGui.inderBold30 = inderBold30;
	}

	public static int getInderBold40() {
		return inderBold40;
	}

	public static void setInderBold40(int inderBold40) {
		FuenteInderGui.inderBold40 = inderBold40;
	}

	public Font getFontTipografia() {
		return fontTipografia;
	}

	public void setFontTipografia(Font fontTipografia) {
		this.fontTipografia = fontTipografia;
	}

	public Font getFontInderBold10() {
		return fontInderBold10;
	}

	public void setFontInderBold10(Font fontInderBold10) {
		this.fontInderBold10 = fontInderBold10;
	}

	public Font getFontInderBold15() {
		return fontInderBold15;
	}

	public void setFontInderBold15(Font fontInderBold15) {
		this.fontInderBold15 = fontInderBold15;
	}

	public Font getFontInderBold20() {
		return fontInderBold20;
	}

	public void setFontInderBold20(Font fontInderBold20) {
		this.fontInderBold20 = fontInderBold20;
	}

	public Font getFontInderBold25() {
		return fontInderBold25;
	}

	public void setFontInderBold25(Font fontInderBold25) {
		this.fontInderBold25 = fontInderBold25;
	}

	public Font getFontInderBold30() {
		return fontInderBold30;
	}

	public void setFontInderBold30(Font fontInderBold30) {
		this.fontInderBold30 = fontInderBold30;
	}

	public Font getFontInderBold40() {
		return fontInderBold40;
	}

	public void setFontInderBold40(Font fontInderBold40) {
		this.fontInderBold40 = fontInderBold40;
	}
}

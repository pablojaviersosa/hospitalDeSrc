package main.java.com.pablo.simhospital.configuracion;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.InputStream;

import main.java.com.pablo.simhospital.gui.GuiHospital;

public final class FuenteInderGui extends Fuente {
	private Font tipografia;
	/* Fuentes */
	private Font inderBold10 = null;
	private Font inderBold15 = null;
	private Font inderBold20 = null;
	private Font inderBold25 = null;
	private Font inderBold30 = null;
	private Font inderBold40 = null;

	public FuenteInderGui(String s) {
		if (s == null) {
			s = " ";
		}
		setRutaRaizFuente(s);
		loadProps(this);
		try {
			s = new String(getRutaRaizFuente() + "/main/recursos/fuentes/"
					+ "Inder.ttf").trim();
			if (GuiHospital.esJar.equals("SI")) {
				tipografia = Font.createFont(Font.TRUETYPE_FONT,
						InputStream.class.getResourceAsStream(s));
			} else {
				tipografia = Font.createFont(Font.TRUETYPE_FONT,
						new FileInputStream(s));
			}

			setInderBold10(tipografia.deriveFont(Font.BOLD,
					Integer.parseInt(getProp("inderBold10"))));
			setInderBold15(tipografia.deriveFont(Font.BOLD,
					Integer.parseInt(getProp("inderBold15"))));
			setInderBold20(tipografia.deriveFont(Font.BOLD,
					Integer.parseInt(getProp("inderBold20"))));
			setInderBold25(tipografia.deriveFont(Font.BOLD,
					Integer.parseInt(getProp("inderBold25"))));
			setInderBold30(tipografia.deriveFont(Font.BOLD,
					Integer.parseInt(getProp("inderBold30"))));
			setInderBold40(tipografia.deriveFont(Font.BOLD,
					Integer.parseInt(getProp("inderBold40"))));

		} catch (Exception e) {
			e.printStackTrace();
		}
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
}

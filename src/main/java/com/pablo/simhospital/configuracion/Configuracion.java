package main.java.com.pablo.simhospital.configuracion;

public class Configuracion {
	private ValoresPorDefectoGui valoresDef;
	private IdiomaGui idioma;
	private IconosGui iconos;
	private FuenteInderGui fuentes;

	public Configuracion(String ruta_idioma, String ruta_valores,
			String ruta_iconos, String ruta_fuentes) {
		setIdioma(new IdiomaGui(ruta_idioma));
		setValoresDef(new ValoresPorDefectoGui(ruta_valores));
		setIconos(new IconosGui(ruta_iconos));
		setFuentes(new FuenteInderGui(ruta_fuentes));

		if (getValoresDef() == null) {
			System.err.println("Error cargar valores por defecto");
		}
		if (getIdioma() == null) {
			System.err.println("No se pueden setear los idioma");
		}
		if (getIconos() == null) {
			System.err.println("No se pueden setear los idioma");
		}
	}

	public IdiomaGui getIdioma() {
		return idioma;
	}

	public void setIdioma(IdiomaGui idioma) {
		this.idioma = idioma;
	}

	public ValoresPorDefectoGui getValoresDef() {
		return valoresDef;
	}

	public void setValoresDef(ValoresPorDefectoGui valoresDef) {
		this.valoresDef = valoresDef;
	}

	public IconosGui getIconos() {
		return iconos;
	}

	public void setIconos(IconosGui iconos) {
		this.iconos = iconos;
	}

	public FuenteInderGui getFuentes() {
		return fuentes;
	}

	public void setFuentes(FuenteInderGui fuentes) {
		this.fuentes = fuentes;
	}

}

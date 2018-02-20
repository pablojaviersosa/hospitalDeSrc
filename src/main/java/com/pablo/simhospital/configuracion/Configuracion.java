package main.java.com.pablo.simhospital.configuracion;

import main.java.com.pablo.simhospital.util.MusicaGui;

public class Configuracion {
	 private static ValoresPorDefectoGui valoresDef;
	 private static IdiomaGui idioma;
	 private static IconosGui iconos;
	 private static FuenteInderGui fuentes;
	 private static ConfigGuiPaths rutas;
	 private static MusicaGui musica;
//	 private static Properties props;
	
	public Configuracion(String s){
		ConfigLoader.load(ConfigGuiPaths.class,s); //"/main/config/common.properties"
		ConfigLoader.load(ValoresPorDefectoGui.class, s);
		ConfigLoader.load(IdiomaGui.class,s);
		ConfigLoader.load(IconosGui.class,s);
        ConfigLoader.load(FuenteInderGui.class,s);
        ConfigLoader.load(MusicaGui.class, s);
        setRutas(new ConfigGuiPaths());
        setFuentes(new FuenteInderGui());
        setIconos(new IconosGui());
        setIdioma(new IdiomaGui());
        setValoresDef(new ValoresPorDefectoGui());
        setMusica(new MusicaGui());
	}

	public static ValoresPorDefectoGui getValoresDef() {
		return valoresDef;
	}

	public static void setValoresDef(ValoresPorDefectoGui valoresDef) {
		Configuracion.valoresDef = valoresDef;
	}

	public static IdiomaGui getIdioma() {
		return idioma;
	}

	public static void setIdioma(IdiomaGui idioma) {
		Configuracion.idioma = idioma;
	}

	public IconosGui getIconos() {
		return iconos;
	}

	public static void setIconos(IconosGui iconos) {
		Configuracion.iconos = iconos;
	}

	public FuenteInderGui getFuentes() {
		return fuentes;
	}

	public static void setFuentes(FuenteInderGui fuentes) {
		Configuracion.fuentes = fuentes;
	}

	public static ConfigGuiPaths getRutas() {
		return rutas;
	}

	public static void setRutas(ConfigGuiPaths rutas) {
		Configuracion.rutas = rutas;
	}

	public static MusicaGui getMusica() {
		return musica;
	}

	public static void setMusica(MusicaGui musica) {
		Configuracion.musica = musica;
	}

}
// privaConfigGuiPaths rutaste Properties propPaths;
// privaProperties props;   te Properties props;
//
// public Configuracion(String path) {
// props = new Properties();
// InputStream input = null;
// try {
// if (path == null)
// path = " ";
// path = new String(path + "/main/config/paths.properties")
// .trim();
// if (GuiHospital.esJar.equals("SI"))
//
// else {
// input = new FileInputStream(path);
// }
// // load a properties file
// props.load(input);
// }catch(IOException e){
// System.err.println(e.getStackTrace());
// }
//
//

// propPaths = (new ConfigGuiPaths(rutaRutas)).getProp();
// setPropPaths(p);

// setIdioma(new IdiomaGui(getPropPaths().getProperty(arg0)utaIdioma));
// setValoresDef(new ValoresPorDefectoGui(rutaValores));
// setIconos(new IconosGui(rutaIconos));
// setFuentes(new FuenteInderGui(rutaFuentes));

// if (getValoresDef() == null) {
// System.err.println("Error cargar valores por defecto");
// }
// if (getIdioma() == null) {
// System.err.println("No se pueden setear los idioma");
// }
// if (getIconos() == null) {
// System.err.println("No se pueden setear los idioma");
// }
// }
//
package main.java.com.pablo.simhospital.configuracion;

public class IdiomaGui {
	static String pathRecursoIdiomas;
	static String idiomaElegido;
	/* TXT */
	static String tituloHospitalMsj;
	static String cantidadDeDoctoresMsj;
	/* Config */
	static String tituloConfiguracionMsj;
	static String tiempoMsj;
	static String hsMsj;
	static String pacientesMsj;
	static String totalMsj;
	static String porcentajeMsj;
	static String horaDeInicioMsj;
	/* Estadistica */
	static String tituloEstadisticaMsj;
	static String porcentajaPacientesMinMsj;
	/* LOG */
	static String tituloLogMsj;
	/* BOTONES */
	static String btnPlayAyudaMsj;
	static String btnStopAyudaMsj;
	static String btnEstadisticaAyudaMsj;
	static String btnBackAyudaMsj;
	static String btnLogAyudaMsj;
	static String maxDoctoresMsj;
	static String velocidadMsj;
	static String velocidadPorDefectoMsj;
	/*Mensajes de Error*/
	static String errorAlcargarLogger;

	public IdiomaGui() {
		load();
	}
	private void load(){
		ConfigLoader.load(IdiomaGui.class, getpathRecursoIdiomas()+getIdiomaElegido()+".properties");
	}

	private String getpathRecursoIdiomas() {
		// TODO Auto-generated method stub
		return pathRecursoIdiomas;
	}
	private String getIdiomaElegido() {
		// TODO Auto-generated method stub
		return idiomaElegido;
	}
	public static String getPathRecursoIdiomas() {
		return pathRecursoIdiomas;
	}
	public static void setPathRecursoIdiomas(String pathRecursoIdiomas) {
		IdiomaGui.pathRecursoIdiomas = pathRecursoIdiomas;
	}
	public static String getTituloHospitalMsj() {
		return tituloHospitalMsj;
	}
	public static void setTituloHospitalMsj(String tituloHospitalMsj) {
		IdiomaGui.tituloHospitalMsj = tituloHospitalMsj;
	}
	public static String getCantidadDeDoctoresMsj() {
		return cantidadDeDoctoresMsj;
	}
	public static void setCantidadDeDoctoresMsj(String cantidadDeDoctoresMsj) {
		IdiomaGui.cantidadDeDoctoresMsj = cantidadDeDoctoresMsj;
	}
	public static String getTituloConfiguracionMsj() {
		return tituloConfiguracionMsj;
	}
	public static void setTituloConfiguracionMsj(String tituloConfiguracionMsj) {
		IdiomaGui.tituloConfiguracionMsj = tituloConfiguracionMsj;
	}
	public static String getTiempoMsj() {
		return tiempoMsj;
	}
	public static void setTiempoMsj(String tiempoMsj) {
		IdiomaGui.tiempoMsj = tiempoMsj;
	}
	public static String getHsMsj() {
		return hsMsj;
	}
	public static void setHsMsj(String hsMsj) {
		IdiomaGui.hsMsj = hsMsj;
	}
	public static String getPacientesMsj() {
		return pacientesMsj;
	}
	public static void setPacientesMsj(String pacientesMsj) {
		IdiomaGui.pacientesMsj = pacientesMsj;
	}
	public static String getTotalMsj() {
		return totalMsj;
	}
	public static void setTotalMsj(String totalMsj) {
		IdiomaGui.totalMsj = totalMsj;
	}
	public static String getPorcentajeMsj() {
		return porcentajeMsj;
	}
	public static void setPorcentajeMsj(String porcentajeMsj) {
		IdiomaGui.porcentajeMsj = porcentajeMsj;
	}
	public static String getHoraDeInicioMsj() {
		return horaDeInicioMsj;
	}
	public static void setHoraDeInicioMsj(String horaDeInicioMsj) {
		IdiomaGui.horaDeInicioMsj = horaDeInicioMsj;
	}
	public static String getTituloEstadisticaMsj() {
		return tituloEstadisticaMsj;
	}
	public static void setTituloEstadisticaMsj(String tituloEstadisticaMsj) {
		IdiomaGui.tituloEstadisticaMsj = tituloEstadisticaMsj;
	}
	public static String getPorcentajaPacientesMinMsj() {
		return porcentajaPacientesMinMsj;
	}
	public static void setPorcentajaPacientesMinMsj(String porcentajaPacientesMinMsj) {
		IdiomaGui.porcentajaPacientesMinMsj = porcentajaPacientesMinMsj;
	}
	public static String getTituloLogMsj() {
		return tituloLogMsj;
	}
	public static void setTituloLogMsj(String tituloLogMsj) {
		IdiomaGui.tituloLogMsj = tituloLogMsj;
	}
	public static String getBtnPlayAyudaMsj() {
		return btnPlayAyudaMsj;
	}
	public static void setBtnPlayAyudaMsj(String btnPlayAyudaMsj) {
		IdiomaGui.btnPlayAyudaMsj = btnPlayAyudaMsj;
	}
	public static String getBtnStopAyudaMsj() {
		return btnStopAyudaMsj;
	}
	public static void setBtnStopAyudaMsj(String btnStopAyudaMsj) {
		IdiomaGui.btnStopAyudaMsj = btnStopAyudaMsj;
	}
	public static String getBtnEstadisticaAyudaMsj() {
		return btnEstadisticaAyudaMsj;
	}
	public static void setBtnEstadisticaAyudaMsj(String btnEstadisticaAyudaMsj) {
		IdiomaGui.btnEstadisticaAyudaMsj = btnEstadisticaAyudaMsj;
	}
	public static String getBtnBackAyudaMsj() {
		return btnBackAyudaMsj;
	}
	public static void setBtnBackAyudaMsj(String btnBackAyudaMsj) {
		IdiomaGui.btnBackAyudaMsj = btnBackAyudaMsj;
	}
	public static String getBtnLogAyudaMsj() {
		return btnLogAyudaMsj;
	}
	public static void setBtnLogAyudaMsj(String btnLogAyudaMsj) {
		IdiomaGui.btnLogAyudaMsj = btnLogAyudaMsj;
	}
	public static String getMaxDoctoresMsj() {
		return maxDoctoresMsj;
	}
	public static void setMaxDoctoresMsj(String maxDoctoresMsj) {
		IdiomaGui.maxDoctoresMsj = maxDoctoresMsj;
	}
	public static String getVelocidadMsj() {
		return velocidadMsj;
	}
	public static void setVelocidadMsj(String velocidadMsj) {
		IdiomaGui.velocidadMsj = velocidadMsj;
	}
	public static String getVelocidadPorDefectoMsj() {
		return velocidadPorDefectoMsj;
	}
	public static void setVelocidadPorDefectoMsj(String velocidadPorDefectoMsj) {
		IdiomaGui.velocidadPorDefectoMsj = velocidadPorDefectoMsj;
	}
	public static void setIdiomaElegido(String idiomaElegido) {
		IdiomaGui.idiomaElegido = idiomaElegido;
	}
	public static String getErrorAlcargarLogger() {
		return errorAlcargarLogger;
	}
	public static void setErrorAlcargarLogger(String errorAlcargarLogger) {
		IdiomaGui.errorAlcargarLogger = errorAlcargarLogger;
	}
	
}
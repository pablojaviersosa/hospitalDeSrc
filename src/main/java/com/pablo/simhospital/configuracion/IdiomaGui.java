package main.java.com.pablo.simhospital.configuracion;

public class IdiomaGui {
	static String pathRecursoIdiomas, idiomaElegido, homePath;
	/* TXT */
	static String tituloHospitalMsj, cantidadDeDoctoresMsj;
	/* Config */
	static String tituloConfiguracionMsj, tiempoMsj, hsMsj, pacientesMsj,
			totalMsj, porcentajeMsj, horaDeInicioMsj;
	/* Simulacion */
	static String ingresoPacienteAltaMsj, ingresoPacienteMediaMsj,
			ingresoPacienteBajaMsj, pacienteEnColaMsj, finSimulacionMsj,
			numeroTotalPacientesAltaMsj, numeroTotalPacientesMediaMsj,
			numeroTotalPacientesMsj, numeroTotalPacientesBajaMsj,
			esperaPromedioMsj,finDeHiloDoctorMsj,docMsj,terminoDocMsj,
			docAtiendeMsj,esperaPacientesMsj;
	/*Paciente*/
	static String horaLlegadaPacienteMsj,prioridadMsj,uAtiempoDeVidaMsj,
	uMtiempoDeVidaMsj,uBtiempoDeVidaMsj,uDtiempoDeVidaMsj;
	static String doInBackCanceladoMsj,doInBackTerminadoMsj;
	/* Estadistica */
	static String tituloEstadisticaMsj;
	static String porcentajaPacientesMinMsj;
	/* LOG */
	static String tituloLogMsj;
	/* BOTONES */
	static String btnPlayAyudaMsj, btnStopAyudaMsj, btnEstadisticaAyudaMsj,
			btnBackAyudaMsj, btnLogAyudaMsj, maxDoctoresMsj, velocidadMsj,
			velocidadPorDefectoMsj;
	static String numeroPacientesUrgenciaAltaMsj,
			numeroPacientesUrgenciaMediaMsj, numeroPacientesUrgenciaBajaMsj;
	/* Mensajes de Error */
	static String errorAlcargarLoggerMsj, errorAlAbrirArchivoSimulacionMsj,
			errorSimularMsj, errorPoolDeDoctoresNoTerminaMsj;

	public IdiomaGui() {
		load();
	}

	private void load() {
		ConfigLoader.load(IdiomaGui.class, getHomePath()
				+ getpathRecursoIdiomas() + getIdiomaElegido() + ".properties");
	}

	private String getHomePath() {
		return homePath;
	}

	private String getpathRecursoIdiomas() {
		return pathRecursoIdiomas;
	}

	private String getIdiomaElegido() {
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

	public static void setPorcentajaPacientesMinMsj(
			String porcentajaPacientesMinMsj) {
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
		return errorAlcargarLoggerMsj;
	}

	public static void setErrorAlcargarLogger(String errorAlcargarLogger) {
		IdiomaGui.errorAlcargarLoggerMsj = errorAlcargarLogger;
	}

	public static void setHomePath(String homePath) {
		IdiomaGui.homePath = homePath;
	}

	public static String getIngresoPacienteAltaMsj() {
		return ingresoPacienteAltaMsj;
	}

	public static void setIngresoPacienteAltaMsj(String ingresoPacienteAltaMsj) {
		IdiomaGui.ingresoPacienteAltaMsj = ingresoPacienteAltaMsj;
	}

	public static String getIngresoPacienteMediaMsj() {
		return ingresoPacienteMediaMsj;
	}

	public static void setIngresoPacienteMediaMsj(String ingresoPacienteMediaMsj) {
		IdiomaGui.ingresoPacienteMediaMsj = ingresoPacienteMediaMsj;
	}

	public static String getIngresoPacienteBajaMsj() {
		return ingresoPacienteBajaMsj;
	}

	public static void setIngresoPacienteBajaMsj(String ingresoPacienteBajaMsj) {
		IdiomaGui.ingresoPacienteBajaMsj = ingresoPacienteBajaMsj;
	}

	public static String getPacienteEnColaMsj() {
		return pacienteEnColaMsj;
	}

	public static void setPacienteEnColaMsj(String pacienteEnColaMsj) {
		IdiomaGui.pacienteEnColaMsj = pacienteEnColaMsj;
	}

	public static String getFinSimulacionMsj() {
		return finSimulacionMsj;
	}

	public static void setFinSimulacionMsj(String finSimulacionMsj) {
		IdiomaGui.finSimulacionMsj = finSimulacionMsj;
	}

	public static String getNumeroTotalPacientesAltaMsj() {
		return numeroTotalPacientesAltaMsj;
	}

	public static void setNumeroTotalPacientesAltaMsj(
			String numeroTotalPacientesAltaMsj) {
		IdiomaGui.numeroTotalPacientesAltaMsj = numeroTotalPacientesAltaMsj;
	}

	public static String getNumeroTotalPacientesMediaMsj() {
		return numeroTotalPacientesMediaMsj;
	}

	public static void setNumeroTotalPacientesMediaMsj(
			String numeroTotalPacientesMediaMsj) {
		IdiomaGui.numeroTotalPacientesMediaMsj = numeroTotalPacientesMediaMsj;
	}

	public static String getNumeroTotalPacientesBajaMsj() {
		return numeroTotalPacientesBajaMsj;
	}

	public static void setNumeroTotalPacientesBajaMsj(
			String numeroTotalPacientesBajaMsj) {
		IdiomaGui.numeroTotalPacientesBajaMsj = numeroTotalPacientesBajaMsj;
	}

	public static String getNumeroTotalPacientesMsj() {
		return numeroTotalPacientesMsj;
	}

	public static void setNumeroTotalPacientesMsj(String numeroTotalPacientesMsj) {
		IdiomaGui.numeroTotalPacientesMsj = numeroTotalPacientesMsj;
	}

	public static String getEsperaPromedioMsj() {
		return esperaPromedioMsj;
	}

	public static void setEsperaPromedioMsj(String esperaPromedioMsj) {
		IdiomaGui.esperaPromedioMsj = esperaPromedioMsj;
	}

	public static String getErrorPoolDeDoctoresNoTerminaMsj() {
		return errorPoolDeDoctoresNoTerminaMsj;
	}

	public static void setErrorPoolDeDoctoresNoTerminaMsj(
			String errorPoolDeDoctoresNoTerminaMsj) {
		IdiomaGui.errorPoolDeDoctoresNoTerminaMsj = errorPoolDeDoctoresNoTerminaMsj;
	}

	public static String getNumeroPacientesUrgenciaAltaMsj() {
		return numeroPacientesUrgenciaAltaMsj;
	}

	public static void setNumeroPacientesUrgenciaAltaMsj(
			String numeroPacientesUrgenciaAltaMsj) {
		IdiomaGui.numeroPacientesUrgenciaAltaMsj = numeroPacientesUrgenciaAltaMsj;
	}

	public static String getNumeroPacientesUrgenciaMediaMsj() {
		return numeroPacientesUrgenciaMediaMsj;
	}

	public static void setNumeroPacientesUrgenciaMediaMsj(
			String numeroPacientesUrgenciaMediaMsj) {
		IdiomaGui.numeroPacientesUrgenciaMediaMsj = numeroPacientesUrgenciaMediaMsj;
	}

	public static String getNumeroPacientesUrgenciaBajaMsj() {
		return numeroPacientesUrgenciaBajaMsj;
	}

	public static void setNumeroPacientesUrgenciaBajaMsj(
			String numeroPacientesUrgenciaBajaMsj) {
		IdiomaGui.numeroPacientesUrgenciaBajaMsj = numeroPacientesUrgenciaBajaMsj;
	}

	public static String getErrorAlcargarLoggerMsj() {
		return errorAlcargarLoggerMsj;
	}

	public static void setErrorAlcargarLoggerMsj(String errorAlcargarLoggerMsj) {
		IdiomaGui.errorAlcargarLoggerMsj = errorAlcargarLoggerMsj;
	}

	public static String getErrorAlAbrirArchivoSimulacionMsj() {
		return errorAlAbrirArchivoSimulacionMsj;
	}

	public static void setErrorAlAbrirArchivoSimulacionMsj(
			String errorAlAbrirArchivoSimulacionMsj) {
		IdiomaGui.errorAlAbrirArchivoSimulacionMsj = errorAlAbrirArchivoSimulacionMsj;
	}

	public static String getErrorSimularMsj() {
		return errorSimularMsj;
	}

	public static void setErrorSimularMsj(String errorSimularMsj) {
		IdiomaGui.errorSimularMsj = errorSimularMsj;
	}

	public static String getDoInBackTerminadoMsj() {
		return doInBackTerminadoMsj;
	}

	public static void setDoInBackTerminadoMsj(String doInBackTerminadoMsj) {
		IdiomaGui.doInBackTerminadoMsj = doInBackTerminadoMsj;
	}

	public static String getDoInBackCanceladoMsj() {
		return doInBackCanceladoMsj;
	}

	public static void setDoInBackCanceladoMsj(String doInBackCanceladoMsj) {
		IdiomaGui.doInBackCanceladoMsj = doInBackCanceladoMsj;
	}

	public static String getFinDeHiloDoctorMsj() {
		return finDeHiloDoctorMsj;
	}

	public static void setFinDeHiloDoctorMsj(String finDeHiloDoctorMsj) {
		IdiomaGui.finDeHiloDoctorMsj = finDeHiloDoctorMsj;
	}

	public static String getDocMsj() {
		return docMsj;
	}

	public static void setDocMsj(String docMsj) {
		IdiomaGui.docMsj = docMsj;
	}

	public static String getTerminoDocMsj() {
		return terminoDocMsj;
	}

	public static void setTerminoDocMsj(String terminoDocMsj) {
		IdiomaGui.terminoDocMsj = terminoDocMsj;
	}

	public static String getDocAtiendeMsj() {
		return docAtiendeMsj;
	}

	public static void setDocAtiendeMsj(String docAtiendeMsj) {
		IdiomaGui.docAtiendeMsj = docAtiendeMsj;
	}

	public static String getEsperaPacientesMsj() {
		return esperaPacientesMsj;
	}

	public static void setEsperaPacientesMsj(String esperaPacientesMsj) {
		IdiomaGui.esperaPacientesMsj = esperaPacientesMsj;
	}

	public static String getHoraLlegadaPacienteMsj() {
		return horaLlegadaPacienteMsj;
	}

	public static void setHoraLlegadaPacienteMsj(String horaLlegadaPacienteMsj) {
		IdiomaGui.horaLlegadaPacienteMsj = horaLlegadaPacienteMsj;
	}

	public static String getPrioridadMsj() {
		return prioridadMsj;
	}

	public static void setPrioridadMsj(String prioridadMsj) {
		IdiomaGui.prioridadMsj = prioridadMsj;
	}

	public static String getuAtiempoDeVidaMsj() {
		return uAtiempoDeVidaMsj;
	}

	public static void setuAtiempoDeVidaMsj(String uAtiempoDeVidaMsj) {
		IdiomaGui.uAtiempoDeVidaMsj = uAtiempoDeVidaMsj;
	}

	public static String getuMtiempoDeVidaMsj() {
		return uMtiempoDeVidaMsj;
	}

	public static void setuMtiempoDeVidaMsj(String uMtiempoDeVidaMsj) {
		IdiomaGui.uMtiempoDeVidaMsj = uMtiempoDeVidaMsj;
	}

	public static String getuBtiempoDeVidaMsj() {
		return uBtiempoDeVidaMsj;
	}

	public static void setuBtiempoDeVidaMsj(String uBtiempoDeVidaMsj) {
		IdiomaGui.uBtiempoDeVidaMsj = uBtiempoDeVidaMsj;
	}

	public static String getuDtiempoDeVidaMsj() {
		return uDtiempoDeVidaMsj;
	}

	public static void setuDtiempoDeVidaMsj(String uDtiempoDeVidaMsj) {
		IdiomaGui.uDtiempoDeVidaMsj = uDtiempoDeVidaMsj;
	}

}
# Sala de Urgencias
________

##Esta es una aplicacion java que simula la atencion de una guardia de hospital.
###Debe tener instalado java y ant para poder compilar/ejecutar la aplicacion.
________
#####Abra un terminal en la carpeta hospitalDeSrc y ejecute lo siguiente para compilar, armar el jar y ejecutar la aplicacion.


######En windows:
######&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$ant win
	
######En linux:
######&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$ant all
	

#####Para sucesivas ejecuciones.
######En windows:
######&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;./hospiwin.bat
	
######En linux:
######&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;./hospi
______
#####La aplicacion permite el cambio de idioma.En /bin/config/common.properties, la propiedad idioma=ES setea la aplicacion en español. Puede convertirse al Inglés seteandola en EN. Lo que permite que, incorporando un archivo analogo a estos en la carpeta /bin/main/recursos/idioma/NOMBRE\_NUEVO\_IDIOMA.properties se incorpore un nuevo lenguaje.
_____
#####Es posible editar multiples valores de la aplicacion desde los archivos de configuración(/bin/main/config/ ), en particular, el archivo urgencias.txt permite ingresar rangos de tiempo, en los que se configuran para cada periodo las probabilidades de que aparezcaen la sala de urgencias pacientes de alta, media y baja prioridad.

#####Una linea de dicho archivo se ve:

#### 07:00%07:40%20%40%00%

#####Se lee:
#####De siete a siete cuarenta hay 20%de probabilidad de que ingrese un paciente de urgencia alta, 40% media y 0% baja.
____
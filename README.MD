#README 

Esta es una aplicacion java que simula la atencion de una guardia de hospital.
Debe tener instalado java y ant para poder compilar/ejecutar la aplicacion.

Abra un terminal en la carpeta hospitalDeSrc y ejecute
En windows 
	ant win
En linux
	ant all
compila, arma el jar y lo ejecuta.

Para sucesivas ejecuciones.
En windows
	./hospiwin.bat
En linux
	./hospi

---------------------------------------------------------------------------------
La aplicacion permite el cambio de idioma. En /bin/config/common.properties, la 
propiedad idioma=ES setea la aplicacion en español. Puede convertirse al Inglés 
seteandola en EN. Lo que permite que, incorporando un archivo analogo a estos en 
la carpeta /bin/main/recursos/idioma/NOMBRE_NUEVO_IDIOMA.properties se incorpore un 
nuevo lenguaje.

---------------------------------------------------------------------------------
Es posible editar multiples valores de la aplicacion desde los archivos de confi-
guración(/bin/main/config/ ), en particular, el archivo urgencias.txt permite 
ingresar rangos de tiempo, en los que se configuran para cada periodo las 
probabilidades de que aparezcaen la sala de urgencias pacientes de alta, media y
baja prioridad.

Una linea de dicho archivo se ve:

07:00%07:40%20%40%00%

se lee:
De siete a siete cuarenta hay 20%de probabilidad de que ingrese un paciente de 
urgencia Alta, 40% media y 0% baja.
--------------------------------------------------------------------------------


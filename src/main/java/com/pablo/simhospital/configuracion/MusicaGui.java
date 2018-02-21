package main.java.com.pablo.simhospital.configuracion;

import java.io.FileInputStream;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicaGui implements Runnable {
	static String nombreRecursoMusica;
	static String pathRecursoMusica;
	
	public Player musica;
	private InputStream input;
	public MusicaGui() {
		String strFilename = getPathRecursoMusica()+getNombreRecursoMusica();
		try {
			setInput(InputStream.class.getResourceAsStream(strFilename));
		} catch (Exception e) {
			try {
				setInput(new FileInputStream(strFilename));
			} catch (Exception e2) {
				// TODO: handle exception
				System.err.println("No se pudo cargar la musica" + "\n" +strFilename);
				e.printStackTrace();
				e2.printStackTrace();
			}
		}finally{
			try {
				setMusica( new Player(input));
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public void playSound() {
		
		 try {				
			 getMusica().play();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}

		}
	

	@Override
	public void run() {
		this.playSound();
	}

	public Player getMusica() {
		return musica;
	}

	public void setMusica(Player musica) {
		this.musica = musica;
	}

	public static String getNombreRecursoMusica() {
		return nombreRecursoMusica;
	}

	public static void setNombreRecursoMusica(String nombreRecursoMusica) {
		MusicaGui.nombreRecursoMusica = nombreRecursoMusica;
	}

	public static String getPathRecursoMusica() {
		return pathRecursoMusica;
	}

	public static void setPathpathRecursoMusica(String pathRecursoMusica) {
		MusicaGui.pathRecursoMusica = pathRecursoMusica;
	}
	public static void setPathRecursoMusica(String pathRecursoMusica) {
		MusicaGui.pathRecursoMusica = pathRecursoMusica;
	}
	public InputStream getInput() {
		return input;
	}
	public void setInput(InputStream input) {
		this.input = input;
	}
}

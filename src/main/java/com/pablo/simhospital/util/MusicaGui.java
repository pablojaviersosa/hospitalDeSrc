package main.java.com.pablo.simhospital.util;

import java.io.FileInputStream;
import java.io.InputStream;

import javazoom.jl.player.Player;

public class MusicaGui implements Runnable {
	static String nombreRecursoMusica;
	static String pathRecursoMusica;
	private Player musica;
	private InputStream input;
	public MusicaGui() {
	
	}
	public void playSound(String strFilename) {
		
		try {
			input = InputStream.class.getResourceAsStream(strFilename);
		} catch (Exception e) {
			try {
				input = new FileInputStream(strFilename);
			} catch (Exception e2) {
				// TODO: handle exception
				System.err.println("No se pudo cargar la musica" + "\n" +strFilename);
				e.printStackTrace();
				e2.printStackTrace();
			}
		} finally {
			try {
				setMusica( new Player(input));
				getMusica().play();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.playSound(getPathRecursoMusica()+getNombreRecursoMusica());
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
}

package main.java.com.pablo.simhospital.util;

import java.io.FileInputStream;
import java.io.InputStream;

import javazoom.jl.player.Player;

public class Musica implements Runnable {
	private Player musica;
	private String strFilename,s;
	

	public Musica(final String filename,String s) {
		this.strFilename = filename;
		this.s = s;
	}

	public void playSound(String filename,String s) {
		InputStream input;
		strFilename = filename;
		
		try {
			if (s.equals("SI")) {
				 input = InputStream.class.getResourceAsStream(strFilename);
			} else {
				input = new FileInputStream( new String("src") + strFilename);
			}
			musica = new Player(input);
			musica.play();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.playSound(strFilename,s);
	}
}

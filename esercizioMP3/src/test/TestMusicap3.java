package test;

import esercizioMP3.Musicap3;

public class TestMusicap3 {

	public static void main(String[] args) {
		Musicap3 mp3 = new Musicap3("mp3primo", "Canzone 1", "PincoPalla");
		System.out.println(mp3.getAutore());
		System.out.println(mp3.getByteOccupati());
		System.out.println(mp3.getFileName());
		System.out.println(mp3.getTitoloCanzone());
		
		Musicap3 mp3_2 = new Musicap3("mp3secondo", 400, "Canzone 2", "PincoPalla");
		System.out.println(mp3_2.getAutore());
		System.out.println(mp3_2.getByteOccupati());
		System.out.println(mp3_2.getFileName());
		System.out.println(mp3_2.getTitoloCanzone());
		


	}

}

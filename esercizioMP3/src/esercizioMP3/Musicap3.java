package esercizioMP3;

public class Musicap3 {
	
	private String fileName;
	private int byteOccupati=0;
	private String titoloCanzone;
	private String autore;
	
	public Musicap3(String fileName, int byteOccupati, String titoloCanzone, String autore) {
		this.fileName = fileName;
		this.byteOccupati = byteOccupati;
		this.titoloCanzone = titoloCanzone;
		this.autore = autore;
	}

	public Musicap3(String fileName, String titoloCanzone, String autore) {
		this.fileName = fileName;
		this.titoloCanzone = titoloCanzone;
		this.autore = autore;
	}

	public int getByteOccupati() {
		return byteOccupati;
	}

	public void setByteOccupati(int byteOccupati) {
		this.byteOccupati = byteOccupati;
	}

	public String getTitoloCanzone() {
		return titoloCanzone;
	}

	public void setTitoloCanzone(String titoloCanzone) {
		this.titoloCanzone = titoloCanzone;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
}

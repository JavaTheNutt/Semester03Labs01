package ie.wit.dvd.ver2;

public class Cd extends Device {
	
	private String artist;
	
	public Cd(int id, String title, double price, String artist) {
		super(id, title, price);
		this.artist = artist;
	}
	public String decoder(){
		return "mp3";
	}
	public void play(){

	}
	public String toString(){
		return super.toString() + "\nArtist:\t" + artist;
	}

}

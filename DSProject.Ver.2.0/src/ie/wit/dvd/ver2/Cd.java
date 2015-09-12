package ie.wit.dvd.ver2;
import javax.swing.JOptionPane;

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
		int response = JOptionPane.showConfirmDialog(null,toString(),"DVD Data Entry",JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
	}
	public String getArtist(){
		return artist;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}
	public String toString(){
		return super.toString() + "\nArtist:\t" + artist;
	}

}

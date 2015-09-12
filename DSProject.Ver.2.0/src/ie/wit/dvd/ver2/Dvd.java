package ie.wit.dvd.ver2;

public class Dvd extends Device 
{
	private String region;

	public Dvd(int id, String title, double price, String region) {
		super(id, title, price);
		this.region = region;

	}

	@Override
	public void play() {
		
	}

	@Override
	public String decoder() {
		return "avi";
	}
	
	public String getRegion(){
		return region;
	}
	public void setRegion(String region){
		this.region = region;
	}
	@Override
	public String toString(){
		return super.toString() + "\nRegion:\t" + region;
	}
}

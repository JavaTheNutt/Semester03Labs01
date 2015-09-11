package ie.wit.dvd.ver2;

public abstract class Device 
{
	protected int id;
	protected String title;
	protected double price;
	
	public Device(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	
	public abstract void play();
	public abstract String decoder();
	
	
	public String toString(){
		return "\nId:\t" + id + "\nTitle:\t" + title + "\nPrice:\t" + price;
	}
}

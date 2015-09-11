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
	
	
}

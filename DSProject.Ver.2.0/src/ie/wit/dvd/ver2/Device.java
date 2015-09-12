package ie.wit.dvd.ver2;

public abstract class Device 
{
	protected int id;
	protected String title;
	protected double price;
	
	public Device(int id, String title, double price) 
	{
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	
	public abstract void play();
	public abstract String decoder();
	
	public int getId()
	{
		return id;
	}
	public String getTitle()
	{
		return title;
	}
	public double getPrice()
	{
		return price;
	}
	 
	public void setId(int id)
	{
		this.id = id;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String toString()
	{
		return "\nId:\t" + id + "\nTitle:\t" + title + "\nPrice:\t" + price;
	}
}

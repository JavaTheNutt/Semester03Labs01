package ie.wit.dvd;

public class Dvd 
{
	private int id;
	private String title;
	private double price;
	
	public Dvd(int id, String title, double price) 
	{
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}


	public String toString() 
	{
		return "Dvd \nid=" + id + "\ntitle=" + title + "\nprice=" + price;
	}
	
	public String play()
	{
		return "This is a clip of " + title + " playing";
	}
	
	
	
}

package ie.wit.shape;

public abstract class Shape 
{
	/*The two methods below will return 0 
	 * by default for subclasses  that do not require 
	 * the attributes eg. point*/
	public double area()
	{
		return 0.0;
	}
	
	public double volume()
	{
		return 0.0;
	}
	
	public abstract String getName();
	
	public abstract void Draw();
}

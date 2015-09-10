package ie.wit.shape;
import javax.swing.JOptionPane;

public class Circle extends Point 
{
	protected double radius;
	
	public Circle(){
		setRadius(0);
	}
	
	public Circle(double r, int x, int y){
		super(x,y);
		setRadius(r);
	}
	public void setRadius(double r){
		radius = (r >=0.0 ? r : 0.0);
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double area(){
		return Math.PI * radius * radius;
	}
	
	@Override
	public String getName(){
		return "Circle";
	}
	
	public void Draw(){
		JOptionPane.showMessageDialog(null, getName() + ": " + this);
	}
}

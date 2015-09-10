package ie.wit.shape;
import javax.swing.JOptionPane;

public class Circle extends Point 
{
	protected double radius;
	
	public Circle(){
		setRadius(0);
	}
	
	public Circle(double r, int x, int y){
		//pass to constructor in superclass
		super(x,y);
		
		setRadius(r);
	}
	public void setRadius(double r){
		/*This expression acts like an if statement. The left side of the 
		 * expression is checking if the variable r is greater than or equal
		 *  to 0.0(not negative).If true, the value will be saved to the 
		 *  radius attribute. If the value is negative, the radius is set to 0*/
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

package ie.wit.shape;
import javax.swing.JOptionPane;

public class Point extends Shape 
{
	
	protected int x, y;
	
	//default constructor
	public Point() {
		setPoint(0,0);
	}
	
	//second constructor
	public Point(int x, int y) {
		setPoint(x,y);
	}

	public void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public String getName() 
	{
		return "Point";
	}

	//This method will display a dialog.
	@Override
	public void Draw() 
	{
		/*This calls the showMessageDialog() method on the static JOptionPane 
		 * object. It passes two parameters, an object and a string. The object is 
		 * set to null to allow the pane free movement. The string is a concatenation of 
		 * the getName() method with the this keyword, which will call the toString() 
		 * method on this object.*/
		JOptionPane.showMessageDialog(null, getName() + ": " + this);	//Output: Point: (...)

	}

}

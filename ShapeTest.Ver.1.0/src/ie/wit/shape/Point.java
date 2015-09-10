package ie.wit.shape;
import javax.swing.JOptionPane;

public class Point extends Shape 
{
	protected int x, y;
	
	public Point() {
		// TODO Auto-generated constructor stub
		setPoint(0,0);
	}
	
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
		// TODO Auto-generated method stub
		return "Point";
	}

	@Override
	public void Draw() 
	{
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, getName() + ": " + this);

	}

}

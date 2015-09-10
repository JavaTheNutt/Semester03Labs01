package ie.wit.shape;

import javax.swing.JOptionPane;

public class Cylinder extends Circle 
{
	protected double height;
	
	public Cylinder(){
		setHeight(0);
	}
	
	public Cylinder(double h, double r, int x, int y){
		super(r, x, y);
		setHeight(h);
	}
	
	public void setHeight(double h){
		height = (h >= 0 ? h : 0) ;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double area(){
		return 2 * super.area() + 2 * Math.PI * radius * height;
	}
	
	public double volume(){
		return super.area() * height;
	}
	
	public String toString(){
		return super.toString() + "; Height = " + height;
	}
	
	public String getName(){
		return "Cylinder";
	}
	
	public void Draw(){
		JOptionPane.showMessageDialog(null, getName() + ": " + this);
	}
}

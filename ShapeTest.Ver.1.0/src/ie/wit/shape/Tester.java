package ie.wit.shape;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Tester 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String output;
		Point point = new Point(7, 11);
		Circle circle = new Circle(3.5, 22, 8);
		Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);
		
		Shape arrayOfShapes[];
		 arrayOfShapes = new Shape[3];
		 arrayOfShapes[0] = point;
		 arrayOfShapes[1] = circle;
		 arrayOfShapes[2] = cylinder;
		 
		 point.Draw();
		 circle.Draw();
		 cylinder.Draw();
		 
		 DecimalFormat precision = new DecimalFormat("0.00");
		 
		 for(int i = 0; i < arrayOfShapes.length; i++){
			 arrayOfShapes[i].Draw();
		 }

	}

}

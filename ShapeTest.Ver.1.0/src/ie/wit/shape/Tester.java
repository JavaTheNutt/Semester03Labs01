package ie.wit.shape;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Tester 
{

	public static void main(String[] args) 
	{
		String output;
		Point point = new Point(7, 11);
		Circle circle = new Circle(3.5, 22, 8);
		Cylinder cylinder = new Cylinder(10, 3.3, 10, 10);
		
		Shape arrayOfShapes[];
		 arrayOfShapes = new Shape[3];
		 arrayOfShapes[0] = point;
		 arrayOfShapes[1] = circle;
		 arrayOfShapes[2] = cylinder;
		 
		 //This will format the decimals to two decimal places.
		 DecimalFormat precision = new DecimalFormat("0.00");
		 
		 for(int i = 0; i < arrayOfShapes.length; i++){
			 arrayOfShapes[i].Draw();
			 output = "\nArea = " + precision.format(arrayOfShapes[i].area()) + "\nVolume = " + precision.format(arrayOfShapes[i].volume());
			 JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphisim", JOptionPane.INFORMATION_MESSAGE);
		 }
		 System.exit(0);

	}

}

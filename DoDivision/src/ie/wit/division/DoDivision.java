package ie.wit.division;

import java.util.Scanner;

public class DoDivision 
{
	private int numerator;
	private int denominator;
	private double quotient;
	
	public static void main(String [] args)
	{
		DoDivision doIt = new DoDivision();
		 try
		 {
			 doIt.normalCase();
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println(e.getMessage());
			 doIt.giveSecondChance();
		 }
		 
		 System.out.println("End of Program.");
	}
	
	public void normalCase() throws ArithmeticException
	{
		System.out.println("Enter numerator:");
		Scanner sc =  new Scanner(System.in);
		numerator = sc.nextInt();
		
		System.out.println("Enter denominator:");
		denominator = sc.nextInt();
		if(denominator == 0)
		{
			throw new ArithmeticException("Sorry, can't devide by zero");
		}
		quotient = numerator /(double)denominator;
		System.out.println(numerator + "/" + denominator + " = " + quotient);
	}
	
	public void giveSecondChance()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Try again");
		System.out.println("Enter numerator");
		numerator = sc.nextInt();
		System.out.println("Enter denominator");
		System.out.println("be sure the denominator ins not zero");
		denominator = sc.nextInt();
		
		if(denominator == 0)
		{
			System.out.println("I cannot divide by zero");
			System.out.println("Since I cannot do what you want, the program will now end");
			System.exit(0);
		}
		
		quotient = ((double)numerator)/ denominator;
		System.out.println(numerator + "/" + denominator + "=" + quotient);
	}
}

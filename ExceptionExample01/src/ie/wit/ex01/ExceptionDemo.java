package ie.wit.ex01;
import java.util.Scanner;
public class ExceptionDemo 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter number of donuts:");
			int donutCount = sc.nextInt();
			if(donutCount < 1){
				throw new Exception("Out of donuts!");
			}
			System.out.println("Enter number of glasses of milk:");
			int milkCount = sc.nextInt();
			if(milkCount < 1){
				throw new Exception("Out of milk!");
			}
			double donutsPerGlass = donutCount / (double)milkCount;
			System.out.println(donutCount + " donuts.");
			System.out.println(milkCount + " glasses of milk.");
			System.out.println("You have " + donutsPerGlass + " donuts per glass.0");
		} catch(Exception e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}

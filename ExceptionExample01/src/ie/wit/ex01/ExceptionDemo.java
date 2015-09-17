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
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println("Enter number of glasses of milk");
			int milkCount = sc.nextInt();
			if(milkCount < 1){
				throw new Exception("Out of milk!");
			}
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

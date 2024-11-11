package sahil;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCath_class 
{
	public static void main(String[] args)
	{
		try 
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s1.nextInt();
		}
		catch(InputMismatchException a)
		{
			Scanner s2 = new Scanner(System.in);
			System.out.println("Please enter a valid age");
			int age = s2.nextInt();
		}
		}
		}
	



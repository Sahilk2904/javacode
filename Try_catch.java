package sahil;

import java.util.InputMismatchException;

public class Try_catch 	
{

	public static void main(String[] args)
	{
		try
		{
			int i=10;
			
		int	j=i/0;
			
		}
		
		
		catch( ArithmeticException e1)
		{
			System.out.println("exception handled");
		}
		catch( InputMismatchException e2)
		{
			
			
		}
		finally
		{
			System.out.println("Welcome to GTM");
		}
	}
}

	



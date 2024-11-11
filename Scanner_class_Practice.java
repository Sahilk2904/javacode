package sahil;

import java.util.Scanner;

public class Scanner_class_Practice
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Press 1 for chrome browser");
		System.out.println("Press 2 for edge browser");
		
		int selection = s.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Chrome browser launch");
			break;
		case 2:
			System.out.println("edge browser launch");
			break;
		default:
			System.out.println("invalid selection: please choose 1 or 2");
			break;
		}
		
		s.close();

	}

}

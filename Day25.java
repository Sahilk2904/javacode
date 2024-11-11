package sahil;

import java.util.Arrays;
import java.util.Scanner;

public class Day25
{
public static void main(String[] args)
{
	Scanner s1 = new Scanner(System.in);
	
	System.out.println("enter the length of array");
	int a = s1.nextInt();
	int rollno[] = new int[a];
	int notocheck=34;
	for (int i = 0;i<rollno.length;i++)
	{
			rollno[i]=s1.nextInt();	
	}
	System.out.println(Arrays.toString(rollno));
	
	for (int i = 0;i<rollno.length;i++)
	{
		rollno[i]=s1.nextInt();	

		if(notocheck==rollno[i])
		{
			System.out.println("Given number is "+notocheck+"in present in Array");
		}
		else
		{
			System.out.println("Given number is "+notocheck+"in Not present in Array");

		}
	}
	
}
}

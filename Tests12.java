package sahil;

import java.util.Arrays;

public class Tests12
{		
	public static void main(String[] args) 
	{
		String input1= "ram";
		String input2= "arm";
		
		char c1[]= input1.toCharArray();
		char c2[]= input2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b1=Arrays.equals(c1, c2);
		if (b1==true)
		{
			System.out.println("Given String is anagaram");
		}
		else
		{
			System.out.println("Given String is not anagaram");
		}
		
	}
}
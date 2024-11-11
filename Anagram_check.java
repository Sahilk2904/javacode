package sahil;

import java.util.Arrays;

public class Anagram_check 
{

	public static void main(String[] args) 
	{
		String input="ram";
		String output="arm";
		
		char c1[]= input.toCharArray();
		char c2[]=output.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b=Arrays.equals(c1, c2);
		
		System.out.println(b);
		if(b==true)
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}

	}

}

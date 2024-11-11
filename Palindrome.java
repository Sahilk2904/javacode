package sahil;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String input="radar";
		String output="";
		
		for(int i=input.length()-1; i>=0;i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("Plaindrome");
		}
		else
		{
			System.out.println("NOT Plaindrome");
		}
	}

}

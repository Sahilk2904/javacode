package sahil;

import java.util.Arrays;

public class Rever_string {

	public static void main(String[] args)
	{
	String input="sahil";
	String output="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char c=input.charAt(i);
		output=output+c;
		
	}
			System.out.println(output);

	}

}

package sahil;

public class Day24
{
public static void main(String[] args) {
	String input ="RADAR";
	String output="";
	
	for(int i =input.length()-1;i>=0;i--)
	{
		char c= input.charAt(i);
		output=output+c;
		
	}
	System.out.println(output);
	if(output.equals(input))
	{
		System.out.println("given string is palindrom");
	}
	else
	{
		System.out.println("given string is not palindrom");
	}
}
}

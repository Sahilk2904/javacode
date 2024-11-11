package sahil;

public class Revrese_String 
{
	public static void main(String[] args) {
		
	
	String input = "sahil";
	String output = "";
	
	/*for (int i=input.length()-1;i>=0;i--)
	{
		char c = input.charAt(i);
		output=output+c;
	}
	System.out.println(output);*/
	
	for (int i = input.length()-1;i>=0;i--)
	{
		char c[] = input.toCharArray();
		output=output+c[i];
		
	}
	System.out.println(output);
}
}
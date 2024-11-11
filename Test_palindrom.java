package sahil;

public class Test_palindrom {

	public static void main(String[] args)
	{
		String input ="radar";
		String output= "";
		
		for(int i = input.length()-1;i>=0;i--)
		{
			char c= input.charAt(i);
			output=output+c;
		}
		//System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}

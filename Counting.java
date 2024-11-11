package sahil;

public class Counting 
{
	public static void main(String[] args) {
		
	
	String input = "sahil 9466816635";
	int countofalpabet=0;
	int countofnumeric=0;
	int countofspace=0;
	
	char c[]=input.toCharArray();
	
	for(int i =0;i<input.length();i++)
	{
		boolean b=Character.isLetter(c[i]);
		//System.out.println(b);
		if(b==true)
		{
			countofalpabet++;
		}	
	}
	System.out.println(countofalpabet);
	
	//=========================================//
	
	for(int i =0;i<input.length();i++)
	{
		boolean d=Character.isDigit(c[i]);
		//System.out.println(b);
		if(d==true)
		{
			countofnumeric++;
		}	
	}
	System.out.println(countofnumeric);
	
	//+++++++++++++++++++++++++++++++++++++++++++//
	
	for (int i =0;i<input.length();i++)
	{
		boolean f=Character.isWhitespace(c[i]);
		if(f==true)
		{
			countofspace++;
		}
	}
	System.out.println(countofspace);
}
}
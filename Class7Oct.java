package sahil;

public class Class7Oct
{
	Class7Oct()
	{
	System.out.println("constructor 1");	
	}
	
	Class7Oct(String a)
	{
		System.out.println("constructor 2");	
	}
	
	Class7Oct(int b)
	{
		System.out.println("constructor 3");
	}

	public static void main(String[] args) 
	{
		
		Class7Oct c=new Class7Oct();
		Class7Oct c1=new Class7Oct("Sahil");
		Class7Oct c2=new Class7Oct(100);
	}

}

package sahil;

public class TTest1 
{
	TTest1()
	{
	System.out.println("Constructor1");	
	}
	
	
	TTest1(String a)
	{
		System.out.println("Constructor2");	
	}
	
	public static void main(String[] args)
	{
		TTest1 t1 = new TTest1();
		TTest1 t2 = new TTest1("J");
		
	}

}

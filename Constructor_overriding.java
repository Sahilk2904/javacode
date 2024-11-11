package sahil;

public class Constructor_overriding 
{
	Constructor_overriding(int a)
	{
		System.out.println("constructor1");
	}
	
	Constructor_overriding()
	{
		this(100);
		System.out.println("constructor2");
	}

	public static void main(String[] args)
	{
		Constructor_overriding m1=new Constructor_overriding();

	}

}

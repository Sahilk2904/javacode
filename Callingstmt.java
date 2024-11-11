package sahil;


class addition 
{
	addition(String s)
	{
		super();
		System.out.println("addition");
	}
}


class subtract extends addition
{
	subtract(int a)
	{
		super("Sahil");
		System.out.println("subtraction");
	}

}

class divide extends subtract
{
	divide(float f)
	{
		super(23);
		System.out.println("divide");
	}

}
public class Callingstmt extends divide
{
	Callingstmt()
	{
		super(3.14f);
		System.out.println("call");
	}

	public static void main(String[]args) 
	{
		
		Callingstmt c = new Callingstmt();
		
		System.out.println("Change");
	}
}



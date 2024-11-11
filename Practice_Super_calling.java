package sahil;

class adding
{
	adding(String s)
	{
		System.out.println("addition");
	}
}

class subtraction1 extends adding
{
	subtraction1(int a)
	{
		super("Sahil");
		System.out.println("subtraction");
	}
}

class diff1 extends subtraction1
{
	diff1(float f)
	{
		super(34);
		System.out.println("diff");
	}
}

public class Practice_Super_calling extends diff1
{
	Practice_Super_calling()
	{
		super(3.14f);
		System.out.println("calling statement");
	}
	
	
	
	public static void main(String[] args) 
	{
		Practice_Super_calling p = new Practice_Super_calling();
	}
}

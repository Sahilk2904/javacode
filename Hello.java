package sahil;

public class Hello {

	public static void main(String[] args) {
		Hello a1 =new Hello();
		new Hello(2,3);	
		new Hello(2.1,5);
		
	}
	
Hello()
{
	System.out.println("Non Para");
	}
Hello(int a, int b)

{
	System.out.println("Para 1");
	}
Hello(double c, int d)
{
	System.out.println("Para 2");
	}
}


package sahil;

public class NSSmethods
{
	void sum() {	//Non-static method
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
}
	void sub() {
		int a =20;
		int b =5;
		int sub=a-b;
		System.out.println(sub);
		
	}
	
	void multiply() {
		int a=10;
		int b=25;
		int multiply=a*b;
		System.out.println(multiply);
	}

public static void sub1(int a, int b) //static method parameterized
{
	int c= a+b;
	System.out.println(c);
}

public static void sub2(int a, float b) 
{
	double c= a+b;
	System.out.println(c);
}

public static void sub3(int a, int b) 
{
	double c= a*b;
	System.out.println(c);
}
	
public static void main(String[] args) {
	
		NSSmethods s1 = new NSSmethods();
		s1.sum();
		s1.multiply();
		s1.sub();
		
		sub1(4,4);
		sub2(4, 4.8f);
		sub3(8,3);
	}

}

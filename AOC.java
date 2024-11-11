package sahil;

public class AOC 
{
	final double pi = Math.PI;	
	
	void areaofcircle1()
	{	
		for (int i=1;i<10;i++)
		{	
			double r = Math.random();
			System.out.println("value of r-->" + r);
			double area = pi*r*r;
			System.out.println(area);		
		}
		}
public static void main(String[] args) 
{
AOC a = new AOC();

a.areaofcircle1();
}
}

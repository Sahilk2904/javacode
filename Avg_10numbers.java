package sahil;

public class Avg_10numbers
{

	public static void main(String[] args) 
	{
		double sum=0;
		for(int i=1;i<=10;i++)
		{
			
			//System.out.println(i);
			sum=sum+i;
		}
System.out.println(sum);
double average =sum/10;
System.out.println(average);
	}

}

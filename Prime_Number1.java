package sahil;

public class Prime_Number1 
{
	

	public static void main(String[] args) 
	{
		int n=7;
		int flag=0;
		for (int i =2;i<=n/2;i++)
		{
			if(n%i!=0)
			{
				flag=1;
			}
			System.out.println("this is a prime number");
			
		}
		
		
	}

}

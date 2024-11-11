package sahil;

class login
{
	private String s="sahil@gmail.com";
	
	public String getS()
	{
		return s;
	}
	public void setS(String s)
	{
		this.s=s;
	}
}

public class Encapsulation_method 
{


	public static void main(String[] args) 
	{
		login l= new login();
		l.setS("Kirti");
		
		System.out.println(l.getS());
	}

}

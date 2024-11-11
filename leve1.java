package sahil;

class level4
{
	void finish()
	{
		System.out.println("thank you");
	}
}
class level3 extends level4
{
void payment()
{
	System.out.println("payment processing");
	}
}
class level2 extends level3
{
	void cart()
	{
		System.out.println("cart is ready");
	}
}
public class leve1 extends level2
{
	void login()
	{
		System.out.println("login to amazon");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		leve1 x =new leve1();
        x.login();
        x.cart();
        x.payment();
        	
		x.finish();

	}

}

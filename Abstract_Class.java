package sahil;

abstract class Fb_login {
	void fb_account() 
	{
	System.out.println("fb_login");	
	}
	
abstract class amazon_login extends Fb_login {
	abstract void login_amazon();
	abstract void amazon_cart();
}
}
class flipkart_login extends Fb_login {
	void flipkart()
	{
		System.out.println("flipkart login");
	}
}
public class Abstract_Class extends flipkart_login{

	public static void main(String[] args) {
		
		Abstract_Class a = new Abstract_Class();
		a.login_amazon();
		a.amazon_cart();
		a.fb_account();
		a.flipkart();
	}

 void amazon_cart() {
		System.out.println("Amazon cart");
		
	}

	void login_amazon() {
		System.out.println("Login Amazon");
		
	}

	
}
 
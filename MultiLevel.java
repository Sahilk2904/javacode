package sahil;

public class MultiLevel {
	void cart()
	{
		System.out.println("Your cart is empty");
	}
	public static void main(String[] args) {
		loginflipkart m = new loginflipkart();
		m.login();
		m.cart();
		m.payment();
		m.card();
	}
}

class MultiLevel2 extends MultiLevel {
	void payment()
	{
		System.out.println("do the payment");
	}
}

class MultiLevel3 extends MultiLevel2{
	void card()
	{
		System.out.println("saved card details");
	}	
	
}
class loginflipkart extends MultiLevel3{
	void login()
	{
		System.out.println("login flipkart");
	}	
}


	



	

			





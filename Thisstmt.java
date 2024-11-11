package sahil;

public class Thisstmt {
	
	Thisstmt(){
		System.out.println("parameterized");
	}
	
	Thisstmt(int a){
		this();
		System.out.println("non parameterized");
	}
	public static void main(String[] args) {
		
		new Thisstmt(6);
		System.out.println("Main method");
	}

}

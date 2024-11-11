package sahil;

public class Day23
{
public static void main(String[] args) {
	String a1 = "SAHIL Kumar";
	String a2 = "sahil KUMAR";
	
	boolean s = a1.equals(a2);
	System.out.println(s);
	
	boolean q =a1.equalsIgnoreCase(a2);
	System.out.println(q);
	
	String repl=a2.replaceAll("[a-z]", "");
	System.out.println(repl);
	
	boolean z =a1.contains("kumar");
	System.out.println(z);
	
	boolean m =a1.matches("(.*)r");
	System.out.println("checking->"+m);
	
	boolean c =a1.matches("m(.*)");
	System.out.println("checking->"+c);
	
	boolean ac= a1.contains("j");
	System.out.println(ac);
	
	boolean ac1= a1.matches("(.*)m(.*)");
	System.out.println(ac1);
	
	String m1="sahil";
	boolean m2=m1.matches(".....");
	System.out.println(m2);
	
	char mg=a1.charAt(3);
	System.out.println(mg);
	
	int mn=a1.indexOf('K');
	System.out.println(mn);

}
}

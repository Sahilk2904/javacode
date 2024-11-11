package sahil;

import java.util.HashMap;
import java.util.Map;

public class Class10 
{
public static void main(String[] args) 
{
	Map<String,String> m1=new HashMap<String,String>();
	m1.put("GTM13", "Annu");
	m1.put("GTM14", "Radhika");
	m1.put("GTM15", "Karishma");
	m1.put("GTM16", "Vaibhav");
	System.out.println(m1);
	
	Map<String,String> m2=new HashMap<String,String>();
	m2.put("GTM18", "Arbind");
	m2.put("GTM19", "Yamini");
	m2.put("GTM20", "Sahil");
	m2.put("GTM21", "Dhanraj");
	System.out.println(m2);	
	
	
boolean b1=	m1.containsKey("123");
	boolean b2=m1.containsValue("Manish");
	System.out.println(b1);
	System.out.println(b2);

	
}
}

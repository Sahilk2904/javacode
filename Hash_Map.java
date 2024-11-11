package sahil;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map 
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
		
		
		
		boolean b1=			m1.equals(m2);
		System.out.println(b1);
		
		m1.putAll(m2);
		System.out.println(m1);
		
		
		m1.clear();
		System.out.println(m1);
		System.out.println(m1.isEmpty());
		
		
		m1.putIfAbsent("GTM12", "MANISH");
		System.out.println(m1);
		
		
		
		
		
		
	}

}







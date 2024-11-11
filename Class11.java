package sahil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class11 {

	public static void main(String[] args) 
	{
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("GTM13", "Annu");
		m1.put("GTM14", "Radhika");
		m1.put("GTM15", "Karishma");
		m1.put("GTM16", "Vaibhav");
		System.out.println(m1);
		
		
		Set<Entry<String,String>> p1=				m1.entrySet();
			Iterator<Entry<String,String>>	i1= 	p1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	/*	
		for(String	s1	:	m1.keySet())
		{
			System.out.println(s1);
		}
		for(	String s2:			m1.values())
		{
			System.out.println(s2);
		}
		
		for(	Entry<String,String> s3     :			m1.entrySet())
		{
			System.out.println(s3);
		}
*/
	}

}

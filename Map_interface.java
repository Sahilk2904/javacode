package sahil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_interface {

	public static void main(String[] args) 
	{
		Map<String,String> m1=new HashMap<String,String>();
		
		m1.put("Sahil", "Atullah");
		m1.put("Saanu", "yadu");
		 
		System.out.println(m1);
		
		 Set<Entry<String, String>> s2 = m1.entrySet();
         Iterator<Entry<String, String>> s5 = s2.iterator();
	
	}

}

package sahil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_practice 
{

	public static void main(String[] args)	
	{
		Map<String, String> m1= new HashMap<String, String>();
		m1.put("GTM11","Sahil");
		m1.put("GTM12", "eeshan");
		m1.put("GTM13", "kirti");
		
		//Printing the Keyset
		for(String s3 : m1.keySet())
		{
			System.out.println("Printing the Keys " + s3);
		}
		
		//Printing the valueSet
		
		for(String s4:m1.values())
		{
			System.out.println("Printing the value " + s4);
		}
		
		Set <Entry <String, String>> s1= m1.entrySet();
		Iterator <Entry <String, String>> i1		=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}

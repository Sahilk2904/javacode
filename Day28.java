package sahil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Day28 {

	public static void main(String[] args)
	{
		List li = new ArrayList();
		li.add(999);
		li.add(888);
		li.add(777);
		li.add(666);
		//Collections.sort(li);
		//System.out.println(li);
		
		/*List l2 = new ArrayList();
		l2.add("sahil");
		l2.add("mithu");
		l2.add("kirti");
		l2.add("shivansh");
		
		l2.addAll(li);
		System.out.println(l2);*/
		
		/*li.remove(1);
		System.out.println(li);*/
		
		/*li.clear();
		System.out.println(li);*/
		
		/*boolean b=li.isEmpty();
		System.out.println(b);
		
		boolean b1 =li.contains(999);
		System.out.println(b1);
		
	Object o=	li.get(2);
		System.out.println(o);*/
		
		/*int a=10;
		while(a>5)
		{
			System.out.println(a);
			a++;
		}*/
		
		Iterator m1= li.iterator();
		while(m1.hasNext())
		{
			System.out.println(m1.next());
		}
	}

}

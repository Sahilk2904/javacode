package sahil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Checking_test
{
public static void main(String[] args)
{
	ArrayList a1=new ArrayList();
	a1.add(200);
	a1.add(190);
	a1.add(90);
	a1.add(120);
	a1.add(221);
	a1.add(191);
	a1.add(191);
	//a1.add("sahil");
	a1.add(null);
	//Collections.sort(a1);
	
	System.out.println(a1);
	
	Iterator i1=a1.iterator();
	
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	ListIterator i2 =a1.listIterator();
	
	while(i2.hasNext())	
	{
	System.out.println(i2.next());	
	}
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	}

	
	
}


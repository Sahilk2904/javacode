package sahil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListofIterator 
{	
	public static void main(String[] args)
	{		
	List li	=new ArrayList();
	li.add(90);
	li.add(901);
	li.add(166);
	li.add(133);
	
	//System.out.println(li);
	
	Iterator i1 = li.iterator();
	
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	System.out.println("Using list iterator");
	
	ListIterator i2 =li.listIterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	System.out.println("reverse way");
	
	while(i2.hasPrevious())
	{
		System.out.println(i2.previous());
	}
	
	
	
	
	}
}


package sahil;

import java.util.Enumeration;
import java.util.Stack;

public class Enumeration1 
		{
			public static void main(String[] args) 

			{
			
				Stack s1 = new Stack();
				s1.add(43);
				s1.add(32);
				s1.add(21);
				s1.add(61);
				
				System.out.println(s1);
				
				Enumeration e1 = s1.elements();
				
				while(e1.hasMoreElements())
				{
					System.out.println(e1.nextElement());
				}
				
				
				
				
			}

		}

	



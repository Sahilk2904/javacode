package sahil;

import java.util.Date;

public class Date_check {

	public static void main(String[] args) 	
	{
		Date d1 = new Date();
		System.out.println(d1);
		String s=d1.toString();
		String s1=s.substring(8, 11);
		System.out.println(s1);
		
		String a= "sahilKumar";
		int s2=a.codePointAt(5);
		System.out.println(s2);
		
		
	}

}

package sahil;

import java.util.Arrays;
import java.util.Date;

public class Check_1 
{
public static void main(String[] args) 
{
	String input="sahil";
	String output="";
	
	for(int i =input.length()-1;i>=0;i--)
	{
		char c = input.charAt(i);
		output=output+c;
		
	}
	char g[]=output.toCharArray();
	System.out.println(Arrays.toString(g));
	
	/*Date d1= new Date();
	System.out.println(d1);
	
	String CurrentTime=d1.toString();
	String CurrentYear=CurrentTime.substring(CurrentTime.length()-4);
	System.out.println("CurrentYear "+ CurrentYear);*/
	
	String name1[] = new String[4];
	name1[0]="sahil";
	name1[1]="kirti";
	name1[2]="saanvika";
	name1[3]="shivansh";
	
	String name2[]=new String[4];
	name2[0]="sahil";
	name2[1]="kirti";
	name2[2]="saanvika";
	name2[3]="shivansh";
	
	boolean b=Arrays.equals(name1, name2);
	System.out.println("String compare--> "+ b);
	
	char c1[]=new char[4];
	c1[0]='s';
	c1[1]='a';
	c1[2]='h';
	c1[3]='i';
	
	char c2[]= new char[4];
	c2[0]='s';
	c2[1]='a';
	c2[2]='h';
	c2[3]='i';
	
	boolean t=Arrays.equals(c1, c2);
	System.out.println("Char Compare-->"+t);
}
}

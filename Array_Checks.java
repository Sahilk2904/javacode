package sahil;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Checks 
{
public static void main(String[] args)
{
Scanner s1 = new Scanner(System.in);

int a[]= new int[4];
System.out.println("Please enter the values");
 int t=0;
 
 for(int i=0;i<a.length;i++)
 {
	 a[i]=s1.nextInt();
 }
 for(int i=0;i<a.length;i++)
 {
	 for(int j=i+1;j<a.length;j++)
	 {
		 if (a[j]>a[i]);
		 {
			 t=a[i];
			 
			 a[i]=a[j];
			 
			 a[j]=t;
		 }
	 }
 }
System.out.println(Arrays.toString(a));
}
}

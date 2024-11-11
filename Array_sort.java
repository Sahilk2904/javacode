package sahil;

import java.util.Scanner;
import java.util.Arrays;


public class Array_sort 
	{
	    public static void main(String args[])
	    {
	        Scanner s1 = new Scanner(System.in);
	        int a[] = new int[4];
	        System.out.println("Enter the array values");
	        
	        int t=0;
	        for(int i=0;i<a.length;i++)
	        {
	            a[i] = s1.nextInt();
	        }
	        
	        for(int i=0;i<a.length;i++)
	        {
	            for(int j=i+1;j<a.length;j++)
	        {
	            if(a[j]<a[i])
	            {
	                t = a[i];
	                a[i] = a[j];
	                a[j] = t;
	            }
	        }
	        }
	        
	        System.out.println(Arrays.toString(a));
	    }
	    
}


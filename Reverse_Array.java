package sahil;

import java.util.Arrays;

public class Reverse_Array
{
public static void main(String[] args) {
	int a[] = {2,4,6,8,10};
	int b[]= new int[5];
	
	for (int i=0,k=4;i<=a.length-1;i++,k--)
	{
		b[k]=a[i];
	}
	System.out.println(Arrays.toString(b));
}
}

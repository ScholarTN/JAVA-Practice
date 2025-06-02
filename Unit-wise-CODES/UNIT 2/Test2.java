//Write a Java program to move all zeros in an array to the end while maintaining the relative order of non-zero elements.
import java.util.*;
public class Test2
{
	public static void main(String[] arg)
	{
		int[] a = {0,0,1,3,0,2,4};
		int index = 0;
		int i = 0;
		while(i<a.length)
		{
			if(a[index]!=0)
			{
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
				index++;
				i++;
			}
			i++;
		}
		System.out.println(Arrays.toString(a));
	}
}

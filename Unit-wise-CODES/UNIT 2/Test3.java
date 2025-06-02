// Write a Java program to find and print all unique elements from a given array using a Set
import java.util.*;
public class Test3
{
	public static void main(String[] arg)
	{
		int[] a = {1,1,1,1,1,2,2,2,3,3,3,4,4};
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		System.out.println(set);
	}
}

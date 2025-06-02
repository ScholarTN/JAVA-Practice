//Write a Java program to calculate the maximum profit by choosing a day to buy and a later day to sell from a given list of stock prices.
import java.util.*;

public class Test
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		int  cp = 99999;
		int max = 0;
		for(int i=0; i<a.length;i++)
		{
			if (a[i]<cp)
				{cp = a[i];}
			else{
				int p = a[i]-cp;
				max = Math.max(p,max);
			}
		}
		System.out.println("Max profit:"+max);
	}
}

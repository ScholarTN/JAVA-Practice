import java.util.*;
public class Test4
{
	public static void main(String[] arg)
	{
		int a[] = {1,2,3,2,1,0};
		for(int i=0;i<a.length/2;i++)
		{
			if(a[i]!=a[a.length-1-i])
			{
				System.out.println("Not a pallindrome");
				System.exit(0);
			}
		}
		System.out.println("Pallindrome");
	}
}

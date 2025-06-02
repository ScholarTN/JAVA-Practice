import java.util.*;
public class RevArr
{
	void reverse(int a[],int start,int end)
	{
		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] arg)
	{
		int a[] = {1,2,3,4,5,6};
		int k = 3;
		RevArr obj = new RevArr();
		obj.reverse(a, 0, a.length-1);
		obj.reverse(a,0,k-1);
		obj.reverse(a,k,a.length-1);
		System.out.println(Arrays.toString(a));
	}
}

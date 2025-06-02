import java.util.*;
public class Test5
{
	public static void main(String[] arg)
	{
		int a[] = {1,2,3,4,5,6,2};
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<a.length;i++)
		{
			if(set.contains(a[i])){
				System.out.println(true);
				System.exit(0);
			}
			set.add(a[i]);
		}
		System.out.println(false);
	}
}

import java.util.*;
public class HashAdd
{public static void main(String[] arg)
{
	Integer a[] = {2,7,11,15};
	int target = 9;
	int result[] = new int[2];
	HashMap<Integer,Integer> mp = new HashMap<>();
	for(int i=0; i<a.length; i++)
	{
		int second_number = target - a[i];
		if(mp.containsKey(second_number))
		{
			result[0]=mp.get(second_number);
			result[1]=i;
			break;
		}
	}
	System.out.println(Arrays.toString(result));
}
}

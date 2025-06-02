// Check if a target word can be constructed from the characters of another string, using each character only as many times as it appears.
import java.util.*;
public class Le01
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		String m = sc.nextLine();
		int a[] = new int[26];
		for(int i=0;i<m.length();i++)
		{
			char ch = m.charAt(i);
			a[ch-'a']++;
		}
		for(int i=0; i<r.length();i++)
		{
			char ch = r.charAt(i);
			if(a[ch-'a']>0)
			{
				a[ch-'a']++;
			}else{
				System.out.println(false);
				return ;
			}
		}
		System.out.println(true);
		return;
	}
}

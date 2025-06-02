import java.util.*;
public class Le02
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == '{' || ch == '(' || ch == '[')
			{
				st.push(ch);
			}else{
				if(st.isEmpty())
				{
					System.out.println(false);
					System.exit(0);
				}else if(ch=		
				}
			}
	}
}

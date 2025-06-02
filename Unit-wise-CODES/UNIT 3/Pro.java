import java.util.*;
public class Pro
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		String d = sb.toString();
		if(s.equals(d)){
			System.out.println("hi");
		}
		else{
			System.out.println("bye");
		}
	}
}

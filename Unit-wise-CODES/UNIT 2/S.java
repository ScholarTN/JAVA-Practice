import java.util.*;
public class S
{
	public static void main(String arg[])
	{
		//String s = "i am a student of lpu";
		//String s1 = s.replace('a','e');// replace all occurance of charecters
		//System.out.println(s1);

		//String s1 = s.replaceAll("a","e");
		//String s1 = s.replaceAll(" ","");
		//String s1 = s.replaceAll("\\s","");
		//String s1 = s.replaceAll("am","was");

		//String s1[] = s.split(" "); 
		//System.out.println(Arrays.toString(s1));

		/*for(String w:s.split(" ",3))// note 3 means the string is divided into 3 words, but 0 means all words
		{
			System.out.println(w);
		}*/

		/*String s = "Welcome";
		//String s1 = s.substring(0);
		String s1 = s.substring(3,5);
		System.out.println(s1);

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		//how to convert int to string
		int a=5;
		String s3 = String.valueOf(a);
		System.out.println(s3+8);// 58

		// convert every char of a string to its corresponding ascii code
		String s4 = "ABCD";
		byte b[] = s4.getBytes();
		System.out.println(Arrays.toString(b));

		for(byte z:b)
		{
			System.out.println(z);
		}*/

		//StringBuffer sb = new StringBuffer("hello");
		/*sb.append(" world");
		System.out.println(sb);*/

		//sb.insert(1,"java");
		//System.out.println(sb);

		//sb.replace(1,3,"java");// replaces from index 1 to 2
		//sb.delete(1,3);
		//sb.reverse();

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// 16
		sb.append("123456789123456789");
		System.out.println(sb.capacity());// 34
		sb.ensureCapacity(40);// can only increase the capacity
		System.out.println(sb.capacity());// 70
	}
}


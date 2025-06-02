// write a program to count number of vowels in the file
import java.io.*;
public class CountVowels
{
public static void main(String[] arg) throws IOException
{
	BufferedReader file2 = new BufferedReader(new FileReader("john.txt"));
	int ch=0;
	int count = 0;
	String v = "aeiouAEIOU";
	while((ch=file2.read())!=-1)
	{
		if(v.indexOf((char)ch)!=-1)
		{
			count++;
		}
	}
	System.out.println(count);
	file2.close();
}
}

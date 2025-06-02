// write a program to count how many vowels are there in a file
import java.io.*;
public class Temp4
{
	public static void main(String[] arg) throws IOException
	{
		Reader file1 = new FileReader("file.txt");
		int ch;
		int count=0;
		String v = "aeiouAEIOU";
		while((ch=file1.read())!=-1)
		{
			if(v.indexOf((char)ch)!=-1)
				count++;
		}
		System.out.println(count++);
		file1.close();
	}
}

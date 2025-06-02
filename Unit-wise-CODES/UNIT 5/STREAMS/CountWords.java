//count no of words in a file

import java.io.*;

public class CountWords
{
	public static void main(String[] arg) throws IOException
	{
		Reader file = new FileReader("file.txt");
		char[] arr = new char[100];
		file.read(arr);
		String s = String.valueOf(arr);
		String[] result = s.split("");
		System.out.println(result.length);
		file.close();
	}
}

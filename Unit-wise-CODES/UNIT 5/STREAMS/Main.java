import java.io.*;
import java.util.*;

public class Main 
{
	public static void main(String[] arg) throws IOException
	{
		InputStream file1 = new FileInputStream("file.txt");
		byte[] arr = new byte[50];

		file1.skip(5);

		file1.read(arr);
		//convert byte array to string
		String result = new String(arr);
		System.out.println(result);
		file1.close();
	}
}

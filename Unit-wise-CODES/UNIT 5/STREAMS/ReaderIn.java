import java.io.*;
public class ReaderIn
{
	public static void main(String[] arg) throws IOException
	{
		Reader obj = new FileReader("file.txt");
		char[] arr = new char[50];
		obj.read(arr);
		System.out.println(arr);
		obj.close();
	}
}

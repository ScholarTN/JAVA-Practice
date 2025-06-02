import java.io.*;
public class WriterOut
{
	public static void main(String[] arg) throws IOException
	{
		Writer output = new FileWriter("file.txt");
		char[] arr = "hello".toCharArray();
		output.write("hello");// string is a char type array
		System.out.println("Completed");
		output.close();
	}
}

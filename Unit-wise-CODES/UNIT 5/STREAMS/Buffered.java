// write a program to increase effiency of reading
import java.io.*;
public class  Buffered
{
public static void main(String[] arg) throws IOException
{
	BufferedReader file1 = new BufferedReader(new FileReader("file.txt"));

	String s;
	while((s=file1.readLine())!=null)
	{
		System.out.println(s);
	}
	file1.close();
}
}

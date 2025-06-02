// write a program to copy content from one file to another
import java.io.*;
public class Temp2
{
	public static void main(String[] arg) throws IOException
	{
		Reader file1 = new FileReader("file.txt");
		Writer file2 = new FileWriter("newfile.txt");

		int ch;
		while((ch=file1.read())!=-1)
		{
			file2.write((char)ch);
		}
		System.out.println("Completed");
		file1.close();
		file2.close();
	}
}

// write a program to read the content of a file and display it in the console

import java.io.*;

public class Temp{
	public static void main(String[] arg) throws IOException
	{
		Reader file = new FileReader("file.txt");
		/*char[] ch = new char[50];
		file.read(ch);
		System.out.println(ch);
		*/
		int ch;
		while((ch=file.read())!=-1)
		{
			System.out.print((char)ch);
		}
		file.close();
	}
}

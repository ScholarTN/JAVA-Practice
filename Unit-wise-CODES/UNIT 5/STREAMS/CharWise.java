// write a program to read char wise
import java.io.*;
public class CharWise{
	public static void main(String[] arg) throws IOException
	{
		Reader file = new FileReader("file.txt");
		int cha;
		while((cha=file.read())!=-1)
		{
			System.out.println((char)cha);
		}
		//System.out.println(cha);
		file.close();
	}
}

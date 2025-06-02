//write a program to rename a file 
import java.io.*;
public class Problem6
{
	public static void main(String[] arg) throws Exception
	{
		File file = new File("file.txt");
		File filenew = new File("file0.txt");
		file.renameTo(filenew);
	}
}

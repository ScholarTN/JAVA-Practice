// merge two files into one
import java.io.*;
public class Problem3
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader file1 = new BufferedReader(new FileReader("file.txt"));
		BufferedReader file2 = new BufferedReader(new FileReader("file2.txt"));

		Writer file3 = new FileWriter("file3.txt",true);
		String s;
		while((s=file1.readLine())!=null)
		{
			file3.write(s);
			file3.write("\n");
		}
		while((s=file2.readLine())!=null)
		{
			file3.write(s);
			file3.write("\n");
		}
		file1.close();
		file2.close();
		file3.close();
	}
}

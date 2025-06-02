import java.io.*;
public class Problem7
{
	public static void main(String[] arg)throws IOException
	{
		BufferedReader file1 = new BufferedReader(new FileReader("file0.txt"));
		Writer file2 = new FileWriter("file0.txt",true);
		String s;
		while((s=file1.readLine())!=null)
		{
			if(!s.equals(" "))
				file2.write(s);
				file2.write("\n");
		}
		file1.close();
		file2.close();
	}
}

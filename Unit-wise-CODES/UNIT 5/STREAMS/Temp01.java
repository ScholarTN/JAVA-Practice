import java.io.*;

public class Temp01
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader file = new BufferedReader(new FileReader("file.txt"));
		String s;
		while((s=file.readLine())!=null)
			System.out.println(s);
		file.close();
	}
}

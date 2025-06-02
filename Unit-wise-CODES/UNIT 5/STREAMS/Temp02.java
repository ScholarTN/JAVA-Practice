import java.io.*;

public class Temp02
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader file = new BufferedReader(new FileReader("file.txt"));
		String s;
		int ctr=0;
		while((s=file.readLine())!=null)
			ctr++;
		System.out.println(ctr);
		file.close();
	}
}

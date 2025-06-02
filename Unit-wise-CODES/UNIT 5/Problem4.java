// accept a file and reverse every word and write it to another file
import java.io.*;
public class Problem4
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader file1 = new BufferedReader(new FileReader("file.txt"));
		Writer file2 = new FileWriter("file1.txt",true);
		String[] s = new String[30];
		String t;
		while((t=file1.readLine())!=null)
		{
			s = t.split(" ");
			for(int i=0;i<s.length;i++)
			{
				s[i] = new StringBuffer(s[i]).reverse().toString();
				file2.write(s[i]);
				file2.write(" ");
			}
			file2.write("\n");
		}
		file1.close();
		file2.close();
	}
}

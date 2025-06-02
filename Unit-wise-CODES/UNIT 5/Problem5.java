//compare two files line by line and display true if the line same and display false if the lines are not same
import java.io.*;
public class Problem5
{
	public static void main(String[] arg) throws Exception
	{
		BufferedReader file1 = new BufferedReader(new FileReader("file.txt"));
		BufferedReader file2 = new BufferedReader(new FileReader("file1.txt"));

		String s1="";
		String s2="";
		while(((s1=file1.readLine())!=null) || ((s2=file2.readLine())!=null))
		{
			if(s1.equals(s2))
				System.out.println(true);
			else
				System.out.println(false);
		}
		file1.close();
		file2.close();
	}
}

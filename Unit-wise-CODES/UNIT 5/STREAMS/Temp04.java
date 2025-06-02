//write a program to read only the asked first 5 lines if the file contains less than 5 lines read all
import java.io.*;
import java.util.*;
public class Temp04
{
	public static void main(String[] arg) throws Exception
	{
		BufferedReader file = new BufferedReader(new FileReader("file.txt"));

		String s;int ctr=1;
		while((s=file.readLine())!=null)
		{
			if(ctr<6)
				System.out.println(s);
				ctr++;
		}
		file.close();
	}
}

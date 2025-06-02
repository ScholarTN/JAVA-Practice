//write a program to replace the word Im with was
import java.io.*;
import java.util.*;
public class Temp031
{
	public static void main(String[] arg) throws Exception
	{
		BufferedReader file = new BufferedReader(new FileReader("file.txt"));
		Writer file2 = new FileWriter("file.txt",true);
		List<String> li = new ArrayList<>();
		String s;
		while((s=file.readLine())!=null)
		{
			if(s.contains(" am "))
				s = s.replaceAll(" am "," was ");
			li.add(s);
		}
		file2.close();
		file.close();
		Writer file1 = new FileWriter("file.txt");
		for(String st: li)
		{
			file1.write(st);
			file1.write("\n");
		}
		file1.close();
	}
}

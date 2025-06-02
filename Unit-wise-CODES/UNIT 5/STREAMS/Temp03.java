//write a program to modify a specific line from a file
import java.io.*;
import java.util.*;
public class Temp03
{
	public static void main(String[] arg) throws Exception
	{
		BufferedReader file = new BufferedReader(new FileReader("file.txt"));
		Writer file2 = new FileWriter("file.txt",true);
		/*Writer file1 = new FileWriter("file.txt");
		file1.write("");
		file1.close();*/
		List<String> li = new ArrayList<>();
		String s;
		String target = "im tej";
		while((s=file.readLine())!=null)
		{
			if(s.equals(target))
				s = "Im Tej";
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

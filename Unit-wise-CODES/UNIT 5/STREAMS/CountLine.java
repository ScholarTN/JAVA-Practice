// write a program to count no of lines
import java.io.*;
public class CountLine
{
public static void main(String[] arg) throws IOException
{
	BufferedReader file1 = new BufferedReader(new FileReader("file.txt"));
	//BufferedWriter file2 = new BufferedWriter(new FileWriter("john.txt"));
	String s;
	int count = 0;
	while((s=file1.readLine())!=null)
	{
		//System.out.println(s);
		//file2.write(s);
		//file2.newLine();
		count++;
	}
	System.out.println(count);
	file1.close();
	//file2.close();
}
}

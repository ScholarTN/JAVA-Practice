// write a program to increase effiency of reading
import java.io.*;
public class  BufferedCopy
{
public static void main(String[] arg) throws IOException
{
	BufferedReader file1 = new BufferedReader(new FileReader("file.txt"));
	BufferedWriter file2 = new BufferedWriter(new FileWriter("john.txt"));
	String s;
	while((s=file1.readLine())!=null)
	{
		//System.out.println(s);
		file2.write(s);
		file2.newLine();
	}
	file1.close();
	file2.close();
}
}

// write a program to append line of text without overwriting
import java.io.*;
public class  AppendLine
{
public static void main(String[] arg) throws IOException
{
	BufferedWriter file2 = new BufferedWriter(new FileWriter("john.txt",true));
	file2.write("Bye");
	file2.close();
}
}

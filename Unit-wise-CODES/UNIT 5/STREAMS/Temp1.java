// write a program to write content in a file
import java.io.*;
public class Temp1
{
	public static void main(String[] arg) throws IOException
	{
		Writer file = new FileWriter("newfile.txt");
		file.write("Hello how r u");
		file.write("\n");
		file.write("Nice to meet you");
		file.close();
	}
}

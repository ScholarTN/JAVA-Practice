// copy the content of one file to another file
import java.io.*;

public class CharWrite
{
public static void main(String[] arg) throws IOException
{
	Reader file1 = new FileReader("file.txt");
	Writer file2 = new FileWriter("john.txt");

	int ch;
	while((ch=file1.read())!=-1)
	{
		file2.write((char)ch);
	}
	file1.close();
	file2.close();
}
}

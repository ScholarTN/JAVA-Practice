import java.io.*;

public class OutPut
{
	public static void main(String[] arg) throws IOException
	{
		OutputStream file = new FileOutputStream("file.txt");
		String s = "How r u ";
		byte[] arr = s.getBytes();
		file.write(arr);
		System.out.println("Write Successful");
		//file.flush();
		file.close();
	}
}

//write a program to read user input from the console and save it into a file until "stop" is typed
import java.io.*;
import java.util.*;
public class Temp05
{
	public static void main(String[] arg) throws Exception
	{
		BufferedWriter file = new BufferedWriter(new FileWriter("file.txt"));
		String in="";
		Scanner sc = new Scanner(System.in);
		do
		{
			file.write(in);
			file.write("\n");
			in = sc.nextLine();
		}
		while(!in.equals("stop"));
		file.close();
	}
}

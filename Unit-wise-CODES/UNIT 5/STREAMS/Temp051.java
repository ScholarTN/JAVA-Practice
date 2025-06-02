//write a program to read user input from the console and save it into a file until "stop" is typed
import java.io.*;
import java.util.*;
public class Temp051
{
	public static void main(String[] arg) throws Exception
	{
		BufferedWriter file = new BufferedWriter(new FileWriter("file.txt"));
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("stop"))
			{
				break;
			}
			file.write(s);
			file.write("\n");
		}
		file.close();
	}
}

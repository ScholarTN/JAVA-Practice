import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copyfromfile1tofile2BufferedReader 
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader file1 = new BufferedReader(new FileReader("lpu.txt"));
        BufferedWriter file2 = new BufferedWriter(new FileWriter("Scholar2.txt"));
        String s;
        while((s=file1.readLine())!=null)
        {
            file2.write(s);
            file2.newLine();
            
        }
        file1.close();
        file2.close();
    }

}


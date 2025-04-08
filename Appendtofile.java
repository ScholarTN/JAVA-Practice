import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;


public class Appendtofile
{   public static void main(String arg[])throws IOException
    {
        BufferedWriter file2 = new BufferedWriter(new FileWriter("Scholar.txt",true)) // when you pass true, it will not overwrite but it will append
        file2.write("time is 14:44Hrs");
        file2.close();
        System.out.println("Append Successfully");
    }

}
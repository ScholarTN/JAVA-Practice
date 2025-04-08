// WAP to copy the contents of 1 file to another file
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
public class Copyfromfile1tofile2
{   public static void main(String arg[])throws IOException
    {
    Reader file1 = new FileReader("lpu.txt");
    Writer file2 = new FileWriter("Scholar.txt"); //open file in write mode, if its not there automatically it will be created
    int ch;
    while((ch = file1.read())!=-1)
    {
       file2.write((char)ch); //type casting to char to access the characters, ch only shows the asci values
    }
    file1.close();
    file2.close();
    }

}
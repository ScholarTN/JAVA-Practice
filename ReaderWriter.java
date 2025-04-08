//WAP A program using Read and write class.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter 
{
    public static void main(String arg[])throws IOException
    {
        Reader file1 = new FileReader("lpu.txt");
        char[] array = new char[50];
        file1.read(array); // file.read() without passing any argument reads only one character
        System.out.println(array);
        file1.close();

        //open file 2 in writee mode
        Writer file2 = new FileWriter("lpu.txt");
        String s = "l am a student.";
        file2.write(s);
        System.out.println("Write Successfully");
        file2.close();
    }
}

// Reading characters one by 1
Class Read1by1
{   public static void main(String arg[])throws IOException
    {
    Reader file1 = new FileReader("lpu.txt");
    int ch;
    while((ch = file1.read()!=-1))
    {
        System.out.print((char)ch);
    }
    file1.close();
    }

}


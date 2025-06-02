import java.util.*;
import java.io.*;

public class Printer 
{
    public static void main(String[] arg) throws IOException
    {
        PrintWriter writer = new PrintWriter(System.out,true);// true flush the output
        writer.println("hello");
        //writer.close();
    }
}
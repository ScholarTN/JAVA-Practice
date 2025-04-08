import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VowelsInFileCounter 
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader file2 = new BufferedReader(new FileReader("Scholar.txt")); 
        int ch,ctr=0;
        while((ch=file2.read())!=-1)
        {
            if("aeiouAEIOU".indexof(ch)!=-1)
            {
                ctr++;
            }
        }
        System.ou.println("No of vowels: "+ctr);
    }

}

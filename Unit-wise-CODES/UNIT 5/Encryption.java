// write a program to encrypt the content of a file and print it. Encryption process is every char will be converted to its next char
import java.io.*;
import java.util.*;

public class Encryption
{
    public static void main(String[] arg) throws IOException{
        BufferedWriter file1 = new BufferedWriter(new FileWriter("lpu.txt",true));
        Scanner sc = new Scanner(System.in);
        String s;
        while(sc.hasNextLine()){
            s = sc.nextLine();
            file1.write(s);
            file1.write("\n");
        }
        file1.close();
        
        Reader file2 = new FileReader("lpu.txt");
        int ch;
        while((ch=file2.read())!=-1)
        {
            if((char)ch=='z')
                System.out.print('a');
            else if((char)ch=='9')
                System.out.print('0');
            else if((char)ch=='Z')
                System.out.print('A');
            else if(ch=='\n')
                System.out.println();
            else
                System.out.print((char)(ch+1));
        }
        file2.close();
    }
}
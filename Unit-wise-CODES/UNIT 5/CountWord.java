// write a program to count how many times a specific word is present in a file
import java.io.*;
import java.util.*;

public class CountWord
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
        
        String target = "am";
        File file2 = new File("lpu.txt");
        Scanner sa = new Scanner(file2);
        String[] arr = new String[50];
        int count=0;
        while(sa.hasNextLine())
        {
            arr = sa.nextLine().split(" ");
            for(String i: arr)
            {
                if(i.toLowerCase().equals(target))
                    count++;
            }
        }
        System.out.println(count);
    }
}
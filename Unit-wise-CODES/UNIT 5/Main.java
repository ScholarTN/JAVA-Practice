// write a program to read all the input and save it a file and show it
import java.io.*;
import java.util.*;

public class Main
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
        
        //BufferedReader file2 = new BufferedReader(new FileReader("lpu.txt"));
        File file2 = new File("lpu.txt");
        Scanner sa = new Scanner(file2);
        /*String Line;
        while((Line=file2.readLine())!=null){
            System.out.println(Line);
        }
        file2.close();
        */
        while(sa.hasNextLine())
            System.out.println(sa.nextLine());
    }
}
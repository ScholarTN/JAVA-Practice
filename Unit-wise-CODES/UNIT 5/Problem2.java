// write a program to accept a string reverse the first half and second half then print the modified string
import java.util.*;
import java.io.*;
public class Problem2 
{
    public static void main(String[] arg) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = sc.nextLine();
        String p1 = s.substring(0,s.length()/2);
        String p2 = s.substring(s.length()/2,s.length());
        StringBuffer sb1 = new StringBuffer(p1);
        StringBuffer sb2 = new StringBuffer(p2);
        sb1.reverse();
        sb2.reverse();
        pw.println(sb1+" "+sb2);
        pw.close();
    }
}
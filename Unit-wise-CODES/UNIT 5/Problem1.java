import java.util.*;
import java.io.*;

public class Problem
{
    public static void main(String[] arg) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,true);// true flush the output
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;int j=n-1;
        while(j>i)
        {
            pw.print(arr[j]);
            pw.print(" ");
            pw.print(arr[i]);
            pw.print(" ");
            j--;
            i++;
        }
        if(i==j)
        {
            pw.print(arr[i]);
            pw.close();
        }
    }
}
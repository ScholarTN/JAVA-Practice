import java.util.*;
import java.io.*;

//Printwriter and Scanner compulsory code
//programs takes input and print largest followed by smallest, then second largest, then second smallest and so on
// suppose the elements are 10 20 30 40 50. we get 50 10 40 20 30

public class readWritePrograms
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,true); //true s that output will flush
        int n = sc.nextInt();

        int a[] = new int[n] //create an array of size n; to accept elements
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a); //sort the array
        int i=0,j=n-1;
        while(i<j)
        {
            pw.print(a[j]+" "+ a[i]+" ");   
            i++;
            j--;
        }
        if(i==j)
        {
            pw.print(a[i]);
        }
        pw.close(); //compulsory to close the printwriter otherwise output will not come.

    }
}

//WAP TO accept a string, reverse the first half of the string and the second half of the string and print it seperately

public class readWritePrograms
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,true); //true s that output will flush
        String n = sc.nextLine();

        String 1st_half = s.substring(0,n/2);
        String 2nd_half = s.substring(n/2,n); //OR simply (n/2)

        String sb1 = (new StringBuffer(1st_half)).reverse().toString();
        String sb2 = (new StringBuffer(2nd_half)).reverse().toString();

        pw.print(sb1 + " "+ sb2);
        pw.close();
    }
}

// WAP that handles this, if input= weearree, then output=we2ar2e2 if input =help, output = help
public class readWritePrograms
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out,true);
        String s = sc.nextLine();
        int i=0;
        while(i<s.length())
        {
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                pw.print(s.charAt(i));
                i+=2;
            }
            else
            {
                pw.print(s.charAt(i));
                i++;
            }
        }
        pw.close();
    }
}



// You are using Java

import java.util.*;
public class Main 
{
     public static void main(String arg[])
    { 
       //Palindrome check
       int a[]={1,2,3,4,3,2,1};
       int n=a.length;
       for(int i=0;i<n/2;i++)
       {
           if(a[i]!=a[n-i-1])
           {
               System.out.println("Not Palindrome");
               return; //System.exit(0)
           }
       }
       System.out.println("Palindrome");
    }
}
































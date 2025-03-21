// You are using Java

import java.util.*;
public class trueDup
{
     public static void main(String arg[])
    { 
       //check if numbers are duplicated or not, if repeated print true 
       int a[]={9,2,3,4,9,5,6};
       Set<Integer> s1=new HashSet<>();
       for(int i=0;i<a.length;i++)
       {
           if(s1.contains(a[i]))
           {
               System.out.println("True");
               System.exit(0);
           }
           s1.add(a[i]);
       }
       System.out.println("False");
    }
}
































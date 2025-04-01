// You are using Java

import java.util.*;
public class SetsDupElim
{
     public static void main(String arg[])
    { 
       Set<Integer> s1=new HashSet<>();
       int a[]={1,1,1,2,2,2,3,3,4,4,4,4,4,5,5};
       for(int i=0;i<a.length;i++)
       {
           s1.add(a[i]);
       }
       System.out.println(s1);
    }
}
































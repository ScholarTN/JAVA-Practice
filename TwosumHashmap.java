// You are using Java

import java.util.*;
import java.util.Arrays;
public class TwosumHashmap
{
     public static void main(String arg[])
    { 
        //Two Sum Problem using Hashmap
       int a[]={2,7,11,15};
       int target=9;
       int result[]=new int[2];
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<a.length;i++)
       {
           int secondnum=target-a[i];
           if(mp.containsKey(secondnum))
           {
               result[0] = mp.get(secondnum);
               result[1]=i;
               break;
           }
           mp.put(a[i],i);
           
       }
       System.out.println(Arrays.toString(result));
        
    }
}
































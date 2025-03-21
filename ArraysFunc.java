// You are using Java
import java.util.*;
import java.util.Arrays;

public class ArraysFunc
{
    public static void main(String arg[])
    {
        String a[]={"ramesh","harish","john","lpu"};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        
        //Sort the string array lengthwise Assending
        Arrays.sort(a,(s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(Arrays.toString(a));
        
        //reverseOrder string length
        Arrays.sort(a,(s1,s2)->Integer.compare(s2.length(),s1.length()));
        System.out.println(Arrays.toString(a));
        
        //comparing two arrays
        int c[]={4,7,6,9};
        int b[]={4,7,6,9};
        int result = Arrays.compare(b,c);  // returns 0 when equal
        System.out.println(result);
        
        int d[]={4,7,8,9};
        int e[]={4,7,6,9};
        int results = Arrays.compare(d,e);  // returns 1 
        System.out.println(results);
        
        int f[]={4,7,8,9};
        int g[]={4,7,8,9,13,12,16};
        int results2 = Arrays.compare(f,g);  // returns -3 //3 elements different and left
        System.out.println(results2);
        
        int h[]={4,7,8,6};
        int k[]={4,7,8,9,13,12,16};
        int results3 = Arrays.compare(h,k);  // returns -1 // stops when they are not equal and returns the greater one ie i.
        System.out.println(results3);
        
        
        //whether to buy or not buy stock 
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        
            ar[i]=sc.nextInt();
            
            int buyprice=9999;
            int maxprofit=0;
            
            for(int i=0;i<n;i++)
            {
                if(ar[i]<buyprice)
                {
                    buyprice=ar[i];
                    
                }
                else
                {
                    int profit=ar[i]-buyprice;
                    maxprofit=Math.max(profit,maxprofit);
                }
            }
            System.out.println("Maximum Profit: "+maxprofit);
        sc.close();
        
        
        
        
        
        
    }
}
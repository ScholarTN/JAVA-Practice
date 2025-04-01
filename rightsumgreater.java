// You are using Java
import java.util.*;
public class rightsumgreater
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i] =sc.nextInt();
            
        }
        int b[] = new int[10];
        int k= 0, sum =0;
         for(int i = n-1;i>=0;i--){
             if (a[i]>sum){
                 b[k++]=a[i];
                 
             }
             sum = sum+a[i];
             
         }
         for(int i=k-1;i>=0;i--){
             System.out.print(b[i] + " ");
         }
         sc.close();
    }
}
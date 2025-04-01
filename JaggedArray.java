// You are using Java
import java.util.*;
public class JaggedArray
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int [4][];
        a[0]=new int[2];
        a[1]=new int[3];
        a[2]=new int[4];
        a[3]=new int[2];
        System.out.println(a.length);//no of rows in jagged array 
        System.out.println(a[1].length); //no of columns in second row 
        //accepting elements 
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length;i++)
            {
                a[i][j]=sc.nextInt();
                
            }
            
        }
        System.out.println("jagged array elements are: ");
        
        for(int j=0; j<a.length;j++)
        {
            //System.out.println(a[i][j]+" ");
            
        }
        System.out.println();
        
    sc.close();

    }
}
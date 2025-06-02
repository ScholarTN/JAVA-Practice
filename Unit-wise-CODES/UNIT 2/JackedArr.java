import java.util.*;
public class JackedArr
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int[][] a=new int[4][];
		a[0]=new int[2];
		a[1]=new int[3];
		a[2]=new int[4];
		a[3]=new int[2];
		//System.out.println(a.length); // no of rows in jagged array
		//System.out.println(a[1].length); // no of columns in a index

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
                { 
                        for(int j=0;j<a[i].length;j++)
                        { 
                                System.out.print(a[i][j]+" ");
                        }
			System.out.println();
                }

	}
}

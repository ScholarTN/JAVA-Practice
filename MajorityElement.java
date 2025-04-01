// You are using Java
import java.util.*;
//Program for majority of elements
public class MajorityElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int cnt = 0, ans = a[0];
        
        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                ans = a[i];
            }
            if(a[i]==ans)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
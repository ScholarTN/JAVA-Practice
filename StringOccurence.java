import java.util.*;

public class StringOccurence 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            a[ch-97]++;
        }
        List<Character> li = new ArrayList<>();
        for (int i=0; i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!li.contains(ch))
            {
                System.out.println(ch+" present "+ a[ch-97]+" times");
            }
            li.add(ch);
        }
        sc.close();
    }    
}

import java.util.*;
public class StringPalindrome {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();

        String rev = sb.toString();
        if(s1.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
//leetcode problem and solution
/*class Solution {

    private static boolean checkPalindrome(String num)
    {

                StringBuffer sb = new StringBuffer(num);
                    sb.reverse();
                String rev = sb.toString();

                if(num.equals(rev))
                {
                    return true;
                }
                else
                {
                    return false;
                }
                                                                                                                            
                                                                                                                                                                    
                                                                                                                                                                    }
public boolean isPalindrome(int x) 
{
…      if(x<0)
      {
        return false;
      }
      String num= x +"";
      return checkPalindrome(num);

    
} */
import java.util.*;
public class StringPalindrome {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();

        String rev = sb.toString();
        if(s1.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}

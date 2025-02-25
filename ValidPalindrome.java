import java.util.*;
class solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = s.length()-1;

        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
    public static void main(String[] args) 
    {
        solution obj = new solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(obj.isPalindrome(s));
         sc.close();
    }


}
 

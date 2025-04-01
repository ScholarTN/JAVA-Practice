//wap to accept a string and count the number of words
import java.util.*;

public class StringOccurence 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        System.out.println(words.length);
    }
}

//WAP to accept a string and reverse every word
class Reverse{

    public static void main(String arg[])
    {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                String words[] = s.split(" ");
                List<String> li = new ArrayList<>()

                for(int i=0;i<words.length;i++)
                {
                    String w=words[i]
                    StringBuffer sb = new StringBuffer(w);
                    sb.reverse();
                    String rev = sb.toString();
                    li.Add(sb.toString());
                    
                }
                for(String i:li)
                {
                System.out.print(i+" ");
                }

    }
}
//WAP TO REVERSE THE PORTION OF A STRING FROM A SPECIFIED INDEX TO ANOTHER INDEX.
class Reverse{

    public static void main(String arg[])
    {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                int start = sc.nextInt();
                int end = sc.nextInt();
                String first = s.substring(0,start);
                String second = s.substring(start,end);
                String third = s.substring(end,s.length());

                StringBuffer sb = new StringBuffer(second);
                sb.reverse();
                System.out.println(first+sb+third);
              
    }
}

//WAP that takes two names and prints common letters
class Reverse{

    public static void main(String arg[])
    {
                Scanner sc = new Scanner(System.in);
                String s1 = sc.nextLine();
                String s2 = sc.nextLine();
                List<Character> li1 = new ArrayList<>();
                List<Character> li2 = new ArrayList<>();
                
                //not complete
    }
}
//WAP to accept a string, make your friend guess the name and print whether its correct.
import java.util.*;
class Main{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();
        if(s1.equals(s2))
            System.out.println("Correct");
        else
            System.out.println("Wrong");
    }
}

//WAP to accept a string AND reverse all the vowels
import java.util.*;
class Main{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        Set<Character> s = new HashSet<>(); // create a hashset
        for(char i:"aeiouAEIOU".toCharArray()) 
        {
            s.add(i);
        }//store the characters in an array
        int left = 0;
        int right = s1.length()-1;
        char ar[] = s1.toCharArray();

        while(left<right)
       {
         if(s.contains(ar[left])&& s.contains(ar[right]))
         {
         char temp;
         temp = ar[left];
         ar[left]=ar[right];
         ar[right]=temp;
         left++;
         right--;
         } 
         else if(!s.contains(ar[left]))
         {
            left++;
         }
         else if(!s.contains(ar[right]))
         {
            right++;
         }
       }
       System.out.println(ar);

        
    }
}

//WAP to accept two strings s and t and return true if t is an anagram of s and false otherwise.
//EASY WAY, CONVERT STRING TO CHARACTER,SORT AND CONVERT BACK TO STRING, THEN COMPARE

import java.util.*;
class Main{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        //convert to charArray
        char ar1[] = s.toCharArray();
        char ar2[] = t.toCharArray();

        //Sort the Arrays 
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.compare(ar1,ar2)==0)

        
        {
            System.out.println("Valid Anagram");
        }
        else
            System.out.println("Not a valid Anagram");

    }
}

//WAP to check Palindrome 
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






    

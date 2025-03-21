// Functional interface- Must contain only one Abstarct method
/*interface A
{
    int add(int x, int y);
}

public class Main
{   
    public static void main(String arg[])
         {
            //1st way A obj = (int x)->x+x;
            A obj = (int x, int y)->
            {
                return (x+y);
            };
            int res = obj.add(5,6);
            System.out.println(res);
         }
        
    
}

//Write a program to add 2 numbers by using functional interface and lambda expression
// WAP to print your name using functional interface and Lambda expression
interface A
{
    void display();
}

public class Main
{   
    public static void main(String arg[])
         {
            A obj = ()->System.out.println("Scholar");
            A obj = ()->{System.out.println("Scholar");};
            
            obj.display();
         }
        
    
}

//WAP to accept one number from user and find its factorial using lambda expression

import java.util*
interface A
{
    int factorial(int x);
}

public class Main
{   
    public static void main(String arg[])
         {
            
            
            A obj = (int x)->
            {
                int f = 1
                for (int i= 1; i<=x; i++)
                {
                    f = f*i;
                }
                return f;
                
            };
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int res = obj.factorial(n);
            System.out.println(res);
         }
        
    
}*/

//WAP to create an array list, add some integer elements and print all the even elements using Lambda expression
import java.util.*;
public class LambdaPrograms{
    public static void main(String arg[])
    {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(20);
        li.add(21);
        li.add(22);
        li.add(24);
        li.add(17);
        
        li.forEach(n->
        { if(n%2==0)
            System.out.println(n);
        });     
    }
}


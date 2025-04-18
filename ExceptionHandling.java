public class ExceptionHandling
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b=0;

        try{
            int c= a/b;//this will generate exception
            System.out.println(c); 
        }
<<<<<<< HEAD
        catch(Exception e) // use the parent class Throwable
        {
            System.out.println("Devision by Zero");
            System.out.println(e);
        }
        //everything below the exception is not executed, so use try and catch since its unchecked exception(Arithmetic)
          
        
        
        System.out.println("lpu");
        System.out.println("End of Program");
    }    
}
=======
        catch(Exception e) // use the parent class Throwable/ ArithmaticException
        {
            System.out.println("Devision by Zero");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        //everything below the exception is not executed, so use try and catch since its unchecked exception(Arithmetic)
          
       finally{
        
        System.out.println("lpu");
        System.out.println("End of Program");
       }
    }    
}

//Use of Buffered reader to accept useer input 

//WAP to accept a number and check whether its a happy number: A number is said to be happy if suppose 19
//*2 + 9**2 = 82
//*2 + 2*2 = 68
//*2 + 8**2 = 100
//*2 + 0**2 + 0**2 = 1

//take two variables slow and fast, slow will move one step, fast will move 2 step,
//when they meet, come out of the loop, its not a happy number, if you get 1 as output its a happy number

import java.*;
import java.util.Scanner;
class HappyNum
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt() //19

        int slow = no; //19
        int fast = no; //19

        do
        {
            slow = add(slow);
            fast = add(add(fast))
        }
        while(slow!=fast);
        if (slow==1):
            System.out.println("Happy number");
        else
            System.out.println("Not a happy number");
    }
}
>>>>>>> c786e8f (Worked on Generic class and other programs)

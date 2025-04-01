/*class Demo
{
    public static void main(String a[])
    {
        int i = 1;

        while(i<=4)
        {
            System.out.println("Hi" + i);

            int j = 1;
            while(j<=3)
            {
                System.out.println("Hello");
                j++;
            }
            
            i++;

        }

        System.out.println("Bye" + i);
        
    }
} */

//DO WHILE
//getting the output atleast once even if the condition is false

class doWhile
{
    public static void main(String[] arg)
    {
        int i = 10;

        do
        {
            System.out.println("Hi" + i);
            i++;

        } while(i<=4);
    }
}

//For Loop
class ForLoop
{
    public static void main(String[] arg)
    {
        

        for(int i = 4;i>=1;i--)
        {
            System.out.println("Hi" + i);
            

        } 
    }
}

class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing.......");
    }

    public String Notepad(int cost)
    {
        if(cost>=80)
            return "You have successful bought Notepad";
        
        return "Insufficient Funds";
        

    }
}

public class Demo
{
    public static void main(String a[])
    {
        Computer com = new Computer();
        com.playMusic();
        String str = com.Notepad(70);
        System.out.println(str); 

        Caclculator calc = new Caclculator();
        int r1 = calc.add(2, 5,10);
        System.out.println(r1);
    
    }
}

class Caclculator 
{
    public int add(int n1, int n2, int n3)
    {
        return n1+ n2 + n3;
    }
}


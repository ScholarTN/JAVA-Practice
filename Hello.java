public class Hello
{
    public static void main(String a[]) 
    {
        System.out.println("Hello World");
        System.out.println("Scholar is here");

    }
}

class Sum
{
    public static void main(String a[])
    {
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);
    }
}

class Beginner
{
    public static void main(String a[])
    {
        float num3 = 5.6f;
        double num4 = 8.2;
        double d = 5.8;
        byte by = 127;           //}literals 
        short sh = 558;
        long l = 5854l;
        char c = 'K';
        char ch = '8';
        int num6 = 10_000_000;
        System.out.println(num6);
        c++;
        System.out.println(c);
        ch++;
        System.out.println(ch);


    }
    
}

class TypeCasting
{
    public static void main(String b[])
    {
        byte byt = 127; //maximum for byte
        int a = 12;
        int c = 257;
        byte d = (byte)a;   //casting--> explicit conversion
                       //a=b -->implicit conversion, since int has more bytes than byte
                       //implicit happens automatically
        byte e = (byte)c;
        System.out.println(d);
        System.out.println(e);

    }
}

class Operations
{
    public static void main(String[] args)
    {
        int num7 = 9;

        int num8 = 8;
        int result = num8 % num7;
        

        //int Re = ++num7; // increment then fetch output 10
        int RES = num7++; // fetch then increment output 9
        
        //System.out.println(Re);
        System.out.println( RES);

        // >, <, =
        boolean res = num7 > num8;
        System.out.println(res);
        // combining operators  & AND, | or , ! NOT

        int x = 8;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean RESULT = x > y && a < b;
        System.out.println(RESULT);

        boolean RESULTS = x < y || a > b;
        System.out.println(RESULTS);



    }
}

class Conditionals
{
    public static void main(String[] args)
    {
      int x = 28;
      if(x>10 && x<=20)
      {
          System.out.println("Hello");  
          System.out.println("JAVA");
      }   
      else
          System.out.println("Bye");

    }
}

class Compare
{
    public static void main(String[] args)
    {
        int x = 12;
        int y = 7;
        int z = 9;

        if(x>y && x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}

class EvenOdd
{
    public static void main(String[] args)
    {
        int n = 4;
        int result = 0;

        result = n%2==0? 0 : 1; // 0 if even 1 if odd 
        //Ternary operator
        System.out.println(result);
    }
}

class Switch
{
    public static void main(String a[])
    {
       int n = 1;

       switch(n){
            case 1:
                System.out.println("Monday"); 
                break;
            case 2:
                System.out.println("Tuesday");
                break; 
            case 3:
                System.out.println("Wednesday"); 
                break;
            case 4:
                System.out.println("Thursday"); 
                break;
            case 5: 
                System.out.println("Friday"); 
                break;
            case 6: 
                System.out.println("Saturday"); 
                break;
            case 7: 
                System.out.println("Sunday"); 
                break;
            default:
                System.out.println("Enter a valid Number");



       }

     
    }

}

class AdvancedSwitch
{
    public static void main(String[] args)
    {
               int n = 5;

       switch(n){
            case 1 -> System.out.println("Monday"); 
                
            case 2 -> System.out.println("Tuesday");
                 
            case 3 -> System.out.println("Wednesday"); 
                
            case 4 -> System.out.println("Thursday"); 
                
            case 5 -> System.out.println("Friday"); 
                
            case 6 -> System.out.println("Saturday"); 
                
            case 7 -> System.out.println("Sunday"); 
            
            default -> System.out.println("Enter a valid Number");

    }
}
}

class BetterSwitch
{
    public static void main(String[] args)
    {
        String day = "Sunday";
        String result = "";

        result = switch(day)
        {
            case "Saturday","Sunday" -> "10am";
            case "Monday" -> "9am";
            default -> "7am";
        };

        System.out.println(result);
    }
}


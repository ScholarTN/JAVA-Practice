// You are using Java
//Method overriding 

//NB:The overridden method can be called by assigning subclass object to super class Reference
class Outer
{
   int x=5;
   class Inner 
   {
       int y = 6;
       void add()
       {
           System.out.println(x+y);
       }
   }
}


public class Abstracts
{
    public static void main(String arg[])
    {
        Outer obj1 = new Outer();
        Outer.Inner obj2 = obj1.new Inner(); //Creating Inner object
        obj2.add();
    }
}
// You are using Java
//Method overriding 

//NB:The overridden method can be called by assigning subclass object to super class Reference
class A 
{
    void lpu()
    {
        System.out.println("abc");
    }
}

class B extends A
{
    //Overriden method
   void lpu()
    {
        System.out.println("xyz");
    }  
}
public class MethodOverriding
{
    public static void main(String arg[])
    {
        A obj = new B();
        obj.lpu();
    }
}
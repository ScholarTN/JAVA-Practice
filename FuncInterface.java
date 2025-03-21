// You are using Java
class A 
{
    
}

public class FuncInterface
{
    public static void main(String arg[])
    {
        FuncInterface obj1 = new FuncInterface();
        A obj2 = new A();
        
       System.out.println(obj1 instanceof FuncInterface);
       System.out.println(obj2 instanceof A);
        
        
    }
}
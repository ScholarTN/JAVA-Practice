// You are using Java
class A 
{
 void abc()
 {
     System.out.println("abc");
 }
}

class B extends A
{
    void xyz()
    {
        System.out.println("xyz");
    }
}
public class  SingleInheritance
{
    public static void main(String arg[])
    {
        B obj = new B();
        obj.xyz();
        obj.abc();
    
    }
}
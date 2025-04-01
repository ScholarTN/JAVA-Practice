// You are using Java
//Multilevel Inheritance
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
class C extends B 
{
    void mnp()
    {
        System.out.println("mnp");
    }
}
public class  MultilevelInheritance 
{
    public static void main(String arg[])
    {
        C obj = new C();
        obj.xyz();
        obj.abc();
        obj.mnp();
    }
}
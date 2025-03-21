// You are using Java
//Multilevel Inheritance
class A 
{
 A()
 {
     System.out.println("lpu1");
 }
  A(int x)
 {
     System.out.println(x);
 }
}

class B extends A
{
    B()
    {
        System.out.println("lpu2");
    }
     B(int Y)
    {
        System.out.println(Y);
    }
    
}

public class  SuperKeyword
{
    public static void main(String arg[])
    {
        new B(); // output: lpu1 lpu2 
        new B(5);//lpu1 5 default constructor is always called first in inheritance, rather than the parameterized one
    }
}
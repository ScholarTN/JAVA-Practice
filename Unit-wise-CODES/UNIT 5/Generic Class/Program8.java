//Program8: Generic class with inheritance
class parent<T>
{
    T var1;
    parent(T var1)
    {
        this.var1 = var1;
    }
    void display()
    {
        System.out.println(var1);
    }
}
class child<T> extends parent<T>
{
    child(T var1)
    {
        super(var1);
    }
    void display1()
    {
        System.out.println(var1.getClass().getName());
    }
}

public class Program8 
{
    public static void main(String[] arg)
    {
        child<String> obj = new child("hello");
        obj.display1();
        obj.display();
    }
}
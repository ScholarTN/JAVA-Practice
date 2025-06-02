//Program2: Generic class with two datatypes
class lpu<T,U>
{
    lpu(T var1,U var2)
    {
        System.out.println(var1);
        System.out.println(var2);
    }
}

public class Program2
{
    public static void main(String[] arg)
    {
        lpu<String,Integer> obj = new lpu<>("Hello",45);
        new lpu<>(45.2,45);
        new lpu<>("Hello","How are you");
    }
}
//Program4: Generic Class with bounded types (extends)
class lpu<T extends Number>
{
    lpu(T var1)
    {
        System.out.println(var1);
    }
}

public class Program4 
{
    public static void main(String[] arg)
    {
        new lpu<>(1);
        new lpu<>(5.4);
        new lpu<>(5.4f);
        
        new lpu<>("Hello");
    }
}
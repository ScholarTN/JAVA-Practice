//Program1: Generic class with one parameter
class lpu<T>
{
    T var1;
    lpu(T var1)
    {
        this.var1 = var1;
    }
    T display()
    {
        return var1;
    }
}

public class Program1
{
    public static void main(String[] arg)
    {
        lpu<String> obj = new lpu<>("Hello");
        System.out.println(obj.display());
    
        lpu<Integer> obj1 = new lpu<>(5);
        System.out.println(obj1.display());
    
        lpu<Double> obj2 = new lpu<>(5.48);
        System.out.println(obj2.display());
    }
}
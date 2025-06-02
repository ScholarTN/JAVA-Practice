//Program2.1: Generic class with two datatypes
class lpu<T,U>
{
    T var1;
    U var2;
    lpu(T var1,U var2)
    {
        this.var1 = var1;
        this.var2 = var2;
    }
    void dis(){
        System.out.println(var1);
        System.out.println(var2);
    }
}

public class Program2.1 
{
    public static void main(String[] arg)
    {
        lpu<String,Integer> obj = new lpu<>("Hello",45);
        obj.dis();
    }
}
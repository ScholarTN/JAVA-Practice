//Program3: Generic Method Inside Generic Class
class lpu<T>
{
    lpu(T var1)
    {
        System.out.println(var1);
    }
    <U,G> void dis(U var2, G var3){
        System.out.println(var2+" "+var3);
    }
}

public class Program3 
{
    public static void main(String[] arg)
    {
        lpu<String> obj = new lpu<>("Hello");
        obj.dis(55,"string");
        obj.dis(63.25,56);
        obj.dis("End",2);
    }
}
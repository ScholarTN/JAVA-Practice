//Program9: Generic interface
interface abc<T>
{
    T display(T a, T b);
}
class lpu implements abc<Integer>
{
    public Integer display(Integer a, Integer b)
    {
        return a+b;
    }
}

public class Program9 
{
    public static void main(String[] arg)
    {
        abc<Integer> obj = new lpu();
        System.out.println(obj.display(5,6));
    }
}
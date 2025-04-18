interface abc<T>
{
    T display(T a,T b);
}

class lpu implements abc<Integer>
{
    public Integer display(Integer a, Integer b)
    {
        return a+b;
    }
}
public class generic_Interface
{
    public static void main(String[] args)
    {
        abc<Integer> obj=new lpu();
        System.out.println(obj.display(5,4));
    }
}

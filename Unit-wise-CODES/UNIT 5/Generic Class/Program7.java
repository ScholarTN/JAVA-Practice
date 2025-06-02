//Program7: Generic class with lowerbound wildcard (super)
import java.util.*;
class lpu 
{
    void add(List<? super Integer> li)
    {
        li.add(10);
        li.add(20);
    }
}

public class Program7
{
    public static void main(String[] arg)
    {
        List<Number> li = new ArrayList<>();
        new lpu().add(li);
        System.out.println(li);
    }
}
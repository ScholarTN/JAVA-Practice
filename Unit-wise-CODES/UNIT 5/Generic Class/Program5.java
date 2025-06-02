//Program5: Generic class with wildcard <?>
import java.util.*;
class lpu
{
    void display(List<?> li)
    {
        for(Object l:li)
        {
            System.out.println(l);
        }
    }
}

public class Program5 
{
    public static void main(String[] arg)
    {
        List<String> names = Arrays.asList("A","B","C");
        new lpu().display(names);
        
        List<Integer> roll = Arrays.asList(1,2,3);
        new lpu().display(roll);
    }
}
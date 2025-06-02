//Program6: Generic class with upperbound wildcard (extends)
import java.util.*;
class calculator
{
    double sum(List<? extends Number> li)
    {
        double s=0;
        for(Number i: li)
        {
            s+=i.doubleValue();
        }
        return s;
    }
}
public class Program6 
{
    public static void main(String[] arg)
    {
        List<Integer> nums = Arrays.asList(1,2,3,4);
        System.out.println(new calculator().sum(nums));
    }
}
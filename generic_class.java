import java.util.*;
class lpu<t>
{
    lpu(t var)
    {
        System.out.println(var);
    }
}
public class generic_class
{
    public static void main(String[] args) 
    {
         new lpu(5);
            
    }
}

//GENERIC class with wildcard <?>
class lpu2
{
    void display(List<?> li)
    {
        for(Object l:li)
        {
            System.out.println(l);
        }
    }
}
public class generic_class
{
    public static void main(String[] args)
    {
        List<Integer> names=Arrays.asList("A","B","C");
        new lpu().display(names);

        List<Integer> roll=Arrays.asList(1,2,3);
        new lpu().display(roll);
    }
}

//UpperBound Wild card:
public class  calculator 
{
    double sum(List<? extends Number> li)
    {
        double s = 0;
        for(Number num:li)
        {
            s = s+num.doubleValue(); //this function belongs to Number class and converts the int t double
        }
        return s;
    }
    
}


public class generic_class
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(1, 2, 3,4); //elements to be added. this list and the one in calculator are different
        System.out.println(new calculator().sum(nums));

    }
}

//LowerBound Wildcard
class lpu3
{
    void add(List<? super Integer> li)
    {
        li.add(10); //this will work because Integer is the lower bound
        li.add(20);
    }
}

public class generic_class
{
    public static void main(String[] args)
    {
        List<Number> nums = new ArrayList<>(); //passing an empty list
        new lpu3().add(nums);
        System.out.println(nums);
    }
}

//Generic class with inheritance.
class parent<T>
{
    var1;
    parent(T var1)
    {
        this.var1 = var1;
    }
    void display()
    {
        System.out.println(var1);
    }
}
class child<T> extends parent<T>
{

    child(T var1)
    {
        super(var1);//calling the supper class variable 
    }
    void display1()
    {
        System.out.println(var1.getClass().getName());
    }
}
public class generic_class
{
    public static void main(String[] args)
    {
        child<String> obj = new child<>("Hello"); //creating child object to call all even the parent
        obj.display(); //calling parent method
        obj.display1(); //calling child method
    }
}

// Custom comparator
import java.util.*;
class Student
{
    int roll;
    String name;
    Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }

    public String toString()
    {
        return roll+" "+name;
    }
}
class Lpu implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        //return s1.name.compareTo(s2.name);
    
        return s1.roll - s2.roll;
    }
}
public class Customcompare
{
    public static void main(String[] arg)
    {
        Set<Student> set = new TreeSet<>(new Lpu());
        set.add(new Student(102, "raman"));
        set.add(new Student(101, "john"));
        set.add(new Student(103, "arav"));
        
        System.out.println(set);
        
    }
}
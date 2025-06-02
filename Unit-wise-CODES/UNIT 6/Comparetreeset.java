// Comparable interface with tree set
import java.util.*;
class Student implements Comparable<Student>
{
    int roll;
    String name;
    Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    
    public int compareTo(Student s)
    {
        return this.roll - s.roll;
        //compare with name
        //return this.name.compareTo(s.name);
    }
    
    public String toString()
    {
        return roll+" "+name;
    }
}
public class Comparetreeset
{
    public static void main(String[] arg)
    {
        Set<Student> set = new TreeSet<>();
        set.add(new Student(102, "raman"));
        set.add(new Student(101, "john"));
        set.add(new Student(103, "arav"));
        
        System.out.println(set);
        
    }
}
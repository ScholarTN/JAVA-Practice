                            // Array list with Comparable interface
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
        //return this.roll - s.roll;
        //compare with name
        return this.name.compareTo(s.name);
    }
    
    public String toString()
    {
        return roll+" "+name;
    }
}
public class Compare
{
    public static void main(String[] arg)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102, "raman"));
        list.add(new Student(101, "john"));
        list.add(new Student(103, "arav"));
        
        Collections.sort(list);
        System.out.println(list);
        
    }
}

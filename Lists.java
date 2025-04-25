//add -> 2 types
//clear -> remove everything
//removeAll -> two lists remove all elements in list2 from list 1
//retainAll


//WAP to Print every numbers from zero to n which is not present in the arraylist 
public class Lists
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.aslist(5,1,4,8,9); //from zero to 9, whichever is not present, print that
        //find the largest element
        int largest = Collections.max(list);
        List<Integer> temp= new ArrayList<>();
        for(int i=0;i<=largest;i++)
        {
            temp.add(i);
        }
        temp.removeAll(list);
        System.out.println(temp);


    }
}

//Comparable interface with ArrayList  // predefined interface->comparable
//WAP to accept name, rollno and class and sort by roll no after structuring them
import java.util.*;
class Student implements Comparable<Student>
{
    int roll;
    String Name;
    Student(int roll,String Name)
    {
        this.roll=roll;
        this.name = name;
        
    }
    //Comparable has a method CompareTo which we have to override
    public int compareTo(Student s) //Overriding
    {
        return this.roll-s.roll //sort the roll numbers
        //Compare with Name
        return this.Name.compareTo(s.Name); //sort namewise
    }
    public String toString()
    {
        return roll+" "+Name;
    }
}
public class Lists
{
    public static void main(String arg[])
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102,"Scholar"));
        list.add(new Student(101,"Thuba"));
        list.add(new Student(103,"Nkomazana"));
        Collections.sort(list);
        System.out.println(list);
        //[]
    }

}

//Comparable interface with TreeSet
import java.util.*;
class Student implements Comparable<Student>
{
    int roll;
    String Name;
    Student(int roll,String Name)
    {
        this.roll=roll;
        this.name = name;
        
    }

    //Comparable has a method CompareTo which we have to override

    public int compareTo(Student s) //Overriding // nowhere it is called but automatically works
    {
        return this.roll-s.roll //sort the roll numbers
        //Compare with Name
        return this.Name.compareTo(s.Name); //sort namewise
    }
    public String toString() // nowhere it is called but automatically works
    {
        return roll+" "+Name;
    }
}
public class Lists
{
    public static void main(String arg[])
    {
        Set<Student> set = new TreeSet<>();
        set.add(new Student(102,"Scholar"));
        set.add(new Student(101,"Thuba"));
        set.add(new Student(103,"Nkomazana"));
        //Collections.sort(list); no need in set, automatically sorts
        System.out.println(set);
        //[]
    }

}

//Custom comparator

import java.util.*;
class Student 
{
    int roll;
    String Name;
    Student(int roll,String Name)
    {
        this.roll=roll;
        this.Name = Name;
        
    }
   
    public String toString()
    {
        return roll+" "+Name;
    }
}
class lpu implements Comparator<Student>
{
    public int compare(Student s1, Student s2) // has method compare and passes two arguments 
    {
        return s1.Name.compareTo(s2.Name);
        return s1.roll-s2.roll; //roll number sorting
    }
}
public class Lists
{
    public static void main(String arg[])
    {
        Set<Student> set = new TreeSet<>();
        set.add(new Student(102,"Scholar"));
        set.add(new Student(101,"Thuba"));
        set.add(new Student(103,"Nkomazana"));
        //Collections.sort(list); no need in set, automatically sorts
        System.out.println(set);
        //[]
    }

}

//WAP to rotate an ArrayList k times
import java.util.*;
public class Lists
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.aslist(2,3,4,5,6);
        Collections.rotate(list,2);
        System.out.println(list);
    }
}

//WAP to rotate first half and second half then print
import java.util.*;
public class Lists
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.aslist(1,2,3,4,5,6,7,8);
        //subList function
        List<Integer> left = list.subList(0,list.size()/2);
        List<Integer> right = list.subList(list.size()/2,list.size());
        Collections.rotate(left,1);==
        Collections.rotate(right,1);
        System.out.println(left+" "+right);
    }
}
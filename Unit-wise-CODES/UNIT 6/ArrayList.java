// You are using Java
import java.util.*;
public class ArrayList
{
    public static void main(String[] arg)
    {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("T");
        list.add("J");
        list.add("C");
        list.add("D");
        list.add("E");
        
        //how to add item to specific index 
        list.add(1,"B");
        
        // size of the arraylist 
        System.out.println("size of the list: "+list.size());
        
        // retrive a specific index value
        System.out.println("value at Index 2: "+list.get(2));
        
        // update or replace a specific item of a list by index 
        list.set(2,"F");
        
        // remove a element from the list 
        list.remove(0);
        //list.remove("B");
        
        // remove all elements from the list
        //list.clear();
        
        // sort all the elements in the List
        Collections.sort(list);
        
        // different ways to print a list
        
        System.out.println(list);
        
         // how to reverse the elements of the list
        Collections.reverse(list);
        
        for(String i: list)
        {
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        for(int i=0; i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");    
        }
    }
}
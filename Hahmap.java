//Hashmap always store in key value pair
import java.util.*;

public class Hashmap
{
    public static void main(String[] args) 
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(1,"xyz");
        map.put(3,"mno"); //map sorts according to keys not elements automatically
        map.put(5,"def");

        System.out.println(map.get(1)); // xyz
        map.remove(3); //mno will be removed

        //how to iterate the map
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //how to check whether a specific key or value present in map or not
        System.out.println(map.containsKey(4)); //false
        System.out.println(map.containsValue("def")); //true

    }
}


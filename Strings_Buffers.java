 public class Strings_Buffers {
    public static void main(String a[])
    {
        //String in Java is a class
        //By default Strings are immutable, once you create an object you can't change it. 

        String name = "SCHOLAR"; //the usual way of declaring a string variable
        // creating a string object
        String name1 = new String("SCHOLAR");

        System.out.println(name1);
        System.out.println(name);
        // since the first one automatically creates an object behind the scene, it is widely used
        //i.e String name = "SCHOLAR"; no need to create an object


        String s1 = "THUBA";
        String s2 = "THUBA";   //{ This creates two references but the object is the same.
        // the s1 and s2 are stored in a stack, the name THUBA is stored in a string constant pool with a reference Adress.
        // s1 and s2 will have the same Address.


        String name2 = "Thubalami"; // Thubalami gets stored in the string constant pool,  
        name2 = name2 + "Nkomazana";  //you cant update Thubalami, so this is creating a new object which will have the data Thubalami Nkomazana
        //the Adress of name is just changed from, say 103 for Thubalami to 105 for Thubalami Nkomazana.
        // the first object Thubalami is eligible for gabage collection and will be removed after some time.

        System.out.println(name2);
        
        
     

    }


}

class StringBuffers
{
    public static void main(String a[])
    {
        //STRING BUFFER
        //String buffer gives you a buffers size of 16 bytes
        StringBuffer sb = new StringBuffer("Scholar ");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // You can append data
        sb.append(" TNK ");
        System.out.println(sb);

        //Delete a Character
        sb.deleteCharAt(9);
        System.out.println(sb);

        //Insert
        sb.insert(0," Moyo ");
        System.out.println(sb);

        //String Buffer is thread safe, String builder is not safe
    }
}



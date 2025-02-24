class Mobile
{
    String brand;
    int price;
    String network;
    static String name; //static makes the variable accessible to all and change in one will affect all, its common for all

    public void show()
    {
        System.out.println(brand + " : "+ price + " : "+ name);
    }
}



public class Static
 {

    public static void main(String[] args) 
    {
        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price = 1500;
        obj1.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price = 1200;
        obj2.name = "Smart Phone";


// You can access static variables using the class name; this is actually advised than using an object
Mobile.name = "Phone"; //This changes the name for all.
obj1.show();
obj2.show();

//Static variables are shared between different objects
//static keyword means you are making something as a class member not an object member.
//saves memory 
    }
}

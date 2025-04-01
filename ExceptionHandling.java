public class ExceptionHandling
{
    public static void main(String[] args) 
    {
        int a = 5;
        int b=0;

        try{
            int c= a/b;//this will generate exception
            System.out.println(c); 
        }
        catch(Exception e) // use the parent class Throwable
        {
            System.out.println("Devision by Zero");
            System.out.println(e);
        }
        //everything below the exception is not executed, so use try and catch since its unchecked exception(Arithmetic)
          
        
        
        System.out.println("lpu");
        System.out.println("End of Program");
    }    
}

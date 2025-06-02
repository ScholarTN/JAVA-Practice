public class Intial
{
	{
		System.out.println("I am inside initializer block");
	}
	public static void main(String[] arg)
	{
		new Intial();
		System.out.println("I am inside main function");
		//Intial obj = new Intial();
		new Intial();
	}
}

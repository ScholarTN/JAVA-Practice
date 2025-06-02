public class ConOver
{
	ConOver()
	{
		System.out.println("1");
	}
	ConOver(int a)
        { 
                System.out.println("2");
        }
	ConOver(int b,int c)
        { 
                System.out.println("3");
        }
	public static void main(String[] arg)
	{
		new ConOver();
		new ConOver(1);
		new ConOver(1,2);
	}
}

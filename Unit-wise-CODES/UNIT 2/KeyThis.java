public class KeyThis
{
	void lpu()
	{
		System.out.println(this);
	}
	KeyThis()
	{
		this(1,2);// this() can be used only in the first line 
	}
	keyThis(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void main(String[] arg)
	{
		KeyThis obj = new KeyThis();
		//obj.lpu();
		//System.out.println(obj);
	}
}

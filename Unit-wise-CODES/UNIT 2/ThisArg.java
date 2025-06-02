public class ThisArg
{
	int a=5;
	void get()
	{
		dis(this);
	}
	void dis(ThisArg obj)
	{
		System.out.println(obj.a);
	}
	public static void main(String[] arg)
	{
		new ThisArg().get();
	}
}

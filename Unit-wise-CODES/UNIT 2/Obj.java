//Implement a Java program that demonstrates method overloading using variable arguments to calculate the sum of multiple integers.
public class Obj
{
	int a = 5;
	void lpu()
	{
		System.out.println(a+2);
	}
	void add(int ... args)//variable arguments varagrs
	{
		int size = args.length;
		int sum = 0;
		for(int i=0; i<size;i++){
			sum+=args[i];}
		System.out.println(sum);
	}
	//int add(int a,int b,int c){int d = a+b+c;return d;}
	public static void  main(String[] arg)
	{
		Obj obj = new Obj();
		//System.out.println(obj.a);
		obj.add(5,6,2);
		obj.add(1,2,3,4);
	}
}

enum Colors
{
	RED,
	GREEN,
	BLUE,
	WHITE,
	PINK
}
public class Enum
{
	public static void main(String[] arg)
	{
		Colors c = Colors.RED;
		System.out.println(c);
		System.out.println(Colors.BLUE);
		System.out.println(Colors.WHITE.ordinal());
		for(Colors i:Colors.values()){
			System.out.println(i);
			System.out.println(i.ordinal());
		}
		System.out.println(Colors.values()[2]);
	}
}

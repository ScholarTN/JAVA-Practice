public class StaticBlock
{
static
{
	System.out.println("im inside static block");
}
public static void main(String[] arg)
{
	System.out.println("Im inside main function");
	new StaticBlock();
}
{
	System.out.println("im inside initializer block");
}
}

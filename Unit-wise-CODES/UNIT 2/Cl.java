public class Cl{
	public static void main(String[] arg)
	{
		/*String a = "LPU";
		//a=a.concat(" university");

		StringBuffer b = new StringBuffer("lpu");
		b.append(" university");

		System.out.println(a.charAt(2));
		System.out.println(b);*/

		/*String s1 = new String("kar");
		String s2 = new String("car");
		System.out.println(s1.compareTo(s2));*/

		//String s1 =new String( "i am from Lpu");

		//System.out.println(s1.contains("am"));//returns true or false

		//System.out.println(s1.endsWith("u"));
		//System.out.println(s1.endsWith("pu"));

		//System.out.println(s1.startsWith("i a"));

		String s1 = "lpu";
		String s2 = "lpu";
		String s3 = "Lpu";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));

		String s4 = "I am an engineering student";
		char ch[] = new char[10];
		s4.getChars(6,16,ch,0);
		System.out.println(ch);

		String s5 = "this is one indexof example";
		System.out.println(s5.indexOf("index"));

		System.out.println(s5.indexOf("is"));
		System.out.println(s5.indexOf("is",3));

		System.out.println(s5.lastIndexOf("is"));
		System.out.println(s5.isEmpty());

		String s11 = "welcome";
		String s22 = "to";
		String s33 = "lpu";
		String s = String.join("-",s11,s22,s33);
		System.out.println(s);

		String ss = String.join("/","13","02","2025");
		System.out.println(ss);

		String s6 = "i am ramesh";
		System.out.println(s6.length());

		String s7="   hello lpu     ";
		System.out.println(s7.trim().length());
		System.out.println(s7.trim());
	}
}


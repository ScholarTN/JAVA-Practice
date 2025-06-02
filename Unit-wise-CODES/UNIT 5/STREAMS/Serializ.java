import java.io.*;
class student implements Serializable
{
	int id;
	String name;
	student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class Serializ
{
	public static void main(String[] arg) throws Exception
	{
		student s1 = new student(101,"ramesh");

		//OutputStream file = new FileOutputStream("file.txt");
		ObjectOutputStream file1 = new ObjectOutputStream(new FileOutputStream("file.txt"));
		file1.writeObject(s1);
		file1.close();

		ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("file.txt"));
		student s2 = (student)file2.readObject();
		file2.close();

		System.out.println(s2.id);
		System.out.println(s2.name);
	}
}

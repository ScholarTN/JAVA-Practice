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

public class SerialMulti
{
        public static void main(String[] arg) throws Exception
        {
                student s1 = new student(101,"ramesh");
                student s2 = new student(102,"suresh");
                student s3 = new student(103,"rajesh");
                student s4 = new student(104,"mukesh");
                ObjectOutputStream file1 = new ObjectOutputStream(new FileOutputStream("file.txt"));
                file1.writeObject(s1);
                file1.writeObject(s2);
                file1.writeObject(s3);
                file1.writeObject(s4);
                file1.close();

                ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("file.txt"));
                student o1;
                try{
                while((o1 = (student)file2.readObject())!=null){
                    System.out.println(o1.id);
                    System.out.println(o1.name);
                }
                file2.close();                
                }
                catch(Exception e)
                {}
        }
}


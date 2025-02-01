class Student
{
    int rollno;
    String name;
    int marks;
}



public class ArrayObjects {
    
    public static void main(String a[])
    {
        Student S1 = new Student();
        S1.rollno = 1;
        S1.name =" SCHOLAR";
        S1.marks= 78;

        Student S2 = new Student();
        S2.rollno = 2;
        S2.name =" Thubalami";
        S2.marks= 86;

        Student S3 = new Student();
        S3.rollno = 3;
        S3.name =" Nkomazana";
        S3.marks= 90;
        


        //ARRAY OF STUDENTS
        Student students[]=new Student[3];
        students[0]=S1;
        students[1]=S2;
        students[2]=S3;

        for(int i=0; i<students.length;i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }

    }
}

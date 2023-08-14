package javaBasics.OOPS;

public class ClassesANDobjects {
    public static void main(String[] args) {
        //declaring
       /* Student stud1;
        stud1=new Student();*/

        //OR
        Student stud1=new Student();

        stud1.roNo=12;
        stud1.name="bhaskar";
       // stud1.marks=80.4f;
        System.out.println(stud1.roNo);
        System.out.println(stud1.name);
        System.out.println(stud1.marks);

    }

}
class Student{
    int roNo;
    String name;
    float marks=90;

}

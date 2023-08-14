package javaBasics.OOPS;

public class Constructor {
    public static void main(String[] args) {
        Stud s1=new Stud();
        Stud s2=new Stud();

       // System.out.println(s1.name);
       // System.out.println(s1.age);
        //s1.greeting();
        System.out.println(s2.name);
        s2.changeName("govinda");
        s2.greeting();
       System.out.println(s2.name);


    }
}
    class Stud{
    String name;
    int age;

    void greeting(){
        System.out.println("Hello this is "+this.name);
    }

    void changeName(String a){
        name=a;
    }

    //we need to add the values of the above
    //properties object by object

        //we need one word to access every object
    Stud(){
       this.name ="bhaskar";
       this.age=10;
    }


    }

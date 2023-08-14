package javaBasics.OOPS;

public class ParamConstructor {
    public static void main(String[] args) {
        Person p1=new Person(20,"10");
        System.out.println(p1.age);
        System.out.println(p1.ro);
        Person p2= new Person();
        System.out.println(p2.name);
        Person random =new Person(p2);
        System.out.println(random.name);
        //Calling a constructor from another constructor
        A random2= new A();
        System.out.println(random2.name);


    }

}
class Person{
    int age;
    String ro;
    String name;


    //Constructor Overloading
    //Person arpit =new Person(12,"24");
    //here This will be replaced by arpit
    Person(int age,String ro){
    this.age=age;
    this.ro=ro;
    }
    Person(){
        this.name="lalu yadav";
    }

    Person(Person abc){
        this.name=abc.name;
    }



}
class A{
    String name;
    int year;

    A(){
        //this is how you call a cons from another const
        //internall:new (2002,"bhaskar")
        this(2002,"bhaskar");
    }

    A(int year,String name){
        this.year=year;
        this.name=name;
    }
}
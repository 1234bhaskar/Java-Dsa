package javaBasics.OOPS.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Child1 a=new Child1(30);
        a.career();
        a.partner();
        System.out.println(a.age);

        //abstractDemo b=new abstractDemo();
        //you can not create Objects of an abstract class

        //static methods in abstract class
        //The static keyword belongs to the class than an instance of the class.
        // The static keyword is used for a constant variable or a method that is the same for every instance of a class.
        abstractDemo.a();
    }
}

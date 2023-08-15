package javaBasics.OOPS.polymorphism;

public class Circle extends Shapes{


     //Overriding
    //this will run when obj of Circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation //used for checking
    void area() {
        System.out.println("Area is pi * r * r");
    }

}

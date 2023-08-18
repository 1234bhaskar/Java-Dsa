package javaBasics.OOPS.AbstractClasses;

 public class Child1 extends abstractDemo{

     public Child1(int age){
         super(age);
     }

    @Override
 public void career(){
     System.out.println("hey this is child1 / Career");
 }
    @Override
    public void partner(){
        System.out.println("hey this is child1 / Partner");
    }
}

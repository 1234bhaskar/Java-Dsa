package javaBasics.OOPS;

public class WrapperExample {
    public static void main(String[] args) {
    final B b=new B("bhaskar");
     b.name="Kat";

     //when a non primitive is final,you cannot reassign it.
     //b=new B("abc");
    }

}
    class B{
     final int nums=10;
     String name;

     B(String name){
         this.name=name;
     }
    }


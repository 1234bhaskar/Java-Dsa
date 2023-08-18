package javaBasics.OOPS.AbstractClasses;

   public abstract class abstractDemo {
     int age;
     public abstractDemo(int age){
         this.age=age;
     }
     //abstract abstractDemo();
       //you can not create abstract constructor

       //we can use static method in abstract class;
       static void a(){
           System.out.println("I am static void A");
       }
    abstract void career();
    abstract void partner();
}

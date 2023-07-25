package javaBasics.functions;

public class Overloading {
    public static void main(String[] args) {
        //three of them having same name but different arguments,this is Method Overloading.
       //at compile time it decides which function to run
        fun(20);
        fun("bhaskar chand ");
        fun(20,20);
       // fun(); this will give an error

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
}

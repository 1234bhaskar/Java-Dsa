package javaBasics.functions;

public class Shadowing {
    static int x=90;//this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;
        x=0;
        System.out.println(x);//scope will begin when value is initialized
         /*int x=0;
        System.out.println(x);//0
 fun();*/
    }
    static void fun(){
        System.out.println(x);
    }
}

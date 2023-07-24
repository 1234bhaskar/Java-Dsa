package javaBasics.functions;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

     //sum();
        int a=sum();
        System.out.println(a);

        System.out.println(greet());
    }
    /*static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a");
        int a=in.nextInt();
        System.out.println("Enter b");
        int b=in.nextInt();
        int sum1=a+b;
        System.out.println("The Sum is "+sum);

    }*/
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a");
        int a=in.nextInt();
        System.out.println("Enter b");
        int b=in.nextInt();
        int sum1=a+b;
        //System.out.println("The Sum is "+sum);
        return sum1;

        }


        static String greet(){
        String greeting="how are you";
        return greeting;
        }

    }


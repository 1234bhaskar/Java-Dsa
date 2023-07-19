package javaBasics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=input.nextInt();
        System.out.println("Enter Second number");
        int b=input.nextInt();

        int sum=a+b;
        System.out.println("The Sum is : "+sum);
    }
}

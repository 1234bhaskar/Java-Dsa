package javaBasics.Recursion.Questions;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        //print2(n);
        //Q.fact of N
       /* int ans=fact(n);
        System.out.println(ans);*/
        //Sum of digits
        /*int ans=sum(n);
        System.out.println(ans);*/
        //Product of digits
        /*int ans=product(n);
        System.out.println(ans);*/
        //print no. of zeros
        System.out.println(count(10002));
    }

     static int product(int n) {
        if(n%10==n){
            return n;
        }
        return product(n/10) * (n%10);
    }


    //Q.Print from n to 1.
    static void print(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        print(n-1);
    }
    //Q.Print from 1 to n.
    static void print2(int n){
        if(n==0){
            return;
        }
        print2(n-1);
        System.out.println(n);
    }

    //Factorial
     static int fact(int n) {
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    //count no. of zeroes in a digit
    static int count(int n){
        return zeros(n,0);
    }
    static int zeros(int n,int c){
        if(n==0){
            return c;
        }

        if(n%10==0){
            return zeros(n/10,c+1);
        }
        return zeros(n/10,c);
    }

    //Number of Steps to Reduce a Number to Zero.

        static int numberOfSteps(int num) {
            return (func(num, 0));
        }
        static int func(int nums,int c){
            if(nums<=0){
                return c;
            }
            if(nums%2==0){
                return func(nums/2,c+1);
            }
            return func(nums-1,c+1);
        }

}

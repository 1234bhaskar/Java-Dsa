package javaBasics.functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        //Prime or not
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        /*boolean ans=isPrime(a);
        System.out.println(ans);*/

        // three digit Armstrong number



    }
       static  boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        int c=2;
        while(c*c<=a){
            if(a%c==0){
                return false;
            }
            c++;
        }
        /*if(c*c>a){
            return true;
        }
        return false;*/
           //OR
           return c*c>a;
       }
}

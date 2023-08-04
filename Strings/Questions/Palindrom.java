package javaBasics.Strings.Questions;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String a=input.next();

       boolean ans= isPalindrom(a);
        System.out.println(ans);
    }

     static boolean isPalindrom(String a) {
         a=a.toLowerCase();
         if(a==null || a.length()==0){
            return true;
        }
         for (int i = 0; i <a.length() /2 ; i++) {
            int start=a.charAt(i);
            int end=a.charAt(a.length()-1-i);
            if(start!=end){
                return false;
            }
         }
         return true;
    }

}

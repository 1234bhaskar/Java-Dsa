package javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // float num =input.nextFloat();
       // System.out.println(num);

        //type conversion (from int to float)
        //float num =input.nextInt();
        //System.out.println(num);

        //typeCasting  (from float to int)

       //  int num=(int)(56.999);
     //   System.out.println(num);

        //automatic type promotion in expressions
       // int a=257;
       // byte b=(byte)(a); //257%256=1
       // System.out.println(b);
      //  byte a=40;
      //  byte b=50;
      //  byte c=100;
      //   int d=a*b/c;
      //  System.out.println(d);



       // int number='A';
        //System.out.println(number);


       // System.out.println("नमस्ते");

       //System.out.println(3*6.34723947f);
       // System.out.println(3*6.3472394786);
       // System.out.println(3*6);

       byte b=23;
       char c='r';
       short s=1024;
       int i=3000;
       float f=2133.234f;
       double d=0.1232442;
       double result =(f*b)+(i/c)-(d-s);
       //float +int - double= double
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);



    }
}

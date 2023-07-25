package javaBasics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        /*int[] arr=new int[5];
        arr[0]=1;
        arr[1]=32;
        arr[2]=2;
        arr[3]=320;
        arr[4]=25;
      //[1,32,2,320,25]
        System.out.println(arr[0]);
*/
        Scanner input =new Scanner(System.in);
        /*int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }*/
        /*for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }*/
        /*for(int num:arr){ //for every element in array,print the element
            System.out.println(num+" ");//here num represents element of the array
        }*/
        //or
        //System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str=new String[4];
        for (int i=0;i<str.length;i++){
            str[i]=input.next();
        }
        System.out.println(Arrays.toString(str));
        //modify
        str[1]="bhaskar";
        System.out.println(Arrays.toString(str));
    }
}

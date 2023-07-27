package javaBasics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        /* Syntax
        int[][] arr=new int[3][];*/

        int[][] arr2D={
                {1,2,3}, //0th index
                {4,5},//1st
                {6,7,8,9}//2nd -> arr[2]={6,7,8,9}
        };

        int[][] arr=new int[3][2];
        System.out.println(arr.length);
        //input
        Scanner in=new Scanner(System.in);
         for (int row=0;row<arr.length;row++){
             //for each col in every row
             for (int col=0;col<arr[row].length;col++){
                 arr[row][col]=in.nextInt();
             }
         }
         //output
        /*for (int row=0;row<arr.length;row++){
            //for each col in every row
            for (int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }
    */
        /*for (int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }*/
        for(int[] row :arr){
            System.out.println(Arrays.toString(row));

        }
    }
}

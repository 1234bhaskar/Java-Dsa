package javaBasics.Arrays;

import java.util.Arrays;

public class Passing_in_functions {
    public static void main(String[] args) {
        int [] arr= {1,22,13,23,1};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int []arr){
        arr[0]=99;

    }
}

package javaBasics.Arrays.Searching;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,5,6,7},
                {8,9}
        };
        //Search in 2d array
        int target=9;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        //max in 2d
        int max=maximun(arr);
        System.out.println("Maximum element in the array is :"+max);
    }
    static int[] search(int[][] a,int target){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==target){
                    return new int[]{i,j};
                }
            }            
        }
        return new int[]{-1,-1};
    }

    static int maximun(int[][] a){
        int max=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
              if(a[i][j]>max){
                  max=a[i][j];
              }
            }
        }
        return max;
    }
}

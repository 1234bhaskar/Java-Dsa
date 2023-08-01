package javaBasics.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selection(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }

    }

     static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for (int i=0;i<=last;i++) {
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int a,int b){
      int temp=arr[a];
      arr[a]=arr[b];
      arr[b]=temp;

    }

}

package javaBasics.Arrays.Questions;

import java.util.Arrays;

public class swapArrayElements {
    public static void main(String[] args) {
        //Q1.SWAP values in an array
      int [ ] arr={ 1,2,21,3,42,10};
        swap(arr,1,5);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] a,int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

}

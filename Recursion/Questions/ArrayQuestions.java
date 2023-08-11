package javaBasics.Recursion.Questions;

import java.util.ArrayList;

public class ArrayQuestions {
    public static void main(String[] args) {
        int [] arr={1,1,3,6,12,22,31,44};
       // System.out.println(func(arr,0));
        //System.out.println(Search(44,arr,0));
       // System.out.println(LastSearch(44,arr,arr.length-1));
        //arr[1]=1;
        findAllOccurances(1,arr,arr.length-1);
        System.out.println(list);

    }
    //To find if the array is Sorted or not.
    static boolean func(int [] arr,int index){
       if(index == arr.length-1) {
           return true;
       }
            return arr[index]<arr[index+1] && func(arr,index+1);

    }
    //For linear Search
    static int Search(int n,int[] arr,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==n ){
            return i;
        }
        return Search(n,arr,i+1);
    }
    //find index from last
    static int LastSearch(int n,int[] arr,int i){
        if(i == -1){
            return -1;
        }
        if(arr[i]==n ){
            return i;
        }
        return LastSearch(n,arr,i-1);
    }

    //Linear Search on Multiple Occurances.

    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllOccurances(int n,int[] arr,int i){
        if(i == -1){
            return ;
        }
        if(arr[i]==n ){
            list.add(i ) ;
        }
         findAllOccurances(n,arr,i-1);
    }
}

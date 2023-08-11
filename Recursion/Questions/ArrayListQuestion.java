package javaBasics.Recursion.Questions;

import java.util.ArrayList;

public class ArrayListQuestion {
    public static void main(String[] args) {
        int [] arr={1,1,3,6,12,22,31,44};
        ArrayList<Integer> ans=findAllOccurance(arr,1,0,new ArrayList<>());
        System.out.println(ans);
    }

    static ArrayList<Integer> findAllOccurance(int[] arr, int t, int i, ArrayList<Integer> list) {
       if(i==arr.length){
           return list;
       }
        if(arr[i]==t){
            list.add(i);
        }
        return findAllOccurance(arr,t,i+1,list);
    }
}

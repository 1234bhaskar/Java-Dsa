package javaBasics.Stack;

import java.util.*;

public class QuestionsStack {

    //Balanced Brackeets
   /* public static boolean isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for (int i = 0; i < n; i++) {
           if(str.charAt(i)=='('){
               st.push(str.charAt(i));
           }else {
               if (st.size()==0)return false;
               if (st.peek()=='(') st.pop();
           }
        }
        if(st.size()>0) {
            return false;
        }
        else return true;
    }*/

    //find min no. of brackets removed to make the string balanced.
    /*public static int isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int n=str.length();
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='('){
                st.push(str.charAt(i));
            }else {
                if (st.size()==0){
                    return st.size();
                }
                if (st.peek()=='(') st.pop();
            }
        }
        return st.size();
    }*/

    //Remove consecutive subsequence [1,2,2,3,4,4,4,4,4,5,5,5,2]->[1,2,3,4,5,2]
    public static int[] remove(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(st.isEmpty() || st.peek()!=arr[i]){
                st.push(arr[i]);
            }else if(arr[i]==st.peek()){
            if(i==n-1 || arr[i]!=arr[i+1]){
                st.pop();
            }
        }
        }
        int []res=new int [st.size()];
        int m=res.length;
        for (int i=m-1;i>=0;i--){
            res[i]=st.pop();
        }
          return res;
    }

    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
/*
        Stack<Character> st=new Stack<>();
*/
       // String str= sc.nextLine();
        //System.out.println(isBalanced(str));

        //Remove consecutive subsequence
        int [] arr={1,2,2,3,4,4,4,4,5,5,5,2,2,1};
        int res[]=remove(arr);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }


}

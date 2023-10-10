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

    //Next greater Element
    public static int[] NextG(int []arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int []res=new int[n];
        for (int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<arr[i]  ){
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            }
            else res[i]= st.push(arr[i]);
        }
        return res;
    }


    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        // code here
        Stack<Integer> s=new Stack();
        for(int i=0;i<n;i++){
            s.push(i);
        }
        while(s.size()>1){
            int v1=s.pop(); //2
            int v2=s.pop(); //1

            if(M[v1][v2]==0){
                s.push(v1);
            }else if(M[v2][v1]==0){
                s.push(v2);
            }
        }
        if(s.size()==0)return -1;

        int potential=s.pop();

        for(int j=0;j<n;j++){
            if(M[potential][j] == 1) return -1;
        }
        for(int i=0;i<n;i++){
            if(i==potential) continue;
            if(M[i][potential] == 0) return -1;
        }

        return potential;
    }
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
/*
        Stack<Character> st=new Stack<>();
*/
       // String str= sc.nextLine();
        //System.out.println(isBalanced(str));

        //Remove consecutive subsequence
       /* int [] arr={1,2,2,3,4,4,4,4,5,5,5,2,2,1};
        int res[]=remove(arr);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }*/

        //Next greater Element
        int [] arr={1,3,2,1,8,6,3,4};
        System.out.println(NextG(arr));

    }




}

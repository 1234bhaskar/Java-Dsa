package javaBasics.Stack.Questions;

import java.util.Stack;

public class removeConsecutiveSequence {
    public static void main(String[] args) {
        int []arr={1,2,2,3,10,10,10,4,4,4,5,7,7,2}; //ANS = 1 3 5 2
        int []res=remove(arr);

        for (int a: res ) {
            System.out.print(a+" ");
        }
    }
    public static int[] remove(int [] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0 || arr[i]!=st.peek() ){
                st.push(arr[i]);
            }else{
               if(st.peek() == arr[i]){
                   if(i!=n-1 && st.peek()!=arr[i+1]){
                       st.pop();
                   }
               }
            }
        }

        int[]res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}

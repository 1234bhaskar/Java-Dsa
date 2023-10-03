package javaBasics.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReOrderQueueGFG {
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.add(7);
        Q.add(8);

        System.out.println(Q);
        int n=Q.size();
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=n/2;i++){
            st.push(Q.remove());
        }
        while(!st.isEmpty()){
           Q.add(st.pop());
        }
        //System.out.println(Q);
        for(int i=1;i<=n/2;i++){
            st.push(Q.remove());
        }
       // System.out.println(Q);
        while (!st.isEmpty()){
           Q.add(st.pop());
           Q.add(Q.remove());
        }
        for(int i=1;i<=n;i++){
           st.push(Q.remove());
        }
        for(int i=1;i<=n;i++){
            Q.add(st.pop());
        }
        System.out.println(Q);
    }
}

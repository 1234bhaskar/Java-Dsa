package javaBasics.Queue;

import java.util.*;
public class QuestionsQueue {
    public static void main(String[] args) {
        Queue<Integer> Q=new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);

        //reverse  a Queue
     /*Stack <Integer> S=new Stack<>();
        System.out.println(Q);
     while(!Q.isEmpty()){
         S.push(Q.remove());
     }
     while(!S.isEmpty()){
         Q.add(S.pop());
     }
        System.out.println(Q);
     */

        //reverse a first k elements of Queue

        int x=2;
        Stack <Integer> S=new Stack<>();
        Queue <Integer> Q2=new LinkedList<>();
        System.out.println(Q+"Before reverse");
        while(x>=1){
            S.push(Q.remove());
            x--;
        }
        /*x=1;
        while(!Q.isEmpty()){
        Q2.add(Q.remove());
        }
        while (x<=2){
            Q.add(S.pop());
            x++;
        }
        while(!Q2.isEmpty()){
        Q.add(Q2.remove());
        }
*/
        /*//or
        x=2;
        while(!S.isEmpty()){
            Q.add(S.pop());
        }
        System.out.println(Q);

        while (){
            int val=Q.peek();
            Q.remove();
            Q.add(val);
            x--;
        }*/
        System.out.println(Q);

        //Implement Stack Using Queue

        /*
    class MyStack {
    Queue<Integer> q=new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.remove();
        return val;
    }

    public int top() {
        for(int i=1;i<=q.size()-1;i++){
            q.add(q.remove());
        }
        int val=q.peek();
        q.add(q.remove());
        return val;

    }

    public boolean empty() {
        return q.size()==0;
    }
    }*/
    }
    }


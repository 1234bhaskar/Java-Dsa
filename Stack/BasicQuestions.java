package javaBasics.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BasicQuestions {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,x);
        st.push(top);
        }
    public static void reve(Stack<Integer> st){
        if(st.size() ==1)return;
        int top=st.pop();
        reve(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Copy one stack to another
       /* Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        *//*reverseStack*//*
        Stack <Integer> gt=new Stack<>();
        while(st.size()>0){
          gt.push(st.pop());
        }
        //reverse stack
        Stack <Integer> rt=new Stack<>();
       while(gt.size()>0){
           rt.push(gt.pop());
       }
        System.out.println(rt);*/

        //Insert at any index of stack
        /*Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        int indx=2;
        int element=100;
        Stack<Integer> temp=new Stack<>();
        while(st.size()>indx){
            temp.push(st.pop());
        }
        st.push(element);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);*/

        //Pop from Bottom or any index
        /*Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int indx=2;
        Stack <Integer> temp=new Stack<>();
        while(st.size()>indx+1){
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);*/

        //Reverse a given stack recursive



        Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reve(st);
        System.out.println(st);
    }
}

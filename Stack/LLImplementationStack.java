package javaBasics.Stack;

public class LLImplementationStack {
    public static class Node{
        int val;
        Node next;
         Node(int val){
            this.val=val;
        }
    }
    public static  class LLStack{
        Node head=null;
        private int size=0;
        void push(int x){
            Node temp= new Node(x);
           temp.next=head;
           head=temp;
           size++;
        }

        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
        displayrec(head);
            System.out.println();
        }
        void displayrev(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
           temp=temp.next;
        }
        }
        int size(){
            return size;
            }
            int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x=head.val;
           head=head.next;
           return x;
            }
            int peek(){
                if(head==null){
                    System.out.println("Stack is Empty!");
                    return -1;
                }
                return head.val;
            }
    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
    }
}

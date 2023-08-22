package javaBasics.LinkedList;

public class DoublyLL {

    Node head;
    public void  insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
        head.prev=node;
        }
        head=node;

    }
    public void display(){
        Node node=head;
        Node last=null; //
        while(node!=null){
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println("END");


        System.out.println("Print in Reverse");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("END");
    }



    private class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
             this.val=val;
        }

        Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}


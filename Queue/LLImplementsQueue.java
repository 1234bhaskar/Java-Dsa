package javaBasics.Queue;

public class LLImplementsQueue {
  static class Node{
         int val;
         Node next;

         Node (int val){
             this.val=val;
         }
    }

    public static class queueLL{
        Node head;
        Node tail;
         int size=0;
          public void add(int x){
                Node temp=new Node(x);
              if(size==0){
                head=tail=temp;
              }else{
                  tail.next=temp;
                  tail=temp;
              }
              size++;
          }

          public int remove(){
              if(size==0){
                  System.out.println("Queue is empty");
                  return -1;
              }
                  int value=head.val;
                  head=head.next;
                  size--;
                  return value;
          }

          public int peek(){
              if(size==0){
                  System.out.println("Queue is empty");
              }
                  return head.val;
          }

          public void display(){
              Node temp=head;
              while(temp!=null){
                  System.out.print(temp.val+" ");
                  temp=temp.next;
              }
              System.out.println();
          }



    }

    public static void main(String[] args) {
      queueLL Q=new queueLL();
      Q.add(1);
      Q.add(2);
      Q.add(3);
      Q.add(4);
      Q.display();
      Q.remove();
      Q.display();
      System.out.println( Q.peek());

    }
}

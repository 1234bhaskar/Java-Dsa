package javaBasics.Queue;

public class CircularQueue {
  public static class CQA{
      int f=-1;
      int r=-1;
      int size=0;
      int[] arr=new int[5];

      public void add(int x) throws Exception{
          if(size==arr.length){
              throw new Exception("Queue is full");
          }else if(size==0){
              f=r=0;
              arr[r]=x;
              size++;

          } else if(r < arr.length-1) {
              arr[++r]=x;
              size++;

          }else if(r == arr.length-1){
              r=0;
              arr[r]=x;
              size++;

          }
      }

      public int remove()throws Exception{
          if(size==0){
              throw new Exception("Queue is Empty");
          }else {
              int val=arr[f];
              if(f==arr.length-1) f=0;
              else f++;
              size--;
             return val;
          }
      }

      public int peek() throws Exception{
          if(size==0){
              throw new Exception("Queue is Empty");
          }else {

          return arr[f];
          }
      }

      private void display(){
          if(size==0){
              System.out.println("Queue is Empty");
              return;
          }
          else if(f<r){
              for (int i = f; i <= r; i++) {
                  System.out.print(arr[i]+" ");
              }
          } else{ //r<=f
              for (int j = f; j < arr.length; j++) {
                  System.out.print(arr[j]+" ");
              }
              for (int i = 0; i <= r; i++) {
                  System.out.print(arr[i]+" ");
              }

          }
          System.out.println();
      }

      public boolean isEmpty(){
          return (size==0);
      }
  }

    public static void main(String[] args) throws Exception {
        CQA q=new CQA();
        //q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);


        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.isEmpty());
        q.add(8);
        q.display();
        q.add(10);
        q.display();


    }
}

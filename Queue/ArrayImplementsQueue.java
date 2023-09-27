package javaBasics.Queue;

public class ArrayImplementsQueue {
    public static class queueA{
        int f=-1;
        int r=-1;
        int [] arr=new int[100];
        int size=0;
        public void add(int val){
            if(size==arr.length-1){
               System.out.println("Queue is full,Sorry cannot insert!");
               return;
            }
            if(f==-1){
                f=r=0;
                arr[r]=val;
            }else {
                arr[++r]=val;
            }
            size++;
        }

        public int remove(){
            if(f==-1){
                System.out.println("Queue is Empty!");
                return -1;
            }
            f++;
            size--;
          return arr[f-1];

        }

        public int peek(){
            return arr[f];
        }

        public void display(){
         if(size==0){
             System.out.println("Queue is Empty!");
         }else{
             for (int i=f;i<=r;i++){
                 System.out.print(arr[i]+" ");
             }
         }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA Q=new queueA();
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

package javaBasics.Stack;

public class CustomStack {
    protected int[] data;
    private static final int Default_size=10;

    int ptr=-1;

    public CustomStack()
    {
        this(Default_size);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

     public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is FUll");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
     }
     public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from Empty Stack!");
        }
        return data[ptr--];
     }

     public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty Stack!");
        }
        return data[ptr];
     }

     private boolean isFull(){
        return ptr == data.length-1;
     }

     private boolean isEmpty(){
        return ptr==-1;
     }

}

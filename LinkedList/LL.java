package javaBasics.LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size=0;
    }

    //insert at an index
    public void insert(int val,int index){
    if(index==0){
        insertFirst(val);
        return;
    }
    if (index == size){
        insertLast(val);
        return;
    }
    Node temp=head;
    for(int i=0;i<index;i++){
      temp=temp.next;
    }
    Node node=new Node(val,temp.next);
    temp.next=node;

    size++;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node2=new Node(val);
        tail.next=node2;
        tail=node2;
        size+=1;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size=size+1;

    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //delete last
    public int deletLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val =tail.value;
        tail=secondLast;
        tail.next=null;
                return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++) {
        node=node.next;
        }
        return node;
    }
    //delete at index
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deletLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;

        prev.next=prev.next.next;
        return val;
    }
    public Node find(int val){
        Node node= head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.value +" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //Questions
    //1. Remove duplicates L.C 83
    public void duplicates(){
        Node node= head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    //2.Merge 2 sorted arrays
    public static LL merge(LL first,LL second){
        Node f=first.head;
        Node s=second.head;

        LL ans=new LL();
        while(s!=null && f!=null){
             if(s.value>f.value){
                 ans.insertLast(f.value);
                 f=f.next;
             }else{
                 ans.insertLast(s.value);
                 s=s.next;
             }
        }

        while (f !=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }



    private class Node{
        private int value;
        private Node next;



        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }
}

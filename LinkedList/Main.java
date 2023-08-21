package javaBasics.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
           list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(30);

        //insert at last
        list.insertLast(10);

        list.display();

        //delete first item
        System.out.println(list.deleteFirst());
        list.display();
       //delete Last
        System.out.println(list.deletLast());
        list.display();
        //delete from index
        System.out.println(list.delete(1));
        list.display();


    }

}

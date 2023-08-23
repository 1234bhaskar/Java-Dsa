package javaBasics.LinkedList;

public class MainDoublyLL {
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(30);

       // list.display();


        //insert last
        list.insertLast(199);
        //list.display();

        //insert at a perticular index

        list.insert(4,100);
        list.display();
    }
}

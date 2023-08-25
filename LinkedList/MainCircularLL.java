package javaBasics.LinkedList;

public class MainCircularLL {
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(1);
        list.insert(23);
        list.insert(132);
        list.insert(11);
        list.insert(15);
        list.display();

        //DELETE
        list.delete(11);
        list.display();

    }
}

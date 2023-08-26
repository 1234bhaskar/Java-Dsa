package javaBasics.LinkedList;

public class QuestionsLL {
    public static void main(String[] args) {
          LL list=new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        list.duplicates();
        list.display();

    }
}

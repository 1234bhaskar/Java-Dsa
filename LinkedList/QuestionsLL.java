package javaBasics.LinkedList;

public class QuestionsLL {
    public static void main(String[] args) {
         LL list=new LL();
        /*list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        list.duplicates();
        list.display();*/

        //merge 2 sorted list

        LL first=new LL();
         LL second= new LL();

         first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

       second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans=LL.merge(first,second);
        ans.display();
    }
}

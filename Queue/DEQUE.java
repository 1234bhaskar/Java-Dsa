package javaBasics.Queue;

import java.util.*;
public class DEQUE {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        //add,remove,peek are like Queue;
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        dq.addFirst(6);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        System.out.println(dq.peek());
        dq.add(4);
        System.out.println(dq);
      dq.removeLastOccurrence(4);
        System.out.println(dq);

    }
}

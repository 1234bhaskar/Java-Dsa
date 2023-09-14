package javaBasics.Stack;

import java.util.*;

public class Basic {
    public static void main(String[] args) {
//        Stack <Integer> stack=new Stack<>();
//        stack.push(23);
//        stack.push(3);
//        stack.push(2);
//        stack.push(20);
//        stack.push(1);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


   /*     Queue <Integer> queue=new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(35);
        queue.add(43);
        queue.add(2);


        System.out.println( queue.remove());
        System.out.println( queue.remove());

*/


        //Deque
        Deque <Integer> deque=new ArrayDeque<>();
        deque.add(89);
        deque.addLast(23);
        deque.removeFirst();
    }
}

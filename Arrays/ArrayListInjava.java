package javaBasics.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInjava {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list =new ArrayList<>(5);
/*
        list.add(67);
        list.add(6);
        list.add(7);
        list.add(670);
        list.add(12);
        list.add(23);
        list.add(634);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(670));
        list.set(0,10);
        System.out.println(list);*/

        //input
        Scanner in=new Scanner(System.in);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){

            System.out.println(list.get(i));//pass index here list[index] will not work here.
        }
        System.out.println(list);
    }
}

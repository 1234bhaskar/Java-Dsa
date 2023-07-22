package javaBasics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Switch Case
        Scanner input = new Scanner(System.in);
        //String fruit=input.next();
               /* switch(fruit){
                    case "Apple":
                        System.out.println("Apple");
                        break;
                    case "Mango":
                        System.out.println("Mango");
                        break;
                    case "Grape":
                        System.out.println("Grape");
                        break;
                     default:
                        System.out.println("default");
                }*/

        //enhanced Switch Statement
        /*switch (fruit) {
            case "Apple" -> System.out.println("Apple");
            case "Mango" -> System.out.println("Mango");
            case "Grape" -> System.out.println("Grape");
            default -> System.out.println("default");
        }*/

        // Scanner in=new Scanner(System.in);

/*        //Days of the week
        int days=input.nextInt();
        switch(days){
            case 1-> System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3-> System.out.println("wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7 ->System.out.println("Sunday");
            //default -> System.out.println("Nothing");

        }*/

        //Weakend or weekdays
        //int days = input.nextInt();
        /*switch (days){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weakday You have to work");
                break;
            case 6,7:
                System.out.println("weakend, Enjoy today");

        }
*/
        /*switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weakday You have to work");
            case 6, 7 -> System.out.println("weakend, Enjoy today");
        }*/
         //Nested Switch Case
        int in=input.nextInt();
        String letters=input.next();
       /* switch(in){
            case 1:
                System.out.println("Apple");
                break;
            case 2:
                System.out.println("Mango");
                break;
            case 3:
                switch (letters){
                    case "a":
                        System.out.println("First No.");
                        break;
                    case "b":
                        System.out.println("Second No.");
                        break;
                    default:
                        System.out.println("Nothing");
                }
                break;
            default:
                System.out.println("default");
        }*/

        switch (in) {
            case 1 -> System.out.println("Apple");
            case 2 -> System.out.println("Mango");
            case 3 -> {
                switch (letters) {
                    case "a" -> System.out.println("First No.");
                    case "b" -> System.out.println("Second No.");
                    default -> System.out.println("Nothing");
                }
            }
            default -> System.out.println("default");
        }

    }
}

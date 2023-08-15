package javaBasics.OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box =new Box();
        Box box2 =new Box(4);
        System.out.println(box.l+ " "+box.h+" "+box.w);
        System.out.println(box2.l+ " "+box2.h+" "+box2.w);
        Box box3=new Box(box);
        System.out.println(box3.l+ " "+box3.h+" "+box3.w);
          //Inheritance
        BoxWeight box4=new BoxWeight();
        System.out.println(box4.h+" "+ box4.weight);
        BoxWeight box5=new BoxWeight(1,2,3,4);
        System.out.println(box5.h+" "+box5.l+" "+box5.w+" "+box5.weight);


        //Imp
        Box box6 =new BoxWeight(2,3,4,6);
        System.out.println(box6.w);


        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
     /*   BoxWeight box7 = new Box(2,3,4);
        System.out.println(box7);*/

    }
}

package javaBasics.OOPS.Enums;

public class Basic {
    enum Week implements abc {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //  these are enum constants
        //public,static and final
        // since its final you can create child enums
        //type is Week

        @Override
        public void hello() {
            System.out.println("Hello this is from Iinterface abc");
        }
    }

    public static void main(String[] args) {

     /*   for(Week i:Week.values()){
            System.out.println(i);
        }*/

        Week day;
        day=Week.Friday;

        System.out.println(day.ordinal());

        day.hello(); 

    }
}

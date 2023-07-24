package javaBasics.functions;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="Man";

        {
            a=78;
            System.out.println(a);
            int c=90;
            name="bhaskar";
            System.out.println(name);
            //values initialised in this block ,will remain in block
        }
        int c=70; //c can be intialised again outside the above sccope
        System.out.println(a);
        //System.out.println(c); //cannot use outside the block
        System.out.println(name);

            //Scoping inside a loop

        for (int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
          //  int a=30;   Variable 'a' is already defined in the scope
            a=30;//can be updated
        }


    }
   /* static void random(){
        System.out.println(a);
        //you can not access 'a' because Scope of a is only inside theis function
    }*/



    static void swap(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        //this change will only be valid in this function scope only.
    }

}

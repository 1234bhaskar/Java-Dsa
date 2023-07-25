package javaBasics.functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//Variable Arguments
        fun(1,2,3,4,5,6,7,10);
        func2(4,10,"kunal","rahul","rohit");

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void func2(int a,int b,String ...v){ //varArgs always comes at the end
        //System.out.println(Arrays.toString());
    }
}

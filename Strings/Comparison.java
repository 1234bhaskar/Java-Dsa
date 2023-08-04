package javaBasics.Strings;

public class Comparison {
    public static void main(String[] args) {
        String a="Bhaskar";
        String b="Chand";
        String c=a;
       /* System.out.println(a==b);
        //==
        System.out.println(c==b);*/

        String name1=new String("kunal");
        String name2=new String("kunal");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}

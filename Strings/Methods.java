package javaBasics.Strings;

import java.util.Arrays;


public class Methods {
    public static void main(String[] args) {
        String name="Kunal Kushwaha";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    bhaskar   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

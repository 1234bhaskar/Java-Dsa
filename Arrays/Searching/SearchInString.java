package javaBasics.Arrays.Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name="Bhaskar";
        char target= 's';
        System.out.println(Search(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean Search(String a,char t){
        if(a.length()==0)
            return false;
        /*for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==t){
                return true;
            }
        }*/
        for (char ch:a.toCharArray()) {
            if(ch==t){
                return true;
            }
        }
        return false;
    }
}

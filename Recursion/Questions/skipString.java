package javaBasics.Recursion.Questions;

public class skipString {
    public static void main(String[] args) {
        System.out.println(skipApple("abcappledf"));
    }
    static String skipApple(String p){
        if(p.isEmpty()){
            return "";
        }
        //char ch = p.substring(1);
        if(p.startsWith("apple")){
            return skipApple(p.substring(5));
        }else return p.charAt(0)+skipApple(p.substring(1));
    }
}

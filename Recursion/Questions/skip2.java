package javaBasics.Recursion.Questions;

public class skip2 {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("abcdappsdf"));
    }
   static String  skipAppNotApple(String p){
        if(p.isEmpty()){
            return "";
        }
    if(p.startsWith("app") && !p.startsWith("apple")){
        return skipAppNotApple(p.substring(3));
    }else{
        return p.charAt(0) + skipAppNotApple(p.substring(1));
    }
   }
}

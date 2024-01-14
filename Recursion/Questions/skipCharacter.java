package javaBasics.Recursion.Questions;

public class skipCharacter {
    public static void main(String[] args) {
        skip("","baccdah");
        System.out.println(skip2("baccdah"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String p){
        if(p.isEmpty()){
            return " ";
        }
        char ch=p.charAt(0);
        if(ch=='a'){
           return skip2(p.substring(1));
        }else{
            return ch + skip2(p.substring(1));
        }
    }
}

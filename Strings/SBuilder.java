package javaBasics.Strings;

public class SBuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            s.append(ch);
        }
        System.out.println(s);
        System.out.println(s.deleteCharAt(0));
        System.out.println(s.indexOf("z"));
        System.out.println(s.delete(0,10));




    }
}

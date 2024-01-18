package javaBasics.Recursion.Questions;

import java.util.ArrayList;

public class subSeqRet {
    public static void main(String[] args) {
        System.out.println(subSeQRet("","abc"));

    }
    static ArrayList<String> subSeQRet(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subSeQRet(p+ch,up.substring(1));
        ArrayList<String> right=subSeQRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}

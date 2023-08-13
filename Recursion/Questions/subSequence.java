package javaBasics.Recursion.Questions;

public class subSequence {
    public static void main(String[] args) {
          subSeq("","abc");
    }
    static void subSeq(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return ;
        }
      char ch= unprocessed.charAt(0);

        subSeq(processed+ch,unprocessed.substring(1));
        subSeq(processed,unprocessed.substring(1));
    }
}

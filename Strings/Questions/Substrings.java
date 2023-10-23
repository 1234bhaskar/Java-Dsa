package javaBasics.Strings.Questions;

public class Substrings {
    public static void main(String[] args) {
    //Given a string S=abcd print all substrings of S
        String str="abcd";

        for (int i = 0; i <=3; i++) {
            for (int j = i+1; j <=4;j++) {
                System.out.print(str.substring(i,j)+" ");
            }
        }

    }
}

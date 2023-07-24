package javaBasics.functions;

public class parameters {
    public static void main(String[] args) {
        System.out.println(greet("bhaskar"));

    }
    static String greet(String name){
        String greeting="how are you "+name;
        return greeting;
    }
}

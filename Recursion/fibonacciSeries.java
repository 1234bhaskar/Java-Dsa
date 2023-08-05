package javaBasics.Recursion;

public class fibonacciSeries {
    public static void main(String[] args) {
      int ans= fib(5);
        System.out.println(ans);
        //6th term is 5
    }

     static int fib(int i) {
        if(i<2){
            return i;
        }
        return fib(i-1)+fib(i-2);
    }

}

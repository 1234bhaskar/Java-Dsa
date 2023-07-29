package javaBasics.Arrays.Searching;

public class NoOfEvenDigitsinArr {
    public static void main(String[] args) {
                                  //leetcode 1295 easy
        int []arr={12,345,2,6,7896,22};
        System.out.println( isEven(arr));

    }
   static int isEven(int []arr){
        int count=0;
       for(int i=0;i<arr.length;i++){
           if(even(arr[i])){
               count++;
           }
       }
       return count;
   }

     static boolean even(int num) {
       return (digit(num)%2==0);
    }


    static int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}

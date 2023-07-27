package javaBasics.Arrays.Questions;

public class MaxinArray {
    public static void main(String[] args) {
        int []arr={12,23,1,53,41};
        System.out.println(Max(arr));
    }
    static int Max(int [] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}

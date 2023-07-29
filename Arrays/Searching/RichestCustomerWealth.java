package javaBasics.Arrays.Searching;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        //1672. Richest Customer Wealth
        int [][] arr={
                {1,2,3},
                {3,4},
                {1,3,9}
        };
        System.out.println(RichestWealth(arr));
    }

     static int RichestWealth(int[][] arr) {
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                   int sum=0;
            for (int j=0;j<arr[i].length;j++) {
                sum+=arr[i][j];
            }
           if(sum>ans){
               ans=sum;
           }
        }
        return ans;
    }
   /* static int Max(int[]a){
        int max=a[0];
        for (int x :a) {

            if(a[x]>max){
                max=a[x];
            }
        }
        return max;
    }*/
}

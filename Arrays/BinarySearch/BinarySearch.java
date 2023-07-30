package javaBasics.Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={-18,-9,-6,-3,0,2,3,4,5,6,21,32,111};
        int target=111;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int t){
        int start=0;
        int end= arr.length-1;
         while (start<=end){
             int mid =start+(end-start)/2;
            if(t<arr[mid]){
                end=mid-1;
            }else if(t>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
         }
         return -1;
    }
}

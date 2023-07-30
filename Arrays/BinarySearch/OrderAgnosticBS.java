package javaBasics.Arrays.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr={-18,-9,-6,-3,0,2,3,4,5,6,21,32,111};
        int [] arr2={200,20,10,9,8,6,5,3,0};
        int target=111;
        int target2=20;
        int ans=orderAgnosBsearch(arr,target);
        int ans2=orderAgnosBsearch(arr2,target2);

        System.out.println(ans);
        System.out.println(ans2);

    }

    static int orderAgnosBsearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }else {
            isAsc=false;
        }

        while (start<=end){
            int mid =start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}

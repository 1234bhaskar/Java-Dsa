package javaBasics.Arrays.Searching;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,21,34,230,10,11,4,5};
        System.out.println(Search(arr,2,6,10));
    }
    static int Search(int[] arr ,int x,int y,int target){
        for (int i=x;i<=y;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

package javaBasics.Arrays.Searching;

public class minInRange {
    public static void main(String[] args) {
        int[] arr={1,21,34,230,10,11,4,5};
        System.out.println(Min(arr,2,6,10));
    }
    static int Min(int[] arr,int s,int e,int t){
        int min=arr[s];
        for (int i=s;i<=e;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

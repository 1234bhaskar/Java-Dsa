package javaBasics.Recursion;

public class BinerySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,66,78};
        int ans=search(arr,1,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[]a,int target,int s,int e ){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(a[mid]==target){
            return mid;
        }
        if(a[mid]<target){
           return search(a,target,mid+1,e);
        }
          return   search(a,target,s,mid-1);

    }
}

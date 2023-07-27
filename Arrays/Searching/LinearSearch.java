package javaBasics.Arrays.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int target=7;
        System.out.println(Lsearch(arr,target));

    }
    static int Lsearch(int a[],int t){
        if(a.length==0){
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]==t){
                return i;
            }
        }
        return -1;
    }
}

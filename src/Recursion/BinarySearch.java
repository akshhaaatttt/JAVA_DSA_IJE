package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        System.out.println(Binary(arr, 66,0,arr.length-1));
    }

    static int Binary(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m ;
        }
        if(target < arr[m]){
            return Binary(arr, target, s, m-1);
        }
            return Binary(arr, target, m+1, e);
    }
}

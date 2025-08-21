package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45};
//        int[] arr = {45,33,24,12,7,3,2,0,-4,-7,-11,-18};
        int target =22;
        int ans = binarySearch(arr,target);
        System.out.println("Element found at index: "+ans);

    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start]<=arr[end]) {
            while (start <= end) {
                //            int mid = (start+end)/2;
                int mid = start + (end - start) / 2;//it will not exceed the value
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                //            int mid = (start+end)/2;
                int mid = start + (end - start) / 2;//it will not exceed the value
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        }
        return -1;

    }
}

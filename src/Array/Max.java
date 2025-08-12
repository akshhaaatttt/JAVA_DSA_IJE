package Array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,10,5};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,6));

    }

    static int maxRange(int[] arr, int start, int end){
        int max_item = arr[start];
        for(int i = start; i<end; i++){
            if(max_item<arr[i]){
                max_item=arr[i];
            }
        }
        return max_item;
    }

    static int max(int[] arr){
        int max_item = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max_item<arr[i]){
                max_item=arr[i];
            }
        }
        return max_item;
    }
}

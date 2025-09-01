package BinarySearch.Questions;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,12,35,68,94,97,100,103};
        int target = 68;
        int answer = ans(arr,target);
        System.out.println(answer);
    }
    static int ans(int[] arr, int target){
        //first find the range
        // first start with a box of size 2
        int start = 0;
        int end =1 ;

        // condition for the target to lie in the range
        while(target>arr[end]){
            int newS = end + 1;
            // double the box value
            // end = previous end + size of box * 2
            end =  end + ((end - start + 1)*2);
            start = newS;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start, int end){
        while(start<= end){
//            int mid = (start+end)/2;
            int mid = start + (end -start)/2;//it will not exceed the value
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }

}

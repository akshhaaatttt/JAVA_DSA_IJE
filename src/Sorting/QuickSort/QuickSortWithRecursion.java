package Sorting.QuickSort;

import java.util.Arrays;

public class QuickSortWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1,10,3,19,16,347,269,21,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            // also a reason why if its already sorted it will not swap
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct index please sort two halves now
        sort(nums, low, e);
        sort(nums, s, high);
    }
}

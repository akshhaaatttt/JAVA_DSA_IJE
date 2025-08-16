package LinearSearch;

import java.util.Scanner;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,-12,105,3,9},
                {78,99,34,56},
                {18,12}
        };
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i= 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(max<= arr[i][j]){
                    max = arr[i][j];
                }
                else {
                    continue;
                }
            }
        }
        System.out.print("Maximum value is : ");
        return max;
    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int i= 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(min>= arr[i][j]){
                     min = arr[i][j];
                }
                else {
                    continue;
                }
            }
        }
        System.out.print("Minimum value is : ");
        return min;
    }
}

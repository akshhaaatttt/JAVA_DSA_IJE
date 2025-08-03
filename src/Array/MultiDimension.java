package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9
         */

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // this will give the numbers of row only

//        int [][] arr1 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

//        int [][] arr2 = {
//                {1,2,3},
//                {4,5},
//                {7,8,9}
//        };

        // inputs

        for(int row = 0; row<arr.length;row++){
            for(int col = 0 ; col< arr[row].length; col++){
                arr[row][col]=in.nextInt();
            }
        }

        // output
//        for(int row = 0; row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
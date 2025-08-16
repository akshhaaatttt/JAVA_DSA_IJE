package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int[] ans = search2D(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2D(int[][] arr){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = in.nextInt();
        for(int i= 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == key){
                    System.out.print("Element found at ");
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

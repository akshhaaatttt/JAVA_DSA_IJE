package RowColMatrix;

public class SortedMatrix {
    public static void main(String[] args) {

    }
    // Search in the rows provided and the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while (cStart<= cEnd) {
            int mid = cStart + (cEnd - cStart) /2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid+1;
            } else {
                cEnd = mid-1
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        // run the loop till two rows are remaining
        while (rStart<(rEnd-1)){ // while this is true it will have more than two rows remaining
            int mid = rStart+(rEnd - rStart)/2;
            if(matrix[])
        }
    }
}

package LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,24,25,75,2,46,78};
        search1(arr, 2,1, 2);
      // search between index 1 and 3
    }

    static void search1(int[] arr, int key,  int start, int end) {
        Scanner in = new Scanner(System.in);

        int f = 0;
        int i;
        for (i = start; i <= end; i++) {   // ✅ fixed here
            if (key == arr[i]) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.println("Element Found at index " + i);
        } else {
            System.out.println("Element Not Found");
        }
    }
}


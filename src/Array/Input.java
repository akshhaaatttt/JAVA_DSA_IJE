package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of primitives
        int[] arr = new int[5];
//        arr[0] = 13;
//        arr[1] = 455;
//        arr[2] = 64;
//        arr[3] = 75;
//        arr[4] = 35;

//        System.out.println(arr[3]);

        // input using for loops
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }


        // Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "Akshat";

        System.out.println(Arrays.toString(str));


    }
}

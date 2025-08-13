package LinearSearch;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        int[] arr = {1,24,25,75,2,46,78};
        search(arr);


    }
    static void search(int[] arr){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the element to find");
        int f = 0;
        int key = in.nextInt();
        for(int i = 0; i<arr.length; i++){
            if(key == arr[i]){
                f = 1;

                break;

            }
        }
        if (f == 1){
            System.out.println("Element Found" );

        }else {
            System.out.println("Element Not Found");
        }

    }
}

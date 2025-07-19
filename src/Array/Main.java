package Array;

public class Main {
    public static void main(String[] args) {
        // Q store a roll number
        int a  = 19;

//        Q store 5 roll numbers
//        so we use array
//        Syntax
//
//        Datatype [] variable_name = new datatype[size]
//        int[] rnos = new int[5];
//
//        or directly
//        int[] rnos2 = {23,12,45,34};

        int[] ros; // declaration of array
        ros = new int[5]; // actually here the object is being created in the heap memory
        System.out.println(ros[0]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

    }
}

package Assignments.BasicJavaProgram;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;
        int min =  Integer.MIN_VALUE;
        System.out.println("Enter numbers to sum (0 to stop):");
        while(true){
            n = in.nextInt();
            if(n == 0) break;
            if(n>min){
                min = n;
            }
        }

        System.out.println("Largest is" + min);
        in.close();
    }
}

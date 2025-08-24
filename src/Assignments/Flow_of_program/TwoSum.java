package Assignments.Flow_of_program;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = in.nextInt();
        System.out.print("Enter Second Number: ");
        int b = in.nextInt();

        int result = sum(a, b);
        System.out.println("Sum is " + result);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

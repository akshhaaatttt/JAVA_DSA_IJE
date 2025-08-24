package Assignments.Flow_of_program;

import java.util.Scanner;

public class NumberTillX{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = in.next();

            if (input.equals("x")) break;  // stop when x is entered

            sum += Integer.parseInt(input); // directly add
        }

        System.out.println("Sum = " + sum);
    }
}

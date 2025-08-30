package Assignments.ConditionalsLoops;
import java.util.*;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        int neg = 0;
        int correct = 0;

        System.out.println("Enter numbers to sum (0 to stop):");

        while (true) {
            int num = in.nextInt();

            if (num == 0) {
                break; // stop when user enters 0
            }

            if (num > 0 && num % 2 == 0) {
                even += num;
            } else if (num > 0 && num % 2 != 0) {
                odd += num;
            } else if (num < 0) {
                correct = -(num);
                neg += correct; // add absolute value of negative numbers
            }
        }

        System.out.println("Sum of odd positives = " + odd);
        System.out.println("Sum of even positives = " + even);
        System.out.println("Sum of negatives (absolute) = " + neg);
    }
}

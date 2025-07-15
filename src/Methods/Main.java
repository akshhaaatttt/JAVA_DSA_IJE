package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: take the input of two numbers and print sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        int add = num1 + num2;
        System.out.print("The sum of two numbers is: "+ add);
    }
}

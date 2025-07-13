package conditionandloop;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        // Take input from user till user does not press X or x
        while (true) {
            System.out.print("Select the operator +,-,*,/,%: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two number
                System.out.println("Enter first number: ");
                int num1 = in.nextInt();
                System.out.println("Enter Second number: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Enter a valid num2");
                    }
                }
                System.out.println("Answer is: " + ans);

            }else if (op == 'X' || op == 'x') {
                break;
            }else {
            System.out.println("Invalid Operation");
        }


        }
    }
}

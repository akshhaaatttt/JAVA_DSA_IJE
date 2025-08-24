package Assignments.Flow_of_program;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        table(num);
    }
    static void table(int num){
        for(int i = 1;i<=10;i++) {
            int mul = num * i;
            System.out.println(num + " * " + i + " = " + mul);
        }
    }
}

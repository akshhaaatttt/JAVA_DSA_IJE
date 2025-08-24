package Assignments.First_Java;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        double P = in.nextDouble();
        System.out.println("Enter Rate: ");
        double R = in.nextDouble();
        System.out.println("Enter Time(in months): ");
        double T = in.nextDouble();
        double results = (simple(P, R, T));
        System.out.println("Simple Intrest is: " + results);
    }
    static double simple(double P, double R, double T){
        return (P*R*T)/100;
    }
}

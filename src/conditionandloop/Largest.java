package conditionandloop;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = in.nextInt();
        System.out.println("Enter Second number ");
        int b = in.nextInt();
        System.out.println("Enter Third number ");
        int c = in.nextInt();


        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.println("Largest is: "+max);
//        if (a>b && a>c){
//            System.out.println("A is largest");
//        } else if (b>a && b>c) {
//            System.out.println("B is largest");
//        } else {
//            System.out.println("C is largest");
//        }

    }
}

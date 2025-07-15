package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();  //function call
//        int ans = sum2();
//        System.out.println(ans);

        int ans1 = sum3(20, 40);
        System.out.println(ans1);


    }

    static int sum3(int a, int b){
        int add1 = a+b;
        return add1;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        int add = num1 + num2;
        System.out.print("The sum of two numbers is: "+ add);
        return add;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        int add = num1 + num2;
        System.out.print("The sum of two numbers is: "+ add);
    }

    /*

        access modifier (we'll look in oop)
        return_type name () {
            // body
            return statement;
         }
     */
}

package Assignments.Flow_of_program;

import java.util.Scanner;

public class Lcm_Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second num: ");
        int num2 = in.nextInt();
        int result = Lcm(num1,num2);
        System.out.println("Lcm of "+num1+" & "+num2+" is "+result);
        int result2 = Hcf(num1,num2);
        System.out.println("Hcf of "+num1+" & "+num2+" is "+result2);
    }
    static int Lcm(int num1, int num2){
        int g = Math.max(num1,num2);
        int s = Math.min(num1,num2);
        for(int i = g;i<=num1*num2;i+=g){
            if (i%s==0){
                return i;
            }
        }
        return num1*num2;
    }
    static int Hcf(int num1,int num2){
        int g = Math.min(num1,num2);
        while (g>0){
            if(num1%g==0 && num2%g==0){
                break;
            }
            g--;
        }
        return g;
    }
}

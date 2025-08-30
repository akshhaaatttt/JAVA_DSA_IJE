package Assignments.ConditionalsLoops;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int arm = Armstrong(num);
        if(num == arm){
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not an Armstrong number");
        }
    }
    static int Armstrong(int num){
        double mul =1;
        int sum =0;
        int length = String.valueOf(num).length();
        System.out.println(length);
        while(num>0){
            int n = num%10;
            System.out.println(n);
            mul = Math.pow(n, length);
            int mul1 = (int)mul;
            System.out.println(mul);
            sum += mul1;
            System.out.println(sum);
            num = num/10;
            System.out.println(n);
        }
        return sum;
    }
}

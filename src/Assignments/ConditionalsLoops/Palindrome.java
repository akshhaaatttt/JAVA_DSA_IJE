package Assignments.ConditionalsLoops;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len = String.valueOf(num).length();
        int rev=0;
        int ans =0;
        for(int i = 0;i<len;i++){
            rev = num%10;
            ans = ans*10+rev;
            num = num/10;
        }
        System.out.println(ans);
        if(ans==num){
            System.out.println("Palindrome");
        }else {
            System.out.println("No palindrome");
        }
    }
}

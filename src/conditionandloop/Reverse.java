package conditionandloop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int temp = 0;
        while(num >0){
            int rem = num%10;
            num = num/10;
            temp = temp * 10 +rem;
        }
        System.out.println(temp);
    }
}

package Assignments.BasicJavaProgram;
import java.util.*;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;

        System.out.println("Enter numbers to sum (0 to stop):");
        while(true){
            n = in.nextInt();
            if(n == 0) break;
            sum += n;
        }

        System.out.println("Total sum: " + sum);
        in.close();
    }
}

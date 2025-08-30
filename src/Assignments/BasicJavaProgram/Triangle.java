package Assignments.BasicJavaProgram;
import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int h = in.nextInt();
        double ans = area(b,h);
        System.out.println(ans);
    }
    static double area(int b, int h){
        return 0.5*b*h;
    }
}

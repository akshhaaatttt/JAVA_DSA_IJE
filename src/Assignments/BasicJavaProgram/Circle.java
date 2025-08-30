package Assignments.BasicJavaProgram;
import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        double ans = area(r);
        System.out.println(ans);
    }
    static double area(int r){
        return 3.14*r*r;
    }
}


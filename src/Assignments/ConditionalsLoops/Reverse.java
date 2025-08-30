package Assignments.ConditionalsLoops;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char ch;
        String rev = "";
        for(int i = 0;i<str.length();i++){
            ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}

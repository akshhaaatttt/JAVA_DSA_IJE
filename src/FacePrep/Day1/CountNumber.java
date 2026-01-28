package FacePrep.Day1;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        int count = 0;
        for(int i = 0;i<username.length();i++){
            char ch = username.charAt(i);
            if(ch>='0'&& ch <= '9'){
                count++;
            }
        }
        System.out.println(count);

    }
}

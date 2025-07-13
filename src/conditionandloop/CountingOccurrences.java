package conditionandloop;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter the number you need to find: ");
        int find = in.nextInt();
        int aksh = String.valueOf(num).length();
        int count = 0;
        System.out.println("length of num is : "+aksh);
        for(int i = 0; i < aksh; i++){
            int var = num%10;
            num = num/10;
            if(var == find){
                count++;
            }

        }
        System.out.println("number repeated: "+count);
    }
}

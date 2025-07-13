package Switch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter a valid value");
        }

    }
}

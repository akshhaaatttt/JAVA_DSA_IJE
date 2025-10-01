package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Akshat Jain Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println("     Akshat     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

package Array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(40);
//        list.add(25);
//        list.add(27);
//        list.add(135);
//        list.add(97);
//        list.add(445);


//        System.out.println(list.contains(135));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);


        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        for(int i = 0; i<5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

    }
}

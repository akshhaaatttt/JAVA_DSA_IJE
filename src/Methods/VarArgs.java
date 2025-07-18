package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,89,9,12,13);
        multiple(2,3,"Akshat","Jain","Piet");

    }

    static void multiple(int a, int b, String ...v){
        System.out.println(v);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

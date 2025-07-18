package Methods;

public class Overloading {
    public static void main(String[] args) {
        fun(65);
        fun("Akshat Jain");
        System.out.println(sum(7,8));
        System.out.println(sum(7,8,9));

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;

    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);

    }
}

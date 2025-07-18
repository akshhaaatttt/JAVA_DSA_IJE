package Methods;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 78; // reassign the original outside the block in the same method
            int c = 99;
            // value initialised in this block will remain in the block`
        }
    }
    static void random(){
        int num = 65;
        System.out.println(num);
//        System.out.println(a);  not valid
    }
}

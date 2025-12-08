package Recursion.Strings;

public class stream {
    public static void main(String[] args) {
        System.out.println(skipappnotapple("abappappleabbchg"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));

        } else {
            skip(p+ch,up.substring(1));

        }
    }


    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            return skip1(up.substring(1));

        } else {
            return ch+ skip1(up.substring(1));

        }
    }


    static String skipapple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        } else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }static String skipappnotapple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipappnotapple(up.substring(3));
        } else {
            return up.charAt(0) + skipappnotapple(up.substring(1));
        }
    }
}

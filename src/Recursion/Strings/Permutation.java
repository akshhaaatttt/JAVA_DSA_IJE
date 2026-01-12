package Recursion.Strings;

public class Permutation {
    public static void main(String[] args) {
        permumtations("","abcd");
    }
    static void permumtations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permumtations(f+ch+s,up.substring(1));
        }
    }
}


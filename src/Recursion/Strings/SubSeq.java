package Recursion.Strings;

import java.util.ArrayList;

public class SubSeq{
    public static void main(String[] args) {
        subseq("", "abcd");
    }


    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }


    static ArrayList<String> subseq1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
}

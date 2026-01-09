package Recursion.Strings;

import java.util.ArrayList;

public class SubSeq{
    public static void main(String[] args) {
        System.out.println(subseq1("", "abcd"));

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
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> First = subseq1(p+ch,up.substring(1));
        ArrayList<String> Second = subseq1(p,up.substring(1));
//        ArrayList<String> Third = subseq1(p+(ch+0),up.substring(1));

        First.addAll(Second);
//        First.addAll(Third);
        return First;
    }
}

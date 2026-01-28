package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapChar {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();

            //precompute
            HashMap<Character, Integer> mpp = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                char key = s.charAt(i);
                mpp.put(key,mpp.getOrDefault(key,0)+1);
            }

            // Iteration in the map
            for (Map.Entry<Character, Integer> it : mpp.entrySet()) {
                System.out.println(it.getKey() + " -> " + it.getValue());
            }


            int q = sc.nextInt();
            while (q>0){
                char number = sc.next().charAt(0);
                System.out.println(mpp.getOrDefault(number,0));
                q--;
            }
        }


}


package Hashing;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //precompute
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0;i<n;i++){
            int key = arr[i];
            mpp.put(key,mpp.getOrDefault(key,0)+1);
        }

        // Iteration in the map
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            System.out.println(it.getKey() + " -> " + it.getValue());
        }


        int q = sc.nextInt();
        while (q>0){
            int number = sc.nextInt();
            System.out.println(mpp.getOrDefault(number,0));
            q--;
        }
    }
}

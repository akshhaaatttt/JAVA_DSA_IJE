package GeneralMaths;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
       facrtors3(20);
    }
    // time: O(n)
    static void facrtors1(int n){
        for(int i = 1; i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }

    // time : O(sqrt(n))
    static void facrtors2(int n){
        for(int i = 1; i<=Math.sqrt(n);i++){
            if(n%i == 0) {
                if (n / i == i) {
                    System.out.print(i+ " ");
                } else {
                    System.out.print(i + " " + n / i+ " ");
                }
            }
        }
    }
    // both time and space will be O(sqrt(n))
    static void facrtors3(int n){
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(n);i++){
            if(n%i == 0) {
                if (n / i == i) {
                    System.out.print(i+ " ");
                } else {
                    System.out.print(i + " " );
                    list.add(n/i);
                }
            }
        }
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
    }
}

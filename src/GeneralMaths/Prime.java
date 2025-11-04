package GeneralMaths;

public class Prime {
    public static void main(String[] args) {
        int n =500;
        for(int i =1; i<=n; i++){
            if(isPrime(i) == false){
                continue;
            }else {
                System.out.print(i+" ");
            }
        }

    }
    static boolean isPrime(int n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

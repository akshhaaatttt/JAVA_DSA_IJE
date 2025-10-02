package PatternQuestions;

public class Pattern {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern1(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i =1;i<= n; i++) {
            int col = i > n/2 ? n - i+1 : i;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
//            if(i<=n/2) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }else if(i>n/2){
//                for(int j =1; j<= n-i+1;j++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
        }
    }

    static void pattern28(int n){
        for(int i =1;i<= 2*n; i++) {
            int col = i > n ? 2*n - i : i;

            //both are correct
            int noOfSpaces = n - col;
//            int noOfSpaces = i>n?i-n :n-i;
            for(int k = 1;k<=noOfSpaces;k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for(int i = 1; i<=n; i++){
            int noOfSpaces = n-i;
            for(int k = 1;k<=noOfSpaces;k++){
                System.out.print("  ");
            }
            for(int j = i ; j>= 1;j--){
                System.out.print(j+" ");
            }
            for(int j = 2 ; j<= i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n){
        int originalN = n;
        n = 2*n;
        for(int i =0 ; i<=n;i++){
            for(int j = 0 ; j<=n;j++){
                int left = j;
                int top = i;
                int right = n-j;
                int bottom = n-i;
                int min = originalN-Math.min(Math.min(left,top),Math.min(right,bottom));
                System.out.print(min+" ");
            }
            System.out.println();
        }
    }
}

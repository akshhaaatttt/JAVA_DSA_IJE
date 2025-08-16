package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {24,25,75,2,46,78,1};
        findMin(arr);
    }

    static void findMin(int[] arr){
        int let = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(let>arr[i]){
                let = arr[i];
            }else {
                continue;
            }
        }
        System.out.println("Minimun element is "+ let);

    }
}

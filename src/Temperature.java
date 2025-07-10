import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in C: ");

        float temp = in.nextFloat();
        float tempF = (temp*9/5)+32;
        System.out.println("Temp in F: "+ tempF);
    }
}

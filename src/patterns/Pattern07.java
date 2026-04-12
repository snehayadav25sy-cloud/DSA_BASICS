package patterns;
import java.util.Scanner;


public class Pattern07 {
    static void print07(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <  n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print07(n);

    }
}
package patterns;
import java.util.Scanner;

public class Pattern01 {
    static void print01(int n){
       for(int i =0; i<n ; i++){
           for(int j =0 ; j<n ; j++){
               System.out.print("*");  
           }
           System.out.println();

       }
    }  
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        print01(n);

    }
}


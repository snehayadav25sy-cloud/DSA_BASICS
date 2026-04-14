package Recursions;

import java.util.Scanner;

public class rec03 {
    static void Rec01(int i , int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        Rec01(i-1 , n );  


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rec01(n,n);
    }
}

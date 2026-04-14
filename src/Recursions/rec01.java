package Recursions;

import java.util.Scanner;

public class rec01 {
   static void Rec01(int i , int n){
       if(i>n){
           return;
       }
       System.out.println("sneha");
       Rec01(i+1 , n );


    }

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rec01(1,n);
}
}

package Recursion;

import java.util.Scanner;

public class NumberPrinting {

//    static void ReversedPrintNumber(int n){
//        if(n<=0){
//            return;
//        }
//        System.out.print(n+" ");
//        ReversedPrintNumber(n-1);
//    }

    static void PrintNumber(int n){
        if(n<=0){
            return;
        }
        PrintNumber(n-1);
        if(n%2 == 0){
            System.out.print(n+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println("Reversed Order: ");
//        ReversedPrintNumber(n);
        System.out.println("Normal Order: ");
        PrintNumber(n);

    }


}

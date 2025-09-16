package Recursion;

import java.util.Scanner;

public class NumberPrinting {
    static void PrintNumbers(int n){
        if(n == 0) return;
        PrintNumbers(n-1);
        System.out.print(n+" ");
    }
    static void ReversePrintNumber(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        PrintNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Normal Order: ");
        PrintNumbers(n);
        System.out.println();
        System.out.println("Reversed Order: ");
        ReversePrintNumber(n);
    }

}

package Recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Power(n);
    }
    static boolean Power(int n){
        if(n == 1){
            return true;
        }
        if(n<=0 || n%2 !=0) return false;
        Power(n/2);

    }
}

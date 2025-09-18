package Recursion;

import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Power(n));
    }
    static boolean Power(int n){
        if(n == 1){
            return true;
        }
        if(n<=0 || n%3 !=0) return false;
        return Power(n/3);

    }
}

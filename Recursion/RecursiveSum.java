package Recursion;

import java.util.Scanner;

public class RecursiveSum {
    static int helper(int n, int sum){
        if(n <= 0){
            return sum;
        }
        int d = n%10;
        return helper(n/10, sum+d);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n, 0));
    }
}

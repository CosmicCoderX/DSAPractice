package Recursion;

import java.util.Scanner;

public class Count1InInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = helper(n);
        System.out.println(helper(n));
    }
    static int helper(int n){

        if(n==0){
            return 0;
        }
        int d = n%10;
        int count = helper(n/10);
        if(d == 1){
            return count+1;
        }else{
            return count;
        }
    }
}

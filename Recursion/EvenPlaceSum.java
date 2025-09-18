package Recursion;

import java.util.Scanner;

public class EvenPlaceSum {
    static int helper(int n, int in){
        if(n <= 0){
            return 0;
        }
        int d = n%10;
        int sum = helper(n/10, in+1);
        if(in%2 == 0){
            return sum+d;
        }else{
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(n, 1));
    }
}

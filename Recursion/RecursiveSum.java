package Recursion;

public class RecursiveSum {
    

    static int helper(int n, int sum){
        
        if(n < 0){
            return 0;
        }
        int d = n%10;
        return helper(n/10, sum+d);
    }

    public static void main(String[] args) {
        int n = 1234;
        // int sum = 0;
        // System.out.println(arr[i]);
        // int arr[] = {0, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(helper(n, 0));
        
        // while(n > 0){
        //     int d = n%10;
        //     sum = sum+d;
        //     n = n/10;
        // }
        // System.out.println("Sum of Digit: "+sum);
    }
}

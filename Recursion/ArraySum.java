package Recursion;

public class ArraySum {
    static int helper(int[] arr, int in){
        if(in == arr.length){
            return 0;
        }
//        sum+=arr[in];
        return arr[in] + helper(arr, in + 1);

    }
    //Array Sum using Recursion
    public static void main(String[] args) {
        int[] arr={2,3,5,1,4};
        System.out.println(helper(arr, 0));
    }
}

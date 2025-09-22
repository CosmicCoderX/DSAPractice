package Recursion;

public class CoinSum {
    static int helper(int[] arr , int target , int sum , String ans){
        if(sum==target){
            System.out.println(ans.trim());
            return 1;
        }
        if(sum>target){
            return 0;
        }
        int count =0;
        for (int j : arr) {
            count += helper(arr, target, sum + j, ans + " " + j);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,5};
        int amount = 11;
        int result = helper(arr, amount, 0, "");
        System.out.println("Total ways: "+result);
    }
}

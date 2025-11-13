package Backtracking;

public class Subsets {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        helper(arr, 0 , "");
    }
    static void helper(int[] arr, int in, String notIncluded){
        if(in == arr.length){
            System.out.println(notIncluded);
            return;
        }
        String included = notIncluded +" "+arr[in];
        helper(arr, in+1, included);
        helper(arr, in+1, notIncluded);

    }
}

package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class find_triangular_sum_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        triangularSum(nums);
        sc.close();
    }

    public static void triangularSum(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        while(nums.length > 1){
            for(int i=0; i<nums.length-1; i++){
                int res = (nums[i] + nums[i+1])%10;
                temp.add(res);
            }
//            nums=temp;
        }
        System.out.println(temp);
    }
}

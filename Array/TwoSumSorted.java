package Array;
import java.util.*;
public class TwoSumSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target, n)));
        sc.close();
    }

    public static int[] twoSum(int[] nums, int target, int n) {
        int l = 0;
        int r = n-1;
        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum == target){
                return new int[]{l,r};
            }
            else if(sum < target) l++;
            else r--;
        }
        return new int[]{-1, -1};
    }
}

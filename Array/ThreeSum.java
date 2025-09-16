package Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get Size
        int n = sc.nextInt();
        int[] nums = new int[n];

        //Input Array
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        // Get result
        List<List<Integer>> result = threeSum(nums);

        // Print result
        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1]) right--;
                }else if(sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}

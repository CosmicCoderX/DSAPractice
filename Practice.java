import java.util.HashMap;

public class Practice {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int compliment = target - nums[i];
            if(ans.containsKey(compliment)){
                return new int[]{ans.get(compliment), i};
            }
            ans.put(nums[i], i);
        }
        return new int[]{-1, -1}; // If no solution found
    }
    public static void main(String[] args) {
        Practice practice = new Practice();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = practice.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

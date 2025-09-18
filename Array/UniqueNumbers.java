package Array;
import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Unique(nums));
    }

    static int Unique(int[] nums){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int num : nums){
            if(!set.add(num)){
                count++;
            }
        }
        return count;
    }
}

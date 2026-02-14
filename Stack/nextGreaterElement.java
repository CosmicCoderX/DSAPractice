package Stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static int[] nextGreater(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] res = new int[n];

        res[n-1] = -1;
        st.push(nums[n-1]);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(nums[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,5,3,8,1,6,3,4};
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}

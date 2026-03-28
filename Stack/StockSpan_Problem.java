package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan_Problem {
    public static int[] calculateSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] = i+1;
            else res[i] = i - st.peek();
            st.push(i);

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        System.out.println(Arrays.toString(calculateSpan(arr)));
    }
}

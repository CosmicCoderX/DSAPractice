package Queue;

import java.util.*;

public class firstNegInt_inKWindow {
    public static int[] firstNegInt(int[] arr, int k){
        int n = arr.length;
        int[] res = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                q.add(i);
            }
        }

        for(int i=0; i<n-k+1; i++){

            while(!q.isEmpty() && q.peek() < i){
                q.remove();
            }

            if(!q.isEmpty() && q.peek() <= i+k-1){
                res[i] = arr[q.peek()];
            } else{
                res[i] = 0;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(Arrays.toString(firstNegInt(arr, k)));
    }
}

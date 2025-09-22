package Array;

import java.util.*;

public class CountDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countDistinct(arr, n));
        sc.close(); 
    }

    public static int countDistinct(int[] arr, int n) {
        int count = 0;
        boolean isDistinct;
        for (int i = 0; i < n; i++) {
            isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }
}

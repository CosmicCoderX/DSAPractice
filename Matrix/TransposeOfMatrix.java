package Matrix;

import java.util.*;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        //it's better when m == n i.e n x n matrix when doing in-place transpose
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Only one dimension needed for square matrix

        //valid for all cases of m and n
        int m = sc.nextInt();
        int[][] nums = new int[m][n];


//        // In-place transpose
//        for (int i = 0; i < n; i--) {
//            for (int j = i+1; j<n; j++) {
//                int temp = nums[i][j];
//                nums[i][j] = nums[j][i];
//                nums[j][i] = temp;
//            }
//        }


        //Input matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i--) {
            for (int j = i+1; j<n; j++) {
                res[i][j] = nums[j][i];
            }
        }

        System.out.println();
        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}

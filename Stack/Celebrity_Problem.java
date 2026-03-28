package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity_Problem {
    public static int celebrity(int mat[][], int n){
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<n; i++){
            val.push(i);
        }

        // elimination process: 2 log compare karenge
        while(val.size() > 1){
            int v1 = val.pop(); // first person
            int v2 = val.pop(); // second person

            // agar v1, v2 ko jaanta hai -> v1 celebrity nahi ho sakta
            // isliye v2 ko wapas stack me push karo
            if(mat[v1][v2] == 0){
                val.push(v1);
            }
            // agar v1, v2 ko nahi jaanta -> v2 celebrity nahi ho sakta
            // isliye v1 ko stack me push karo
            else {
                val.push(v2);
            }
        }

        // agar stack empty ho gaya to koi celebrity nahi
        if(val.isEmpty()) return -1;

        // jo last person bacha hai wo potential celebrity hai
        int potential = val.pop();
        // check 1: celebrity kisi ko nahi jaanta hona chahiye
        for(int j = 0; j<n; j++){
            if(j == potential) continue; // khud ko skip karo
            if(mat[potential][j] == 1) return -1;
        }

        // check 2: sabko celebrity ko jaana chahiye
        for(int i = 0; i<n; i++){
            if(i == potential) continue; // khud ko skip karo
            if(mat[i][potential] == 0) return -1;
        }

        return potential;
    }

    public static void main(String[] args) {

        // Test Case 1 (Celebrity = 1)
        int[][] mat1 = {
                {0,1,0},
                {0,0,0},
                {0,1,0}
        };
        System.out.println("Test1 Celebrity: " + celebrity(mat1,3));

        // Test Case 2 (No Celebrity)
        int[][] mat2 = {
                {0,1,0},
                {0,0,1},
                {1,0,0}
        };
        System.out.println("Test2 Celebrity: " + celebrity(mat2,3));

        // Test Case 3 (Celebrity = 2)
        int[][] mat3 = {
                {0,1,1},
                {0,0,1},
                {0,0,0}
        };
        System.out.println("Test3 Celebrity: " + celebrity(mat3,3));

        // Test Case 4 (Celebrity = 0)
        int[][] mat4 = {
                {0,0,0},
                {1,0,1},
                {1,0,0}
        };
        System.out.println("Test4 Celebrity: " + celebrity(mat4,3));

        // Test Case 5 (No Celebrity)
        int[][] mat5 = {
                {0,1},
                {1,0}
        };
        System.out.println("Test5 Celebrity: " + celebrity(mat5,2));

        // Test Case 6 (Celebrity = 3)
        int[][] mat6 = {
                {0,1,0,1},
                {0,0,0,1},
                {1,1,0,1},
                {0,0,0,0}
        };
        System.out.println("Test6 Celebrity: " + celebrity(mat6,4));

    }
}

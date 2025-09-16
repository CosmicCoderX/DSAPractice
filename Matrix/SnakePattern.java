package Matrix;
import java.util.*;
public class SnakePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Pattern(arr, m , n));
        sc.close();
    }

    static List<Integer> Pattern(int[][] arr, int m, int n){
        // int m = arr.length;
        // int n = arr[0].length;
        ArrayList<Integer> res = new ArrayList<>();
        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;
        while(startRow <= endRow){
            for(int i=startCol; i<=endCol; i++){
                res.add(arr[startRow][i]);
            }
            startRow+=1;

            for(int j=endCol; j>=startCol; j--){
                res.add(arr[startRow][j]);
            }
            startRow+=1;
        }

        return res;
    }
}

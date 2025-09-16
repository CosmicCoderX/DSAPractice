package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Try {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println(distinct(M, N));
        sc.close();
    }
    
    static int distinct(int M[][], int N) {
        // code here
        List<Integer> distinct = null;
        for (int i = 0; i < N; i++) {
            distinct = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (!distinct.contains(M[i][j])) {
                    distinct.add(M[i][j]);
                }
            }
        }
        return distinct.size();
    }
}

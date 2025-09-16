import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = sc.nextInt();

        List<List<Integer>> triangle = generate(numRows);
        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : triangle) {                    
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        for(int row=0; row < numRows; row++){
            List<Integer> eachRow = new ArrayList<>();
            int ans = 1;
            eachRow.add(ans);
            for(int col =1; col <=row; col++){
                ans = ans*(row - col +1);
                ans =ans/col;
                eachRow.add(ans);
            }
            triangle.add(eachRow);
        }
        return triangle;
    }
}
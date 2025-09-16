import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        if(n==0){
            System.out.println("Fibonacci number at position " + n + " is: 0");
            sc.close();
        }
        if(n==1){
            System.out.println("Fibonacci number at position " + n + " is: 1");
            sc.close();
        }
        int[] F = new int[n+1];
        F[0]=0;
        F[1]=1;
        for(int i=2; i<=n; i++){
            F[i] = F[i-1] + F[i-2];
        }
        System.out.println("Fibonacci number at position " + n + " is: " + F[n]);
        sc.close();
    }
}

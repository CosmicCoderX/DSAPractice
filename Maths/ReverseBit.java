import java.util.Scanner;
public class ReverseBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = sc.nextLong();  // Use long for input to handle larger numbers
        
        // Check if input exceeds integer limits
        if (n > Integer.MAX_VALUE) {
            System.out.println("Overflow: Input exceeds Integer.MAX_VALUE");
            sc.close();
            return;
        }
        if (n < Integer.MIN_VALUE) {
            System.out.println("Underflow: Input is below Integer.MIN_VALUE");
            sc.close();
            return;
        }
        
        long rev = 0;
        while(n != 0) {
            long d = n % 10;
            
            // Check if the result would exceed integer limits
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && d > 7)){
                System.out.println("Overflow");
                sc.close();
                return;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && d < -8)){
                System.out.println("Underflow");
                sc.close();
                return;
            }
            
            rev = rev * 10 + d;
            n = n / 10;
        }
        
        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}

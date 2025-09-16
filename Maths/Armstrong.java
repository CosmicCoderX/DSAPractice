import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int digit = String.valueOf(Math.abs(n)).length();
        int num = n;
        double sum = 0;
        while(n>0){
            int d=n%10;
            sum = sum + Math.pow(d, digit);
            n = n/10;
        }
    
        if(sum==num){
            System.out.println(num + " is an Armstrong number.");
        }else{
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close(); 
    }       
}

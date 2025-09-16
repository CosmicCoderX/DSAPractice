import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Choice 1 or 2: ");
        int Choice=scan.nextInt();
        if(Choice==1){
            System.out.println("You Entered Choice 1: Area of Circle");
            System.out.println("Provide Radius of Circle: ");
            int R=scan.nextInt();
            System.out.println("Area of Circle is: "+Math.PI*R*R);
        }
        else if(Choice==2){
            System.out.println("You Entered Choice 2: Area of Rectangle");
            System.out.println("Provide Lenght and Width of Rectangle: ");
            int L=scan.nextInt();
            int B=scan.nextInt();
            System.out.println("Area of Rectangle: "+L*B);
        }
        else{
            System.out.println("Invalid Choice Opted");
            
        }
        
        scan.close();
    }
}

import java.util.Scanner;

public class YearChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=input.nextInt();
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
            System.out.println("It's Leap Year");
        }
        else{
            System.out.println("It's not a Leap year");
        }
        input.close();
    }
}

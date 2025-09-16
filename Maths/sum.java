import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();
        System.out.println("table of "+ num +" is: ");
        int i=1;
        while(i<=10){
            int mul= i*num;
            System.out.println(mul);
            i++;
        }
        input.close();
    }
}

import java.util.Scanner;
// Rotate an array by k steps to the right
// Time Complexity: O(n)
public class RotateArray {
    public static void main(String[] args) {
	    int n;
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter array size: ");
	    n=sc.nextInt();
	    int[] num= new int[n];
	    System.out.println("Enter array elements: ");
	    for(int i=0; i<n;i++){
	        num[i]=sc.nextInt();
	    }
		
		System.out.println("Enter steps to rotate: ");
		int k=sc.nextInt();
		int[] temp = new int[num.length];
		for(int i= 0; i<num.length; i++){
		    temp[(i+k)%num.length]=num[i];
		}
		
		num=temp;
		System.out.println("Rotated Array: ");
		for(int i=0; i<num.length;i++){
		    System.out.print(num[i]+" ");
		}
		sc.close();
	}
}

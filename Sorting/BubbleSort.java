import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Sort(arr, n);

    }
    private static void Sort(int[] arr, int n){
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped =false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k] + " ");
        }
    }
}

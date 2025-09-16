public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(isSorted(arr, n));
    }

    public static String isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++){
            if(arr[i] < arr[i-1]){
                return "Not Sorted"; // If current element is less than previous, array is not sorted
            }
        }
        return "Sorted"; // If no elements were out of order, array is sorted
    }
}

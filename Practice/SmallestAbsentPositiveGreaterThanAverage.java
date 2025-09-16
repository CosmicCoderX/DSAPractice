package Practice;
import java.util.*;
public class SmallestAbsentPositiveGreaterThanAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(smallestAbsent(nums, n));
        sc.close();
    }

    public static int smallestAbsent(int[] nums, int n){
        int sum =0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int avg = sum/n;
        int res = avg +1;

        while(true){
            boolean found = true;
            for(int i=0; i<n; i++){
                if(nums[i] == res){
                    found =false;
                    break;
                }
            }
            if(!found){
                return res;
            }
            res++;
        }
    }
}


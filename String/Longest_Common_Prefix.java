package String;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] strs = new String[n];

        for(int i = 0; i < n; i++){
            strs[i] = sc.nextLine();
        }

        System.out.println(LCP(strs));
    }

    public static String LCP(String[] strs){
        //Using Sorting
        Arrays.sort(strs);

        int n = strs.length;
        String first = strs[0];
        String last = strs[n-1];

        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while(i < minLength && first.charAt(i) == last.charAt(i)){
            i++;
        }

        return first.substring(0, i);
    }
}
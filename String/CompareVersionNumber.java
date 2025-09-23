package String;

import  java.util.*;
import java.util.Scanner;

public class CompareVersionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String version1 = sc.next();
        String version2 = sc.next();
        System.out.println(CompareVersion(version1, version2));
        sc.close();
    }
    public static int CompareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");


        int maxLength = Math.max(nums1.length, nums2.length);

        for(int i=0; i<maxLength; i++){

            int v1 = i<nums1.length ? Integer.parseInt(nums1[i]) : 0;
            int v2 = i<nums2.length ? Integer.parseInt(nums2[i]) : 0;

            if(v1 < v2){
                return -1;
            }
            if(v1 > v2){
                return 1;
            }
        }
        return 0;
    }
}

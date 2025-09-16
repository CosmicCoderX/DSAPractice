import java.util.*;
public class UnionOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        System.out.println(findUnion(a, b));
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0; i<a.length; i++){
            if(!res.contains(a[i])){
                res.add(a[i]);
            }
        }
        
        for(int j=0; j<b.length; j++){
            if(!res.contains(b[j])){
                res.add(b[j]);
            }
        }

        return res;
        
    }
}





















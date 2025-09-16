package String;

public class vowelConsonant {
    public static void main(String[] args) {
        checkString("a i u e o t m n s w");
        
    }

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // Your code here
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                v++;
            } else {
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }

}

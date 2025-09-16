package String;


public class Leetcode1935 {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(canBeTypedWords(text, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count =0;
        for(String word: words){
            boolean canType = false;
            for(int i=0; i<brokenLetters.length(); i++){
                String broken = String.valueOf(brokenLetters.charAt(i));
                if(word.contains(broken)){
                    canType = true;
                    break;
                }
            }
            if(canType){
                count++;
            }
        }
        return count;
    }
}

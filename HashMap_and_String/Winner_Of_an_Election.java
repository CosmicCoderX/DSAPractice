package HashMap_and_String;

import java.util.HashMap;
import java.util.Scanner;

public class Winner_Of_an_Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of votes
        sc.nextLine();          // clear buffer

        String votes = sc.nextLine();   // vote string

        System.out.println(Winner(votes));

    }

    public static String Winner(String votes){
        String[] names = votes.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        String winner = "";
        int maxVotes = 0;

        for(String name: names){
            int count = map.getOrDefault(name, 0) + 1;
            map.put(name, count);

            if(count > maxVotes){
                maxVotes = count;
                winner = name;
            }

            if(count == maxVotes && name.compareTo(winner) < 0){
                winner = name;
            }
        }

        return winner;
    }
}

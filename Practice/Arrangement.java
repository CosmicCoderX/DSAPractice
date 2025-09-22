package Practice;

public class Arrangement {
        // rep is not allowed
        static void helper(String s , boolean[] visited, String ans){
            if(ans.length() == s.length()){
                System.out.println(ans);
                return;
            }
            for(int i=0; i <visited.length ;i++){
                if(!visited[i]){
                    visited[i]= true;
                    helper(s, visited, ans+s.charAt(i));
                    visited[i]= false;
                }
            }

            // if(visited[1]==false){
            //     visited[1]= true;
            //     helper(s, visited, ans+s.charAt(1));
            //     visited[1]= false;
            // }
            // if(visited[2]==false){
            //     visited[2]= true;
            //     helper(s, visited, ans+s.charAt(2));
            //     visited[2]= false;
            // }

        }
        public static void main(String[] args) {
            String s= "ABCDEF";
            boolean[] visited = new boolean[s.length()];

            helper(s, visited,"");
        }

}

package Stack;

import java.util.Stack;

public class prefix {

    public static int evaluate(String str) {

        Stack<Integer> val = new Stack<>();

        for(int i = str.length() - 1; i >= 0; i--){

            char ch = str.charAt(i);


            if(Character.isDigit(ch)){
                val.push(ch - '0');
            }
            else{
                int v1 = val.pop();
                int v2 = val.pop();

                if(ch == '+') val.push(v1 + v2);
                else if(ch == '-') val.push(v1 - v2);
                else if(ch == '*') val.push(v1 * v2);
                else if(ch == '/') val.push(v1 / v2);
            }
        }

        return val.peek();
    }

    public static void main(String[] args) {

        String[] Prefix = {
                "+*34-56",
                "-+7*45+20",
                "*+2*34-65",
                "+9*26",
                "-*842",
                "+*23*45"
        };

        for(String exp : Prefix){
            System.out.println(exp + " = " + evaluate(exp));
        }
    }
}
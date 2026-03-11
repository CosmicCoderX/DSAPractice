package Stack;

import java.util.Stack;

public class postfix {
    public static int evaluate(String str){
        Stack<Integer> val = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;

            // If digit → push to value stack
            if(Character.isDigit(ch)){
                val.push(ch - '0');
            } else {
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch == '+') val.push(v1 + v2);
                if(ch == '-') val.push(v1 - v2);
                if(ch == '*') val.push(v1 * v2);
                if(ch == '/') val.push(v1 / v2);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String[] Postfix = {
                "34+",          // simple addition → 3 + 4
                "234*+",        // precedence → 2 + 3*4
                "23+4*",        // parentheses case → (2+3)*4
                "7842-*+",      // nested operations → 7 + 8*(4-2)
                "5386-*2/+"     // complex mixed case → 5 + 3*(8-6)/2
        };

        // Evaluate each expression
        for(String exp : Postfix){
            System.out.println(exp + " = " + evaluate(exp));
        }
    }

}

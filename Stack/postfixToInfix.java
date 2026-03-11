package Stack;

import java.util.*;

public class postfixToInfix {
        public static String evaluate(String str){
            Stack<String> val = new Stack<>();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                // If digit → push to value stack
                if(Character.isDigit(ch)){
                    val.push(ch + "");
                } else {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    String res = "(" + v1 + ch + v2 + ")";
                    val.push(res);

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

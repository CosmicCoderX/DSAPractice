package Stack;

import java.util.Stack;

public class infix {

    // Function to evaluate Stack.infix expression
    public static int evaluate(String str){

        Stack<Integer> val = new Stack<>();   // store numbers
        Stack<Character> op = new Stack<>();  // store operators

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // If digit → push to value stack
            if(ascii >= 48 && ascii <= 57){
                val.push(ascii - 48);
            }

            // If stack empty OR '(' OR top is '('
            else if(op.isEmpty() || ch == '(' || op.peek() == '('){
                op.push(ch);
            }

            // If ')' → solve inside bracket
            else if(ch == ')'){

                while(op.peek() != '('){

                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);

                    op.pop();
                }

                op.pop(); // remove '('
            }

            else{

                // For + or -
                if(ch == '+' || ch == '-'){

                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek() == '+') val.push(v1 + v2);
                    if(op.peek() == '-') val.push(v1 - v2);
                    if(op.peek() == '*') val.push(v1 * v2);
                    if(op.peek() == '/') val.push(v1 / v2);

                    op.pop();
                    op.push(ch);
                }

                // For * or /
                if(ch == '*' || ch == '/'){

                    if(op.peek() == '*' || op.peek() == '/'){

                        int v2 = val.pop();
                        int v1 = val.pop();

                        if(op.peek() == '*') val.push(v1 * v2);
                        if(op.peek() == '/') val.push(v1 / v2);

                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }

        // Final evaluation
        while(val.size() > 1){

            int v2 = val.pop();
            int v1 = val.pop();

            if(op.peek() == '+') val.push(v1 + v2);
            if(op.peek() == '-') val.push(v1 - v2);
            if(op.peek() == '*') val.push(v1 * v2);
            if(op.peek() == '/') val.push(v1 / v2);

            op.pop();
        }

        return val.peek();
    }

    public static void main(String[] args) {

        // Multiple Stack.infix expressions
        String[] expressions = {
                "2+3",
                "2+3*4",
                "(2+3)*4",
                "8/2*3",
                "9-(5+3)*4/6",
                "7+8*(3+2)",
                "(6+2)*(5-3)",
                "9-5+2",
                "8+4/2",
                "3+4*2/(1-5)"
        };

        // Evaluate each expression
        for(String exp : expressions){
            System.out.println(exp + " = " + evaluate(exp));
        }
    }
}
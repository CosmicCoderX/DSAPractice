package Stack;

import java.util.Stack;

public class infixToPrefix {

    // Function to convert Infix expression to Prefix
    public static String conversion(String str){

        Stack<String> val = new Stack<>();      // stack for operands (as strings)
        Stack<Character> op = new Stack<>();    // stack for operators

        // Traverse the infix expression
        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            int ascii = (int) ch;

            // If character is digit → push into operand stack
            if(ascii >= 48 && ascii <= 57){
                String s = "" + ch;   // convert char to string
                val.push(s);
            }

            // If operator stack empty OR '(' OR top operator is '('
            else if(op.isEmpty() || ch == '(' || op.peek() == '('){
                op.push(ch);
            }

            // If ')' → evaluate everything inside brackets
            else if(ch == ')'){

                while(op.peek() != '('){

                    // Pop two operands
                    String v2 = val.pop();
                    String v1 = val.pop();

                    // Pop operator
                    char o = op.pop();

                    // Create prefix expression
                    String t = o + v1 + v2;

                    val.push(t);
                }

                op.pop(); // remove '('
            }

            else{

                // Handling low precedence operators (+ , -)
                if(ch == '+' || ch == '-'){

                    // Perform previous operation first
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();

                    String t = o + v1 + v2;

                    val.push(t);

                    // Push current operator
                    op.push(ch);
                }

                // Handling high precedence operators (* , /)
                if(ch == '*' || ch == '/'){

                    // If same precedence operator exists
                    if(op.peek() == '*' || op.peek() == '/'){

                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();

                        String t = o + v1 + v2;

                        val.push(t);

                        op.push(ch);
                    }

                    // Otherwise simply push operator
                    else op.push(ch);
                }
            }
        }

        // Final evaluation after traversal
        while(val.size() > 1){

            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();

            String t = o + v1 + v2;

            val.push(t);
        }

        // Final prefix expression
        return val.peek();
    }

    public static void main(String[] args) {

        // Different infix expressions to test algorithm
        String[] Infix = {

                "3+4",              // simple addition
                "5+6*7",            // precedence test
                "(2+3)*4",          // parentheses priority
                "8/4+2",            // division before addition
                "9-(3+2)*5",        // bracket with multiplication
                "7+8*(4-2)",        // nested operation
                "(6+3)*(2+1)",      // two parentheses groups
                "9-4+3",            // left to right evaluation
                "8+6/3",            // division precedence
                "5+3*(8-6)/2"       // mixed operations
        };

        System.out.println("Infix  ===>  Prefix\n");

        // Convert each infix expression
        for(String exp : Infix){
            System.out.println(exp + "  =  " + conversion(exp));
        }
    }
}
package Stack;

import java.util.Stack;

public class prefixToPostfix {
    public static String conversion(String str){
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch + "");
            } else{
                String v1 = val.pop();
                String v2 = val.pop();
                String res = v1 + v2 + ch;
                val.push(res);
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
            System.out.println(exp + " = " + conversion(exp));
        }
    }
}

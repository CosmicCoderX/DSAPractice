package Stack;

import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Stack 01: "+st);

        //reverse
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
            //int x = st.peek();
            //rt.push(x);
            //st.pop();
            rt.push(st.pop());
        }
        System.out.println("Stack 02: "+rt+" Stack 01: "+st);

        Stack<Integer> gt = new Stack<>();
        while(rt.size() > 0){
            gt.push(rt.pop());
        }
        System.out.println("Stack 03: "+gt+" Stack 02: "+rt+" Stack 01: "+st);

    }
}

package Stack;

import java.util.Stack;

public class insertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("A: "+st);

        Stack<Integer> rt = new Stack<>();
        //for at bottom insertion pure elements rt mein insert kardo
        //but for insertion at any index
        int index = 2;
        int value = 27;
        while(st.size() > index){
            rt.push(st.pop());
        }

        st.push(value);
        System.out.println("A: "+st);
        System.out.println("B: "+rt);

        while(rt.size() > 0){
            st.push(rt.pop());
        }
        System.out.println("A: "+st);

    }
}

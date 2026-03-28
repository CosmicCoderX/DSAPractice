package Stack;

import java.util.Stack;

public class deleteMiddleElement {

    // ================================
    // 🔹 APPROACH 1: RECURSION
    // ================================
    public static void deleteMidRec(Stack<Integer> st, int k){
        if(st.isEmpty()) return;

        if(k == 0){
            st.pop();
            return;
        }

        int top = st.pop();
        deleteMidRec(st, k-1);
        st.push(top);
    }


    // ================================
    // 🔹 APPROACH 2: AUXILIARY STACK
    // ================================

//    public static void deleteMidAux(Stack<Integer> st, int k){
//        Stack<Integer> temp = new Stack<>();
//
//        // Move elements until middle
//        for(int i = 0; i < k; i++){
//            temp.push(st.pop());
//        }
//
//        // Remove middle element
//        st.pop();
//
//        // Restore elements
//        while(!temp.isEmpty()){
//            st.push(temp.pop());
//        }
//    }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        int mid = st.size()/2;

        // 👉 Recursion
        deleteMidRec(st, mid);

        // 👉 Auxiliary Stack
//         deleteMidAux(st, mid);

        // Print result
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
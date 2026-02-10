package Stack;

import java.util.Stack;

public class BasicsOfStack {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>();
        //Stack Initialization->
        Stack<Integer> st = new Stack<>();
        System.out.println("Size is: "+st.size());
        System.out.println(st);

//        PUSH->
        st.push(1);
        System.out.println("Size is: "+st.size());
        System.out.println(st);

        System.out.println(st.isEmpty());

        st.push(30);
        System.out.println("Size is: "+st.size());
        System.out.println(st);

        st.push(56);
        System.out.println("Size is: "+st.size());
        System.out.println(st);

        st.push(90);
        System.out.println("Size is: "+st.size());
        System.out.println(st);

        st.push(5);
        System.out.println("Size is: "+st.size());
        System.out.println(st);

        st.push(24);
        System.out.println("Size is: "+st.size());
        System.out.println(st);

//        PEEK->
        System.out.println(st.peek());

//        POP->
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println("Size is: "+st.size());

//        Iterate to first element->
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}

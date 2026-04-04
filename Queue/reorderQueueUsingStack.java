package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Original Queue: "+q);

        // q = 1 2 3 4 5 6 7 8
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }
        // st = 4 3 2 1
        // q = 5 6 7 8
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        // st = empty
        // q = 5 6 7 8 4 3 2 1
        for(int i=0; i<n/2; i++){
            st.push(q.remove());
        }
        // st = 8 7 6 5
        // q = 4 3 2 1

        while(!st.isEmpty()){
            // one by one pehle stack se phir queue se
            q.add(st.pop());
            q.add(q.remove());
        }
        // st = empty
        // q = 8 4 7 3 6 2 5 1

        for(int i=0; i<n; i++){
            st.push(q.remove());
        }
        // q = empty
        // st = 1 5 2 6 3 7 4 8

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        // st = empty
        // q = 1 5 2 6 3 7 4 8

        System.out.println("Interleafed Queue: "+q);
    }
}

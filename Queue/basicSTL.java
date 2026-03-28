package Queue;

import java.util.*;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Empty: "+q.isEmpty());
        q.add(1);
        System.out.println("Empty: "+q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println("Size: "+q.size());
        q.remove();
        System.out.println(q);
        System.out.println("Size: "+q.size());
        q.poll();
        System.out.println(q);
        System.out.println("Size: "+q.size());
        System.out.println("Top Element: "+q.peek());
    }
}

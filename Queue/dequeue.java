package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst();
//        System.out.println(dq);
//        System.out.println("First Element: "+dq.getFirst() +"\nLast Element: "+ dq.getLast());
        dq.addLast(1);
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.add(5); //Last add
        dq.remove(); //first remove
//        dq.removeAll(dq); //remove all elements
        System.out.println(dq);
        dq.removeFirstOccurrence(1);
        System.out.println(dq);
        dq.removeLastOccurrence(1);
        System.out.println(dq);
    }
}

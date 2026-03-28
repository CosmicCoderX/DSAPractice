package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class displayQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> help = new LinkedList<>();
        System.out.println("Display ->");
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            help.add(q.poll());
        }

        System.out.print("\nHelper Queue: "+help);
        while(!help.isEmpty()){
            q.add(help.poll());
        }
        System.out.print("\nHelper Queue: "+help);
        System.out.print("\nOriginal Queue: "+q);
    }
}

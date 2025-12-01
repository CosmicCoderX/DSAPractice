package LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoSumDLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Node temp = head;
        Node h = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = temp;
        while(h.val < t.val){
            if(h.val+t.val == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(h.val);
                pair.add(t.val);
                res.add(pair);

                h = h.next;
                t = t.prev;

            }else if(h.val+t.val > target){
                t = t.prev;
            }else{
                h = h.next;
            }
        }
        return res;
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(8);
        Node g = new Node(9);
        //1 <-> 2 <-> 4 <-> 5 <-> 6 <-> 8 <-> 9
        //a <-> b <-> c <-> d <-> e <-> f <-> g

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = null;

        display(a);

        System.out.println("Enter the Target sum: ");
        int target = sc.nextInt();
        ArrayList<ArrayList<Integer>> ans = findPairsWithGivenSum(a,target);

        for (ArrayList<Integer> pair : ans) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }

    }
}

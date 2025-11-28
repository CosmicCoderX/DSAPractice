package LinkedList;

public class OddEven_Nodes {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void sepOfOddEven(Node head){
        Node temp = head;
        Node o = new Node(-1);
        Node tempo = o;
        Node e = new Node(0);
        Node tempe = e;
        while(temp!=null){
            Node nextNode = temp.next;
            temp.next = null;
            if(temp.val % 2 == 0){
                tempe.next = temp;
                tempe = temp;
            }else{
                tempo.next = temp;
                tempo = temp;
            }
            temp = nextNode;
        }
        tempe = e.next;
        tempo.next = tempe;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);
        // 3 -> 5 -> 4 -> 1 -> 2 -> 8 -> 10 -> 13
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        display(a);
        sepOfOddEven(a);
        display(a);

    }
}

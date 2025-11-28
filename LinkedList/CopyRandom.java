package LinkedList;

public class CopyRandom {
    public static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        //Creating a deep copy(duplicate)
        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;
        while(temp1 != null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        temp2 = head2.next;
        temp1 = head;


        //Creating Alternate connections b/w original and deep copy
        Node head3 = new Node(-1);
        Node temp = head3;
        while(temp1 != null && temp2 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        temp2 = head2.next;
        temp1 = head;

        //Assigning random pointers
        while(temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
            if(temp1 != null) temp2 = temp1.next;
        }
        temp2 = head2.next;
        temp1 = head;

        //Separating the list
        while(temp1 != null){
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1 == null) break;

            temp2.next = temp1.next;
            if(temp2.next == null) break;
            temp2 = temp2.next;
        }
        return head2.next;
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        // 7 -> 13 -> 11 -> 10 -> 1
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a.random = null;
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;

        display(a);
        copyRandomList(a);
        display(a);

    }
}

package LinkedList;

public class PalindromeDLL {
    public static class Node{
        char val;
        Node next;
        Node prev;
        Node(char val){
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

    public static boolean isPalindrome(Node head){
        if(head == null) return true;
        Node h = head;
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        while(h != t){
            if(h.val != t.val) return false;
            h = h.next;
            t = t.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node('L');
        Node b = new Node('E');
        Node c = new Node('V');
        Node d = new Node('E');
        Node e = new Node('L');
        // L <-> E <-> V <-> E <-> L
        // a     b     c     d     e

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        if(isPalindrome(a)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}

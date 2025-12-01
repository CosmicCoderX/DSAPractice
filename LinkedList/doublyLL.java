package LinkedList;

public class doublyLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static void insertAtTail(Node head, int x){
        Node temp = head;
        //temp ko tail tak leke jaate hai
        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }

    public static void insertAtIdx(Node head,int idx, int x){
        Node s = head;
        for(int i=1; i<=idx-1; i++){
            s = s.next;
        }
        //s is at idx-1 position
        Node r = s.next; //r is at idx
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }


    public static void display(Node head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void displayRev(Node tail){
        while(tail != null){
            System.out.print(tail.val+" ");
            tail = tail.prev;
        }
        System.out.println();
    }

    public static Node deleteAtHead(Node head){
        if(head == null) return null;
        head = head.next;
        if(head != null){
            head.prev = null;
        }
        return head;
    }

    public static Node deleteAtTail(Node head){
        if(head == null || head.next == null){
            return deleteAtHead(head);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        return head;
    }

    public static Node deleteAtIdx(Node head, int idx){
        if(head == null) return null;

        // delete head
        if(idx == 1){
            return deleteAtHead(head);
        }

        // find length to know if idx = last
        int len = 0;
        Node t = head;
        while(t != null){
            len++;
            t = t.next;
        }

        // delete tail
        if(idx == len){
            return deleteAtTail(head);
        }

        // delete middle
        Node temp = head;
        for(int i = 1; i <= idx - 2; i++){   // FIXED
            temp = temp.next;
        }

        Node toDelete = temp.next;           // node at idx
        temp.next = toDelete.next;
        toDelete.next.prev = temp;

        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(13);
        Node c = new Node(11);
        Node d = new Node(10);
        Node e = new Node(1);

        // 7 <-> 13 <-> 11 <-> 10 <-> 1
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
//        displayRev(e);

//        Node newHead = insertAtHead(a,30);
//        display(newHead);
//        insertAtTail(a, 90);
//        insertAtIdx(a,2,56);
//        Node newHead = deleteAtHead(a);
//        deleteAtTail(a);
//        deleteAtIdx(a,4);
        Node newHead = deleteAtIdx(a, 5);
        display(newHead);
    }
}


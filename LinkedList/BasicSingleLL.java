package LinkedList;

public class BasicSingleLL {
    public static  class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void displayr(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }

    public static void displayrRev(Node head){
        if(head == null) return;
        displayrRev(head.next);
        System.out.print(head.data+" ");
    }

    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        t.next = temp;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(100);
        // 5 -> 3 -> 9 -> 8 -> 16 -> 100
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        //Displaying Linked List
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);
        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayrRev(a);
        System.out.println();
        System.out.println(length(a));
        insertAtEnd(a,87);
        display(a);





    }
}

package LinkedList;

public class circularLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head; // class-level head

    public void insertAtHead(int x) {
        Node t = new Node(x);

        if (head == null) {
            head = t;
            t.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        t.next = head;
        temp.next = t;
        head = t;
    }

    public void insertAtEnd(int x) {
        Node t = new Node(x);

        if (head == null) {
            head = t;
            t.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = t;
        t.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public void deleteAtHead() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }

        Node prev = null, curr = head;

        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = head;
    }

    // ------------------- MAIN METHOD ---------------------

    public static void main(String[] args) {
        circularLL cll = new circularLL();

        // Insert at head
        cll.insertAtHead(30);
        cll.insertAtHead(20);
        cll.insertAtHead(10);

        System.out.print("After insertAtHead: ");
        cll.display();

        // Insert at end
        cll.insertAtEnd(40);
        cll.insertAtEnd(50);

        System.out.print("After insertAtEnd: ");
        cll.display();

        // Delete at head
        cll.deleteAtHead();
        System.out.print("After deleteAtHead: ");
        cll.display();

        // Delete at end
        cll.deleteAtEnd();
        System.out.print("After deleteAtEnd: ");
        cll.display();
    }
}

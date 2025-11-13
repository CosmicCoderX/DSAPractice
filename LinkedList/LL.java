package LinkedList;

public class LL {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0; // ✅ using variable 'size' to store length of linked list

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++; // increase size after each insertion
        }

        void insertAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++; // increase size after each insertion
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            // ✅ if index equals size, insert at end
            if (idx == size) {
                insertAtEnd(val);
                return;
            }

            // ✅ if inserting at start
            if (idx == 0) {
                insertAtStart(val);
                return;
            }

            // ✅ invalid index condition
            if (idx < 0 || idx > size) {
                System.out.println("Wrong index entered!");
                return;
            }

            // ✅ traverse to (idx-1)th node
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            // ✅ insert new node
            t.next = temp.next;
            temp.next = t;
            size++; // increase size
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int getAt(int idx) {
            Node temp = head;

            // ✅ index validation
            if (idx < 0 || idx >= size) {
                System.out.println("Wrong index entered!");
                return -1;
            }

            // ✅ traverse till required index
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }

            return temp.val; // return value at that index
        }

//        void displayR(Node head){
//            if(head == null) return;
//            System.out.print(head.val+" ");
//            displayR(head.next);
//        }
//
//        void displayReverse(Node head){
//            if(head == null) return;
//            displayReverse(head.next);
//            System.out.print(head.val+" ");
//        }

        // we can simply use size keywords as using size() function it gives time complexity -> O(N)
//        int size(){
//            Node temp = head;
//            int count = 0;
//            while(temp!=null){
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }

        void deleteAt(int idx){
            if(idx == 0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(4);   // 4
        ll.insertAtEnd(10);  // 4 -> 10
        ll.insertAtEnd(3);   // 4 -> 10 -> 3
        ll.display();

        ll.insertAtStart(9); // 9 -> 4 -> 10 -> 3
        ll.display();

//        System.out.println(ll.size()); // 4
        ll.insertAt(2, 13);  // 9 -> 4 -> 13 -> 10 -> 3
//        ll.displayR(ll.head);
//        System.out.println();
//        ll.displayReverse(ll.head);

        ll.insertAt(2, 100); // 9 -> 4 -> 100 -> 13 -> 10 -> 3
        ll.display();

        System.out.println("Value at index 5: " + ll.getAt(5));
        System.out.println("Size of Linked List: " + ll.size);
        ll.deleteAt(0);
        ll.display();
//        System.out.println(ll.tail.val);
    }
}

package Stack;

public class LLImplementation {
    // ✅ Node -> User defined data type
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // ✅ Stack using Linked List
    public static class LLStack {

        private Node head = null; // top of stack
        private int size = 0;     // to track size

        // ✅ Push operation (O(1))
        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
            System.out.println(x + " pushed into stack");
        }

        // ✅ Pop operation (O(1))
        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty! Cannot pop.");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;  // ⭐ IMPORTANT FIX
            return x;
        }

        // ✅ Peek operation (O(1))
        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty! Cannot peek.");
                return -1;
            }
            return head.val;
        }

        // ✅ Display from bottom to top (using recursion)
        void displayRec(Node h) {
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }
            System.out.print("Stack (bottom -> top): ");
            displayRec(head);
            System.out.println();
        }

        // ✅ Display from top to bottom (normal order)
        void displayReverse() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }

            Node temp = head;
            System.out.print("Stack (top -> bottom): ");
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // ✅ Return size
        int size() {
            return size;
        }

        // ✅ Check if empty
        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        LLStack st = new LLStack();

        // ✅ Check if stack is empty
        System.out.println("Is stack empty? " + st.isEmpty());

        // ✅ Push elements
        st.push(4);
        st.push(3);
        st.push(5);

        // ✅ Display stack (bottom -> top)
        st.display();

        // ✅ Check size
        System.out.println("Size of stack: " + st.size());

        // ✅ Peek top element
        System.out.println("Top element: " + st.peek());

        // ✅ Pop element
        System.out.println("Popped element: " + st.pop());

        // ✅ Display after pop
        st.display();

        // ✅ Push more elements
        st.push(9);
        st.push(1);
        st.push(0);

        // ✅ Display again
        st.display();

        // ✅ Display reverse (top -> bottom)
        st.displayReverse();

        // ✅ Pop all elements
        while (!st.isEmpty()) {
            System.out.println("Popped: " + st.pop());
        }

        // ✅ Final check
        System.out.println("Is stack empty now? " + st.isEmpty());
    }


}

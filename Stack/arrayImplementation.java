package Stack;

public class arrayImplementation {
    // ✅ Stack using Array
    public static class Stack {

        private int[] arr;     // Array to store elements
        private int idx;       // Points to next insertion index

        // ✅ Constructor to set capacity
        Stack(int capacity) {
            arr = new int[capacity];
            idx = 0;
        }

        // ✅ Push operation (O(1))
        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is Full! Cannot push " + x);
                return;
            }
            arr[idx] = x;
            idx++;
            System.out.println(x + " pushed into stack");
        }

        // ✅ Pop operation (O(1))
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty! Cannot pop.");
                return -1;
            }
            idx--;
            int popped = arr[idx];
            arr[idx] = 0; // Optional (just for clarity)
            return popped;
        }

        // ✅ Peek operation (O(1))
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty! Cannot peek.");
                return -1;
            }
            return arr[idx - 1];
        }

        // ✅ Display stack (bottom -> top)
        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }

            System.out.print("Stack (bottom -> top): ");
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // ✅ Return size
        int size() {
            return idx;
        }

        // ✅ Check if stack is empty
        boolean isEmpty() {
            return idx == 0;
        }

        // ✅ Check if stack is full
        boolean isFull() {
            return idx == arr.length;
        }

        // ✅ Return capacity
        int capacity() {
            return arr.length;
        }
    }

    public static void main(String[] args) {

        // ✅ Create stack of capacity 5
        Stack st = new Stack(5);

        // ✅ Check if empty
        System.out.println("Is stack empty? " + st.isEmpty());

        // ✅ Push elements
        st.push(4);
        st.push(3);
        st.push(5);

        // ✅ Display stack
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
        st.push(0);  // This should fill the stack

        // ✅ Try pushing when full
        st.push(53); // Should show overflow message

        // ✅ Display final stack
        st.display();

        // ✅ Pop all elements
        while (!st.isEmpty()) {
            System.out.println("Popped: " + st.pop());
        }

        // ✅ Final check
        System.out.println("Is stack empty now? " + st.isEmpty());
    }

}

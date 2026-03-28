package Queue;

public class ArrayImplementOfCircularQueue {
    public static class CircularQueue {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is Full!");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else { // wrap
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                int val = arr[front];
                if (front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            }

            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int j = front; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                for (int k = 0; k <= rear; k++) {
                    System.out.print(arr[k] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue();

        System.out.println("==== Test 1: Empty Queue ====");
        cq.display();
        System.out.println("Is Empty: " + cq.isEmpty());

        System.out.println("\n==== Test 2: Add Elements ====");
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.display();

        System.out.println("\n==== Test 3: Peek ====");
        System.out.println("Front Element: " + cq.peek());

        System.out.println("\n==== Test 4: Remove Elements ====");
        System.out.println("Removed: " + cq.remove());
        System.out.println("Removed: " + cq.remove());
        cq.display();

        System.out.println("\n==== Test 5: Wrap Around Case ====");
        cq.add(40);
        cq.add(50);
        cq.add(60); // wrap happens
        cq.display();

        System.out.println("\n==== Test 6: Fill Queue Completely ====");
        cq.add(70);
        cq.display();

        System.out.println("\n==== Test 7: Remove All ====");
        while (!cq.isEmpty()) {
            System.out.println("Removed: " + cq.remove());
        }
        cq.display();

        // ⚠️ Below tests will CRASH intentionally

        System.out.println("\n==== Test 8: Remove from Empty ====");
        cq.remove(); // will throw exception

        System.out.println("\n==== Test 9: Peek on Empty ====");
        cq.peek(); // will throw exception

        System.out.println("\n==== Test 10: Add to Full ====");
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6); // will throw exception
    }
}
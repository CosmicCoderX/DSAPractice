package Trees;

public class diameterOfTree {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    // Height in terms of edges
    public static int height(Node root) {
        if (root == null) return -1; // important for edge-based height
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int diameter(Node root) {
        if (root == null) return 0;

        int leftAns = diameter(root.left);
        int rightAns = diameter(root.right);

        int mid = height(root.left) + height(root.right) + 2;

        return Math.max(mid, Math.max(leftAns, rightAns)); // ✅ FIXED
    }

    public static void main(String[] args) {
        // TEST CASE 1: Perfect Binary Tree
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        System.out.println("Diameter (Perfect Tree): " + diameter(root1));
        // Expected: 4 (4→2→1→3→7)

        // TEST CASE 2: Skewed Tree (Left)
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.left.left = new Node(3);
        root2.left.left.left = new Node(4);

        System.out.println("Diameter (Left Skewed): " + diameter(root2));
        // Expected: 3

        // TEST CASE 3: Single Node
        Node root3 = new Node(1);

        System.out.println("Diameter (Single Node): " + diameter(root3));
        // Expected: 0

        // TEST CASE 4: Line (Right Skewed)
        Node root4 = new Node(1);
        root4.right = new Node(2);
        root4.right.right = new Node(3);
        root4.right.right.right = new Node(4);

        System.out.println("Diameter (Right Skewed): " + diameter(root4));
        // Expected: 3

        // TEST CASE 5: Mixed Tree
        Node root5 = new Node(1);
        root5.left = new Node(2);
        root5.right = new Node(3);
        root5.left.left = new Node(4);
        root5.left.left.left = new Node(5);

        System.out.println("Diameter (Mixed Tree): " + diameter(root5));
        // Expected: 4
    }
}
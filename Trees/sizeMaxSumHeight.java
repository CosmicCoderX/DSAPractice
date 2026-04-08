package Trees;

public class sizeMaxSumHeight {
    public static  class Node{
        int val; //0
        Node left; //NULL
        Node right; //NULL
        public Node(int val) {
            this.val = val;
        }
    }
    public static int EdgeWiseHeight(Node root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(EdgeWiseHeight(root.left), EdgeWiseHeight(root.right));
    }
    public static int NodeWiseHeight(Node root){
        if(root == null) return 0;
        return 1 + Math.max(NodeWiseHeight(root.left), NodeWiseHeight(root.right));
    }
    public static int maxOfNodes(Node root){
        if(root == null) return Integer.MIN_VALUE; //yaha 0 nahi lenge varna jab -ve value hongi toh ans. 0 aayega i.e change it to INT_MIN
        int a = root.val;
        int b = maxOfNodes(root.left);
        int c = maxOfNodes(root.right);
        return Math.max(a, Math.max(b, c));
    }
    public static int minOfNodes(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minOfNodes(root.left);
        int c = minOfNodes(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        System.out.println("Height Edge-wise: "+EdgeWiseHeight(root));
        System.out.println("Maximum Depth(Node-wise Height): "+NodeWiseHeight(root));
        System.out.println("Node with Maximum value: "+maxOfNodes(root));
        System.out.println("Node with Minimum value: "+minOfNodes(root));
        System.out.println("Sum of Nodes: "+sum(root));
        System.out.println("Size of Tree: "+size(root));
        System.out.println("Product of Nodes: "+product(root));
    }
}

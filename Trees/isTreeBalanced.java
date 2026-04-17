package Trees;
import com.sun.source.tree.Tree;

import java.util.*;

public class isTreeBalanced {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    public static int height(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static boolean isBalanced(TreeNode root){
        if(root == null) return true;
        int lh = height(root.left);
        if(root.left != null) lh++;
        int rh = height(root.right);
        if(root.right != null) rh++;
        int diff = Math.abs(lh- rh);
        if(diff > 1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
    public static void main(String[] args) {

        // TEST-01: sample tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        System.out.println("Test-01(Normal Balaned Tree): "+isBalanced(root1)); // true

        // TEST-02: sample tree
        //        1
        //       /
        //      2
        //     /
        //    3
        //   /
        //  4

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);

        System.out.println("Test-02(Left Skewed Tree): "+isBalanced(root2)); // false

        // TEST-03: sample tree
        //        1
        //       / \
        //      2   3
        //     /
        //    4

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);

        System.out.println("Test-03(It looks Unbalanced but not): "+isBalanced(root3)); // true

    }
}

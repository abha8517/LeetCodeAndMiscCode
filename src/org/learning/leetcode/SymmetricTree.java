package org.learning.leetcode;

import java.util.Stack;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode root) {
        //return isSymmetricIntermediary(root, root);
        Stack<TreeNode> aStack = new Stack<>();
        if (root.left != null) {
            if (root.right == null) return false;
            aStack.push(root.right);
            aStack.push(root.left);
        } else if (root.left == null && root.right != null) return false;
        TreeNode left, right;
        while (!aStack.isEmpty()) {
            left = aStack.pop();
            right = aStack.pop();
            if (left.val != right.val) return false;
            if (left.left != null) {
                if (right.right == null) return false;
                aStack.push(right.right);
                aStack.push(left.left);
            } else if (left.left == null && right.right != null) return false;
            if (left.right != null) {
                if (right.left == null) return false;
                aStack.push(left.right);
                aStack.push(right.left);
            } else if (left.right == null && right.left != null) return false;
        }
        return true;
    }

    private static boolean isSymmetricIntermediary(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;
        return isSymmetricIntermediary(left.left, right.right) && isSymmetricIntermediary(left.right, right.left);
    }
}

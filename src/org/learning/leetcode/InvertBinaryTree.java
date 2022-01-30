package org.learning.leetcode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));
        TreeNode invertedRoot = invertTree(root);
    }

    private static TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if (root == null || root.left == null && root.right == null) {
            return root;
        }
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            invertTree(root.left);
        }
        if (root.right != null){
            invertTree(root.right);
        }
        return root;
    }
}

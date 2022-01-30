package org.learning.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static List<Integer> aList = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> traversedTree = inorderTraversal(root);
        traversedTree.forEach(System.out::println);
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return Collections.emptyList();
        Stack<TreeNode> aStack = new Stack<>();
//        aStack.push(root);
        TreeNode current = root;
        while (!aStack.isEmpty() || current!=null){
            while (current!=null) {
                aStack.push(current);
                current = current.left;
            }
            current = aStack.pop();
            aList.add(current.val);
            current = current.right;
        }
        /*inorderTraversal(root.left);
        aList.add(root.val);
        inorderTraversal(root.right);*/
        return aList;
    }
}
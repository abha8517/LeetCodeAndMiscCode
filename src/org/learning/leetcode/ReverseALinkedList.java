package org.learning.leetcode;

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode root = new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(9))));
        ListNode reversedList = reverseList(root);
        printList(reversedList);
        System.out.println();
        String a = Integer.toBinaryString(5);
        int b = Integer.valueOf(Integer.toBinaryString(5));
        int c = ~5 & Integer.highestOneBit(5)-1;
        System.out.println("a="+a+"  b="+b+"   c="+c);
    }

    private static ListNode reverseList(ListNode root) {
        ListNode temp;
        ListNode current = root;
        ListNode previous = null;
        while(current!=null) {
            temp = current;
            current = current.next;
            temp.next = previous;
            previous = temp;
        }
        return previous;
    }

    private static void printList(ListNode root) {
        while(root!=null){
            System.out.print(root.val+" ");
            root = root.next;
        }
    }
}

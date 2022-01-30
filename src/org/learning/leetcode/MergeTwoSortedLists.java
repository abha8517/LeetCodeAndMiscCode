package org.learning.leetcode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        printLinkedList(list1);
        printLinkedList(list2);
        printLinkedList(mergeTwoLists(list1,list2));
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode finalPointer = head;
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        while (pointer1!=null || pointer2!=null) {
            if (pointer1 == null){
                finalPointer.next = pointer2;
                pointer2 = null;
            } else if (pointer2 == null) {
                finalPointer.next = pointer1;
                pointer1 = null;
            } else {
                if (pointer1.val<pointer2.val){
                    finalPointer.next = new ListNode(pointer1.val);
                    pointer1 = pointer1.next;
                } else {
                    finalPointer.next = new ListNode(pointer2.val);
                    pointer2 = pointer2.next;
                }
                finalPointer = finalPointer.next;
            }
        }
        return head.next;
    }

    private static void printLinkedList(ListNode l1) {
        while (l1 != null) {
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
        System.out.println();
    }
}

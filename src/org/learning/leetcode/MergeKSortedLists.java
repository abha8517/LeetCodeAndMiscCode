package org.learning.leetcode;

public class MergeKSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {list1, list2, list3};
        ListNode node = mergeKLists(lists);
        printLinkedList(node);
    }

    private static ListNode mergeKLists(ListNode[] lists) {
        /*if (lists.length == 0 || lists[0] == null)
            return null;
        ListNode res = null;
        for (ListNode node:lists) {
            res = mergeTwoLists(res,node);
        }
        return res;*/
        if (lists.length == 0)
            return null;
        return mergeMultipleLists(lists, 0, lists.length - 1);
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        ListNode head = new ListNode();
        ListNode finalPointer = head;
        ListNode pointer1 = list1;
        ListNode pointer2 = list2;
        while (pointer1 != null || pointer2 != null) {
            if (pointer1 == null) {
                finalPointer.next = pointer2;
                pointer2 = null;
            } else if (pointer2 == null) {
                finalPointer.next = pointer1;
                pointer1 = null;
            } else {
                if (pointer1.val < pointer2.val) {
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

    private static ListNode mergeMultipleLists(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];
        int mid = start + ((end - start) / 2);
        ListNode finalList1 = mergeMultipleLists(lists, start, mid);
        ListNode finalList2 = mergeMultipleLists(lists, mid + 1, end);
        return mergeTwoLists(finalList1, finalList2);
    }

    private static void printLinkedList(ListNode l1) {
        while (l1 != null) {
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
        System.out.println();
    }
}

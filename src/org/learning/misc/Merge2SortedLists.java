package org.learning.misc;


public class Merge2SortedLists {
    public static void main(String[] args) {
        Node head1 = new Node(4, new Node(7, new Node(9)));
        Node head2 = new Node(1, new Node(3, new Node(6)));
        printLinkedList(head1);
        printLinkedList(head2);
        Node finalHead = mergeTwoLists(head1, head2);
        printLinkedList(finalHead);
    }

    private static Node mergeTwoLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
//        Node finalTemp = new Node(0);
        Node head = new Node(0);
        Node finalTemp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                finalTemp.next = new Node(temp1.val);
                temp1 = temp1.next;
            } else {
                finalTemp.next = new Node(temp2.val);
                temp2 = temp2.next;
            }
            finalTemp = finalTemp.next;
        }
        if (temp1 != null)
            finalTemp.next = temp1;
        if (temp2 != null)
            finalTemp.next = temp2;
        return head.next;
    }

    private static void printLinkedList(Node l1) {
        while (l1 != null) {
            System.out.print(l1.val + " ");
            l1 = l1.next;
        }
        System.out.println();
    }
}

package com.company;

public class LeetCodeQuestionsOnLinkedList {
    ListNode head;

    public void insert(int val) {
        ListNode node = new ListNode(val);

        node.next = head;
        head = node;
    }

    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Questions
    // 1. https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;

        if (node == null) {
            return head; // here, the IDE suggests to return null instead of head, but in leetcode, it is expected to return the empty list and not null
        }

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}

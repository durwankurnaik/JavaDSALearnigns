// https://leetcode.com/problems/intersection-of-two-linked-lists

package com.leetcodePractice;

import java.util.*;

public class LinkedListIntersection {
    public static void main(String[] args) {
        
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA, nodeB = headB;
        int lengthA = 0, lengthB = 0;

        // first finding the length of both the linked lists
        while (nodeA != null || nodeB != null) {
            if (nodeA != null) {
                nodeA = nodeA.next;
                lengthA++;
            }
            if (nodeB != null) {
                nodeB = nodeB.next;
                lengthB++;
            }
        }
        int minLen = Math.min(lengthA, lengthB);

        // now skipping the extra node from the comparison
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - minLen; i++) {
                headA = headA.next;
            }
        } else if (lengthB > lengthA) {
            for (int i = 0; i < lengthB - minLen; i++) {
                headB = headB.next;
            }
        }

        int pointer = 0;
        while (pointer < minLen) {
            if (headA == headB) {
                return headA;
            }
            pointer++;
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

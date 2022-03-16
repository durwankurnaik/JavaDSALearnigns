package com.company;

import java.util.Objects;

public class LeetcodePracticeQS {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        int prev_carry = 0, curr_carry = 0, sum = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;

            if (sum == 10) {
                curr_carry = 1;
            }
            else if (sum > 10) {
                curr_carry = sum % 10;
            }

            if (ans == null) {
                if (prev_carry != 0) {
                    ans.val = sum + prev_carry;
                } else {
                    ans.val = sum;
                }
            } else {
                if (prev_carry != 0) {
                    ans.next = new ListNode(sum + prev_carry);
                } else {
                    ans.next = new ListNode(sum);
                }
            }

            prev_carry = curr_carry;
            curr_carry = 0;
        }
        return ans;
    }

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode prev = null, curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    // https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
    public static int getDecimalValue(ListNode head) {
        long ans = 0;
        while (head != null) {
            ans = (ans * 10) + head.val;
            head = head.next;
        }
        return Integer.parseInt(Long.toString(ans), 2);
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

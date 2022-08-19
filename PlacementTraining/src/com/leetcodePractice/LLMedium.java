package com.leetcodePractice;

import java.util.LinkedList;

public class LLMedium {
    public static void main(String[] args) {
        CustomLL l1 = new CustomLL();
        CustomLL l2 = new CustomLL();
        CustomLL l3 = new CustomLL();

        l1.val = 2;
        l2.val = 4;
        l3.val = 3;
        l1.next = l2;
        l2.next = l3;

        CustomLL al1 = new CustomLL();
        CustomLL al2 = new CustomLL();
        CustomLL al3 = new CustomLL();

        al1.val = 5;
        al2.val = 6;
        al3.val = 4;
        al1.next = al2;
        al2.next = al3;

        System.out.println(l1);
        System.out.println(al1);

        System.out.println(addTwoNums(l1, al1));
    }

    public static CustomLL addTwoNums(CustomLL l1, CustomLL l2) {
        CustomLL temp = new CustomLL();
        CustomLL head = temp;

        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 == null || l2 == null) {
                return head;
            }

            int currSum = carry + l1.val + l2.val;

            temp.val = currSum % 10;
            carry = currSum / 10;
            temp.next = new CustomLL();
            temp = temp.next;

            l1 = l1.next;
            l2 = l2.next;
        }


        return head;
    }
}

class CustomLL {
    int val;
    CustomLL next;

    public CustomLL() {
        this.val = 0;
        this.next = null;
    }

    @Override
    public String toString() {
        return "" + val + " -> " + next;
    }
}

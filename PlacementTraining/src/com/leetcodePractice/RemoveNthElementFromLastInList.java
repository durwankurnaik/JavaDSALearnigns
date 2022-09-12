package com.leetcodePractice;

public class RemoveNthElementFromLastInList {
    public static void main(String[] args) {
        NodeList list = new NodeList(1);

        list.next = new NodeList(2);
        list.next.next = new NodeList(3);
        list.next.next.next = new NodeList(4);
        list.next.next.next.next = new NodeList(5);

        System.out.println(list);

        System.out.println(removeNthFromLast(2, list));
    }

    public static NodeList removeNthFromLast(int n, NodeList head) {
        int size = 0;
        NodeList temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (size == n) {
            return head.next;
        }

        NodeList prev = null;
        NodeList curr = head;

        for (int i = 0; i < size - n; i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;

        return head;
    }
}

class NodeList {
    int val = 0;
    NodeList next = null;

    NodeList(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val + " -> " + next;
    }
}

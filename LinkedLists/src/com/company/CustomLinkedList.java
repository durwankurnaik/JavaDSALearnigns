package com.company;

import java.util.Objects;

public class CustomLinkedList {
    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        // The instances are assigned here, so they have some weird values e.g. LL$Node@701
        node.next = head; // Here, the instance of head would be assigned to the node.next
        head = node; // Here, the new nodes instance will be assigned to the head since this is adding at the beginning

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);

        tail.next = node; // Here, the new nodes instance would be assigned to the last node
        tail = node; // Here, the newly created node would be assigned to tail

        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        } // In this loop, the temp pointer comes till index - 1

        Node node = new Node(val, temp.next); // Here, the newly created node is pointing towards the necessary next node
        temp.next = node; // Here, the previous node of the newly created node is pointing towards new node

        size += 1;
    }

    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public void deleteFirst() {
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
    }

    // This returns the reference variable of the entered index
    public Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        tail = get(size - 2); // Here we get the reference value of second last node
        tail.next = null; // The new tail instances next variable should point to no one i.e. null
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node prev = get(index - 1);
        prev.next = prev.next.next;
    }

    public Node find(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static class Node {
        int value;
        Node next;

        public Node() {}

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // Merging of two sorted lists
    public static CustomLinkedList merge(CustomLinkedList first, CustomLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        CustomLinkedList ans = new CustomLinkedList();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        // Whichever list is remaining, that will get added up in the ans list.
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    // https://leetcode.com/problems/linked-list-cycle
    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Find length of the cycle
    public static int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        int count = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                do {
                    slow = slow.next;
                    count++;
                } while (slow == fast);
                return count;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii
    public Node detectCycle(Node head) {
        int length = 0;

        Node fast = head;
        Node slow = head;
        int count = 0;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = cycleLength(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // Find the start node
        Node f = head;
        Node s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // Keep moving both forward, and they will meet at the cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // https://leetcode.com/problems/happy-number
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        // Both, slow and fast are starting from the given number

        do {
            slow = findSquare(slow); // This moves the slow pointer by one
            fast = findSquare(findSquare(fast)); // This moves the fast pointer by two
        } while (fast != slow); // It will break once the fast and slow pointer becomes the same

        return slow == 1; // The required answer
    }
    public int findSquare(int n) {
        int temp = n;
        int ans = 0;

        while (temp != 0) {
            int rem = temp % 10;
            ans += rem * rem;
            temp /= 10;
        }
        return ans;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    public void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                // Swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    second.next = first;
                    tail = first;
                    first.next = null;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // Recursion Reverse
    public void recursionReverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        recursionReverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // In place reversal
    // https://leetcode.com/problems/reverse-linked-list
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null) {
            pres.next = prev;

            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;

        return head;
    }

    // reverse a linked list part 2 (reversing sub-linkedlist) (https://leetcode.com/problems/reverse-linked-list-ii/)
    public Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        Node pres = head, prev = null;

        for (int i = 0; pres != null && i < left - 1; i++) {
            prev = pres;
            pres = pres.next;
        }

        Node last = prev, newEnd = pres;

        // reverse between left and right
        Node next = pres.next;
        for (int i = 0; pres != null && i < right - left + 1; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = pres;

        return head;
    }

    // palindrome of a string (https://leetcode.com/problems/palindrome-linked-list/)
    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node rereverseHead = headSecond;

        // compare both halves
        while (headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead); // no need to re-reverse the linked list since it is not asked in the question.

        return head == null || headSecond == null;
    }

    // https://leetcode.com/problems/reorder-list/ - reorder list
    public void reorderList(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node mid = middleNode(head);
        Node hf = head;
        Node hs = reverseList(mid);

        // rearranging now
        while (hf != null && hs != null) {
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // Setting next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

    public int remainingElem(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null || head.next == null) {
            return head;
        }

        // skip the first left-1 nodes
        Node pres = head, prev = null;

        while (true) {
            Node last = prev, newEnd = pres, next = pres.next;

            if (remainingElem(pres) < k) {
                break;
            }
            for (int i = 0; pres != null && i < k; i++) {
                pres.next = prev;
                prev = pres;
                pres = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = pres;
             if (pres == null) {
                 break;
             }
             prev = newEnd;
        }
        return head;
    }

    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/ - same as the above one but just not to reverse the alternate elements
    public Node reverseKGroupAlternate(Node head, int k) {
        if (k <= 1 || head == null || head.next == null) {
            return head;
        }

        // skip the first left-1 nodes
        Node pres = head, prev = null;
        int ansCounter = 0;

        while (true) {
            Node last = prev, newEnd = pres, next = Objects.requireNonNull(pres).next; // objects.requirenonnull is suggested by intellij idea nd its normally written as pres.next

            if (remainingElem(pres) < k) {
                break;
            }
            if (ansCounter % 2 != 0) {
                ansCounter++;
                for (int i = 0; i < k; i++) {
                    prev = pres;
                    pres = next;
                    if (next != null) {
                        next = next.next;
                    }
                }
                continue;
            }
            for (int i = 0; pres != null && i < k; i++) {
                pres.next = prev;
                prev = pres;
                pres = next;
                if (next != null) {
                    next = next.next;
                }
            }

            ansCounter++; // counts the number of times the loop runs so to skip the alternate block of elements as per in GFG

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = pres;
            if (pres == null) {
                break;
            }
            prev = newEnd;
        }
        return head;
    }

    // https://leetcode.com/problems/rotate-list/
    public Node rotateRight(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        Node prev = null, pres = head;
        int elemsToMove = k % length(head);

        for (int i = 0; i < elemsToMove; i++) {
            while (true) {
                if (pres.next == null) {
                    pres.next = head;
                    head = pres;
                    prev.next = null;
                    break;
                }
                prev = pres;
                pres = pres.next;
            }
        }
        return head;
    }

    public int length(Node head) {
        int counter = 0;
        while (head != null) {
            counter++;
            head = head.next;
        }
        return counter;
    }

    public static void main(String[] args) {
        CustomLinkedList first = new CustomLinkedList();
        CustomLinkedList second = new CustomLinkedList();

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(1);
        second.insertLast(9);
        second.insertLast(14);

        CustomLinkedList ans = CustomLinkedList.merge(first, second);

        ans.insertLast(8);
        ans.insertLast(2);
        ans.insertLast(0);
        ans.insertLast(4);
        ans.insertLast(69);
        ans.insertLast(7);

        ans.display();

        ans.bubbleSort();

        ans.display();
    }
}

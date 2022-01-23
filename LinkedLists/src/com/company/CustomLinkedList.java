package com.company;

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

    private class Node {
        private int value;
        private Node next;

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

        ans.display();
    }
}

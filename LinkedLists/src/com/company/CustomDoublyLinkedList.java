package com.company;

public class CustomDoublyLinkedList {

    private Node head;
    private int size;

    public CustomDoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);

        if (head != null) {
            head.prev = node;
        } // Otherwise, it will give an error

        node.next = head;
        node.prev = null;
        head = node;

        size++;
    }

    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node temp = head;
        Node last = null;

        while (temp != null) {
            last = temp;
            temp = temp.next;
        }

        Node node = new Node(value);

        last.next = node;
        node.prev = last;
        node.next = null;
    }

    public void insert(int value, int index) {
       Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
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

    public void insertAfter(int after, int value) {
        Node p = find(after);

        if (p == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(value);

        if (p.next == null) {
            node.prev = p;
            node.next = null;
            p.next = node;

            return;
        }

        node.next = p.next;
        p.next.prev = node;
        p.next = node;
        node.prev = p;
    }

    public void display() {
        Node node = head;
        Node last = null;

        System.out.print("START -> ");
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

//        Displays in reverse order
//        System.out.print("END -> ");
//        while (last != null) {
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

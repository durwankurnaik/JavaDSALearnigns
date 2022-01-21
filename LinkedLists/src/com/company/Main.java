package com.company;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(34);
//        list.insertFirst(23);
//        list.insertFirst(69);
//        list.insertFirst(54);
//
//        list.insertLast(100);
//
//        list.insert(1, 2);
//
//        list.display();
//
//        list.deleteLast();
//
//        list.display();
//
//        list.delete(2);
//
//        list.display();

//        CustomDoublyLinkedList list = new CustomDoublyLinkedList();
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertFirst(1);
//        list.insertFirst(8);
//
//        list.display();
//
//        list.insertLast(69);
//
//        list.display();
//
//        list.insertAfter(7, 1000);
//
//        list.display();

        CustomCircularLinkedList list = new CustomCircularLinkedList();
        list.insert(7);
        list.insert(5);
        list.insert(1);
        list.insert(8);

        list.display();

        list.delete(8);

        list.display();
    }
}

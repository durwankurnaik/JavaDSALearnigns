package com.company;

public class Main {
    public static void main(String[] args) {
//        LL list1 = new LL();
//        list1.insertFirst(34);
//        list1.insertFirst(23);
//        list1.insertFirst(69);
//        list1.insertFirst(54);
//
//        list1.insertLast(100);
//
//        list1.insert(1, 2);
//
//        list1.display();
//
//        list1.deleteLast();
//
//        list1.display();
//
//        list1.delete(2);
//
//        list1.display();

        CustomDoublyLinkedList list1 = new CustomDoublyLinkedList();
        list1.insertFirst(7);
        list1.insertFirst(5);
        list1.insertFirst(1);
        list1.insertFirst(8);

        list1.display();

        list1.insertLast(69);

        list1.display();

        list1.insertAfter(7, 1000);

        list1.display();
    }
}

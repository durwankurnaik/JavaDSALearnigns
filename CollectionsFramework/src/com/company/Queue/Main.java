package com.company.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
//        DynamicQueue queue = new DynamicQueue(5);
//
//        queue.insert(34);
//        queue.insert(22);
//        queue.insert(52);
//        queue.insert(23);
//        queue.insert(12);
//        queue.insert(69);
//        queue.insert(100);
//
//        System.out.println(queue);
//
//        queue.remove();
//
//        System.out.println(queue);
//
//        System.out.println(queue.peek());

        DynamicCircularQueue queue = new DynamicCircularQueue(5);

        queue.insert(43);
        queue.insert(23);
        queue.insert(41);
        queue.insert(37);
        queue.insert(69);
        queue.insert(91);
        queue.insert(19);

        System.out.println(queue);

        queue.remove();
        queue.insert(100);

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}

package com.company.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        pq.offer(43);
//        pq.offer(21);
//        pq.offer(10);
//        pq.offer(35);
//        pq.offer(36);
//
//        System.out.println(pq);
//
//        pq.poll();
//
//        System.out.println(pq);
//
//        System.out.println(pq.peek());

        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(30);
        deque.offer(13);
        deque.offer(35);
        deque.offer(52);
        deque.offer(22);
        deque.offerFirst(100);

        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);
    }
}

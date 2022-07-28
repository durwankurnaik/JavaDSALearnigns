package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(69);
        queue.offer(27);
        queue.offer(51);

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);
    }
}

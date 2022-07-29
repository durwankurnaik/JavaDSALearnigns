package com.company.Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arraydq = new ArrayDeque<>();

        arraydq.offer(43);
        arraydq.offer(21);
        arraydq.offer(52);
        arraydq.offer(54);
        arraydq.offer(23);
        arraydq.offer(74);
        arraydq.offer(69);

        System.out.println(arraydq);

        System.out.println(arraydq.peek());
    }
}

package com.company.CustomQueueImplementation;

import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("[");
        for (int i = 0; i < end; i++) {
            ans.append(data[i]);
            if (i < end - 1) {
                ans.append(", ");
            }
        }
        ans.append("]");

        return ans.toString();
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        int remove = data[0];

        // shift the elements here
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;

        return remove;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        return data[0];
    }
}

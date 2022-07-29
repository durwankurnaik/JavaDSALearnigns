package com.company.Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int front = 0, end = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty Queue";
        }

        StringBuilder ans = new StringBuilder();
        int i = front;

        do {
            ans.append(data[i]).append(" -> ");
            i++;
            i %= data.length;
        } while (i != end);

        return ans.append("END").toString();
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end %= data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty.");
        }

        int remove = data[front++];
        front %= data.length;
        size--;

        return remove;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty.");
        }
        return data[front];
    }
}

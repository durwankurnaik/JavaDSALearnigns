package com.company.List;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder("[");
        for (int i = 0; i <= ptr; i++) {
            ans.append(data[i]);
            if (i < ptr) {
                ans.append(", ");
            }
        }
        ans.append("]");

        return ans.toString();
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }

        data[++ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }
}

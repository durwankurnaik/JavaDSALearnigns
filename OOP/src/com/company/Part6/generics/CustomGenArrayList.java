package com.company.Part6.generics;

public class CustomGenArrayList<T> {

    private Object[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        StringBuilder answer = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            answer.append(i);
            answer.append(", ");
        }
        answer.delete(answer.length()-2, answer.length());
        answer.append("]");
        return answer.toString();
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean ifFull() {
        return size == data.length;
    }

    public void add(T num) {
        if (ifFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void remove(int index) {
        Object[] temp = new Object[data.length-1];
        for (int i = 0, j = 0; j < data.length;) {
            if (i != index) {
                temp[i] = data[j];
                i++;
                j++;
            } else {
                j++;
                index = Integer.MIN_VALUE;
            }
        }
        size--;
        data = temp;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public void set(int index, int item) {
        if (ifFull()) {
            resize();
        }
        Object[] temp = new Object[data.length+1];
        for (int i = 0, j = 0; i < temp.length;) {
            if (i != index) {
                temp[i] = data[j];
                i++;
                j++;
            } else {
                temp[i] = item;
                i++;
            }
        }
        data = temp;
    }

    public int size() {
        return data.length;
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.remove(3);
        list.remove(6);
        System.out.println(list);

        list.set(3, 69);
        System.out.println(list);
    }
}

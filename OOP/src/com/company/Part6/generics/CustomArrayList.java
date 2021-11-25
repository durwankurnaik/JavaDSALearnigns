package com.company.Part6.generics;

public class CustomArrayList {

    private int[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    @Override
    public String toString() {
        StringBuilder name = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            name.append(data[i]);
            name.append(", ");
        }
        name.delete(name.length()-2, name.length());
        name.append(']');
        return name.toString();
    }

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }


    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean ifFull() {
        return size == data.length;
    }

    public void add(int num) {
        if (ifFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void remove(int index) {
        int[] temp = new int[data.length-1];
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

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int item) {
        if (ifFull()) {
            resize();
            data[size+1] = item;
        } else {
            int[] temp = new int[data.length+1];
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
    }

    public int size() {
        return data.length;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

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

package com.company.Part4_AccessModifiersETC;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() { // Calls when the object is called directly in the program
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable { // Calls when the garbage collection is hit
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(14);

        System.out.println(obj.hashCode());
    }
}

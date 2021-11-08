package com.company.Part2;

public class InnerClasses {
    static class TestClass {
        String name;
        public TestClass (String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        TestClass durwa = new TestClass("Durwankur");

        System.out.println(durwa);
    }
}

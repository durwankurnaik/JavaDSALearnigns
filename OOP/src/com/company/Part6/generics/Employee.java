package com.company.Part6.generics;

public class Employee {
    int salary;
    int age;

    public Employee(int salary, int age) {
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return salary + "";
    }
}

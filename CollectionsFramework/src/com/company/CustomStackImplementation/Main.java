package com.company.CustomStackImplementation;
import com.company.StackException;

public class Main {

    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack();

        stack.push(30);
        stack.push(23);
        stack.push(42);
        stack.push(12);
        stack.push(69);

        System.out.println(stack);
        System.out.println(stack.peek());

        stack.push(100);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println(stack);
    }
}

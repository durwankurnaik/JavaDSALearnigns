package Part2;

public class Main {
    public static void main(String[] args) {
//        greetings();  This can't be done because the main function is a static method, and it doesn't depend on an object
//        But the greeting's method is a non-static method which will be depended on an object, hence we need to create an object for greeting to work inside the static method

        Main obj = new Main();
        obj.greetings();

        // Also, we cannot use "this" keyword in static methods, since "this" keyword deal with the objects and static are object independent
    }

    void greetings() {
        System.out.println("Welcome to the world of OOP");
    }
}

package Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        display(5);
        display("Hello");
    }

    // Method overloading
    static void display(int num) {
        System.out.println("Integer number: " + num);
    }

    static void display(String str) {
        System.out.println("String: " + str);
    }
}

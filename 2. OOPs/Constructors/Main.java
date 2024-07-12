package Constructors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(); // Default constructor
        Car car2 = new Car("Toyota", "Camry", 2022); // Parameterized constructor

        System.out.println("Car 1:");
        car1.displayInfo();
        System.out.println("Car 2:");
        car2.displayInfo();
    }
}

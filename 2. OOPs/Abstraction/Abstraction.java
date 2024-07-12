package Abstraction;

abstract class Shape {

    public abstract double calculateArea();

    public void display() {
        System.out.println("Displaying shape");
    }

}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        circle.display();

        System.out.println("Area of circle: " + circle.calculateArea());

    }
}

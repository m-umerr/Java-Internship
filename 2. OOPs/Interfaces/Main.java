package Interfaces;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.println("Perimeter of circle: " + circle.calculatePerimeter());

        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter());
    }
}

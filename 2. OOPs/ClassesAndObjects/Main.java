package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Accord", 2023);

        car1.displayInfo();
        car2.displayInfo();
    }
}

package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.getMobile("iphone");
        mobile.getMobile();
    }
}

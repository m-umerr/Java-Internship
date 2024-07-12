package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

interface Pet {
    void play();
}

class Poodle extends Dog implements Pet {
    public void play() {
        System.out.println("Poodle is playing...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();

        // Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // Multiple Inheritance
        Poodle poodle = new Poodle();
        poodle.eat();
        poodle.bark();
        poodle.play();
    }
}

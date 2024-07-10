package Enums;

enum Beverage {
    TEA,
    COFFEE,
    DRINK;
}


public class FoodOrder {

    public void orderFood(Beverage beverage){
        System.out.println("Preparing "+beverage);
    }
}

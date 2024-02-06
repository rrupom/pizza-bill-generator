package com.bitbrain;

public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraToppings();
        basePizza.takeAway();
        basePizza.getBill();

        System.out.println("----------------");

        DeluxPizza deluxPizza = new DeluxPizza(false);
        deluxPizza.takeAway();
        deluxPizza.getBill();



    }
}

package com.bitbrain;

public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 100;
    private int backPack = 20;

    private int basePizzaPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAway;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        this.basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
//        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
        this.isExtraCheeseAdded = true;
    }

    public void addExtraToppings() {
//        System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;
        this.isExtraToppingsAdded = true;
    }

    public void takeAway() {
//        System.out.println("Take away opted");
        this.price += backPack;
        this.isTakeAway = true;
    }

    public void getBill() {
        System.out.println("Pizza : " + this.basePizzaPrice);
        if (isExtraCheeseAdded) {
            System.out.println("Cheese : " + extraCheesePrice);
        }
        if (isExtraToppingsAdded) {
            System.out.println("Toppings : " + extraToppingsPrice);
        }
        if (isTakeAway) {
            System.out.println("Take Away : " + backPack);
        }

        System.out.println("Total : " + this.price);
    }
}

/*
 * Base Pizza: 300
 * Toppings: 100
 * Cheese: 100
 * Take Away: 20
 * Total :
 */
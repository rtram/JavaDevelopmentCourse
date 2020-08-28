package com.company;

public class DeluxeBurger extends Burger {
    private int chips = 1;
    private int drink = 1;
    private double basePrice = 5.85;

    public DeluxeBurger() {
        super("Artisan");
    }

    @Override
    public void addLettuce() {
        System.out.println("Additions are not permitted on a Deluxe Burger Combo");
    }

    @Override
    public void addTomato() {
        System.out.println("Additions are not permitted on a Deluxe Burger Combo");
    }

    @Override
    public void addCarrot() {
        System.out.println("Additions are not permitted on a Deluxe Burger Combo");
    }

    @Override
    public void addOnion() {
        System.out.println("Additions are not permitted on a Deluxe Burger Combo");
    }

    @Override
    public double calculateTotalPrice() {
        return this.basePrice;
    }
}

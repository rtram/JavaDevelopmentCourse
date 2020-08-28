package com.company;

public class HealthyBurger extends Burger {

    private int avocado;
    private int arugula;

    public HealthyBurger() {
        super("Brown Rye Bread Roll");
    }

    public void addAvocado() {
        this.avocado++;
        System.out.println("Avocado has been added to your burger" + "\n" +
                "Your current total is -> " + this.calculateTotalPrice());
    }

    public void addArugula() {
        this.arugula++;
        System.out.println("Arugula has been added to your burger" + "\n" +
                "Your current total is -> " + this.calculateTotalPrice());
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = super.calculateTotalPrice();
        totalPrice += (avocado * 1.00);
        totalPrice += (arugula * .75);

        return totalPrice;
    }
}

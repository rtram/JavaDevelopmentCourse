package com.company;

public class Burger {
    private String breadRollType;
    private String meat = "Beef";
    private double basePrice;
    private int lettuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int onion = 0;

    public Burger(String breadRollType) {
        this.breadRollType = breadRollType;
        this.basePrice = 2.85;
    }

    public void addLettuce() {
        this.lettuce++;
        System.out.println("Lettuce has been added to your burger" + "\n" +
                "Your current total is -> $" + this.calculateTotalPrice());
    }

    public void addTomato() {
        this.tomato++;
        System.out.println("Tomato has been added to your burger" + "\n" +
                "Your current total is -> $" + this.calculateTotalPrice());
    }

    public void addCarrot() {
        this.carrot++;
        System.out.println("Carrot has been added to your burger" + "\n" +
                "Your current total is -> $" + this.calculateTotalPrice());
    }

    public void addOnion() {
        this.onion++;
        System.out.println("Onion has been added to your burger" + "\n" +
                "Your current total is -> $" + this.calculateTotalPrice());
    }

    public double calculateTotalPrice() {
        double totalPrice = this.basePrice;

        totalPrice += (lettuce * .65);
        totalPrice += (tomato * .50);
        totalPrice += (carrot * .25);
        totalPrice += (onion * .50);

        return totalPrice;
    }
}

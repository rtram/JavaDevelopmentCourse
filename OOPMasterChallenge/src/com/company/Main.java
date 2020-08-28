package com.company;

public class Main {

    public static void main(String[] args) {
//        HealthyBurger myBurger = new HealthyBurger();
//
//        myBurger.addTomato();
//        myBurger.addOnion();
//        myBurger.addLettuce();
//        myBurger.addAvocado();
//
//        System.out.println(myBurger.calculateTotalPrice());

        DeluxeBurger myBurger = new DeluxeBurger();

        myBurger.addTomato();
        myBurger.addOnion();
        myBurger.addLettuce();

        System.out.println("Your total is -> " + myBurger.calculateTotalPrice());
    }
}

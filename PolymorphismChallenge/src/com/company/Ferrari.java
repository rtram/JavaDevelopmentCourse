package com.company;

class Ferrari extends Car {

    public Ferrari() {
        super("Ferrari", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Wow look at this guy driving the Ferrari over here");
    }
}

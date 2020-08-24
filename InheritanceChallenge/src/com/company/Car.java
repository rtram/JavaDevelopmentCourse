package com.company;

public class Car extends Vehicle {

    private boolean handSteering;
    private boolean gearChange;

    public Car () {
        this(true, true);
    }

    public Car (boolean handSteering, boolean gearChange) {
        this.handSteering = handSteering;
        this.gearChange = gearChange;
    }
}

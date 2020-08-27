package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        System.out.println("You are driving a generic car");
    }

    public void accelerate() {
        System.out.println("Your car is accelerating");
    }

    public void brake() {
        System.out.println("Your car is braking");
    }
}

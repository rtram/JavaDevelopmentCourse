package com.company;

public class Model extends Car {
    private String manufacturer;
    private String make;
    private int topSpeed;
    private int currentGear;

    public Model () {
        this("Honda", "Accord", 120);
    }

    public Model (String manufacturer, String make, int topSpeed) {
        this.manufacturer = manufacturer;
        this.make = make;
        this.topSpeed = topSpeed;
        System.out.println("You now own a " + manufacturer + " " + make);
    }

    public void startCar () {
        currentGear = 1;
        System.out.println("Car has been started. Currently on first gear! VROOM VROOM!");
    }

    public void turnOffCar() {
        currentGear = 0;
        System.out.println("Car has been turned off.");
    }

    public void increaseGear () {
        currentGear++;
        System.out.println("Gear has been increased. Now in gear " + currentGear);
    }

    public void decreaseGear () {
        currentGear--;
        System.out.println("Gear has been decreased. Now in gear " + currentGear);
    }
}

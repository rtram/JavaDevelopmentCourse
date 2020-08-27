package com.company;

class Toyota extends Car {

    public Toyota() {
        super("Honda", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("You are driving a Toy Yoda");
    }
}
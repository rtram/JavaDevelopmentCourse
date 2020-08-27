package com.company;

class Honda extends Car {

    public Honda() {
        super("Honda", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("You are driving a wonderful Honda.");
    }
}

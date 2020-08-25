package com.company;

public class House {
    private String houseType;
    private Room room;

    public House() {
        this("Single Family Home", new Room("Bedroom"));
    }

    public House(String houseType, Room room) {
        this.houseType = houseType;
        this.room = room;
        System.out.println("You have bought this " + houseType + " and it has a " + room.getRoomType());
    }

    public void enterHouse() {
        System.out.println("You have entered into a " + houseType);
    }
}

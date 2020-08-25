package com.company;

public class Room {
    private String roomType;
    private Furniture furniture;

    public Room(String type) {
        roomType = type;
    }

    public void moveIn(Furniture furniture) {
        this.furniture = furniture;
    }

    public String getRoomType() {
        return roomType;
    }
}

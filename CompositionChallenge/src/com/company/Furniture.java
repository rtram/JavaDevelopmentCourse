package com.company;

public class Furniture {
    private String furnitureType;

    public Furniture(String type) {
        furnitureType = type;
    }

    private void use() {
        System.out.println(furnitureType + " is in use.");
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMaxByteValue);
        System.out.println("Byte Maximum Value = " + myMinByteValue);

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Minimum Value = " + myMaxshortValue);
        System.out.println("short Maximum Value = " + myMinshortValue);

        long myLongValue = 100L;
        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value = " + myMaxlongValue);
        System.out.println("long Maximum Value = " + myMinlongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(myLongValue);
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNew = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinshortValue / 2);

        // Primitive Types Challenge

        byte myByteVariable = 5;
        short myShortVariable = 3000;
        int myIntVariable = 245678;
        long myLongVar = 50000 + (10*(myByteVariable + myShortVariable + myIntVariable));

        System.out.println(myLongVar);

        short shortTotal = (short) (1000 + 10 * (myByteVariable + myShortVariable + myIntVariable));
    }
}

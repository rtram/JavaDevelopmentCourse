package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float min value = " + minFloat);
        System.out.println("Float max value = " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double min value = " + minDouble);
        System.out.println("Double max value = " + maxDouble);

        int intValue = 5 / 3;
        float floatValue = 5.0f / 3.0f;
        double doubleValue = 5.0 / 3.0;
        System.out.println("MyIntValue = " + intValue);
        System.out.println("MyFloatValue = " + floatValue);
        System.out.println("MyDoubleValue = " + doubleValue);

        double lbs = 200.0;
        double kg = lbs * 0.45359237;
        System.out.println("It weighs this many kilograms =>" + kg);

        double pi = 3.1415927;
        double anotherNumber = 3_000_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}

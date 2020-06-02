package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
//        printConversion(75.114);
//        printConversion(-5);
//
//        printMegaBytesAndKiloBytes(-1);
//        System.out.println(shouldWakeUp(true, -1));
//        System.out.println(isLeapYear(1800));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            double result = kilometersPerHour / 1.609;
            long roundResult = Math.round(result);
            return roundResult;
        }

        return -1;
    }

    public static void printConversion (double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);

        if (result >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        int mb = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainder + " KB");
        }
    }

    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
        boolean wakeUp = false;

        if (!isBarking) {
            wakeUp = false;
        } else if (hourOfDay < 0 || hourOfDay > 23) {
            wakeUp = false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            wakeUp = true;
        }

        return wakeUp;
    }

    public static boolean isLeapYear (int year) {
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
        }
        if (year < 1 || year > 9999) {
            leapYear = false;
        }
        return leapYear;
    }

    public static boolean areEqualByThreeDecimalPlaces (double d1, double d2) {
        DecimalFormat df = new DecimalFormat("#.###");
        String formatted1 = df.format(d1);
        String formatted2 = df.format(d2);

        return formatted1.equals(formatted2);
    }

    public static boolean hasEqualSum (int first, int second, int third) {
        int sum = first + second;

        return sum == third;
    }

    public static boolean hasTeen (int first, int second, int third) {
        if (isTeen(first)) {
            return true;
        } else if (isTeen(second)) {
            return true;
        } else if (isTeen(third)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen (int age) {
        return (age > 12 && age < 20);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result+= 2;
        System.out.println(result);

        result*= 10;
        System.out.println(result);

        result /= 4;
        System.out.println(result);

        result -= 2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("I am not an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        double doubleValue = 20.00d;
        double doubleValue2 = 80.00d;

        double remainder = (doubleValue + doubleValue2) * 100.00d % 40.00d;

        boolean outcome;

        if (remainder == 0) {
            outcome = true;
            System.out.println("No remainder here");
        } else {
            outcome = false;
            System.out.println("Got some remainder");
        }
    }
}

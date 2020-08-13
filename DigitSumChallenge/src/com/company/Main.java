package com.company;

public class Main {

    public static void main(String[] args) {
        sumDigits(155);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

}


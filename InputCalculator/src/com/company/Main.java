package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double count = 0;

        while(true) {
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                break;
            }
        }

        double average = sum/count;

        int roundedAverage = (int) Math.round(average);

        System.out.println("SUM = " + sum + " " + "AVG = " + roundedAverage);
    }
}

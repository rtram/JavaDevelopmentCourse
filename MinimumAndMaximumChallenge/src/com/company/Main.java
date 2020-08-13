package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int max = 0;
        int min = 0;
        boolean isFirstTime = true;

        while(true) {

            System.out.println("Please Enter Number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine();

                if (isFirstTime) {
                    min = number;
                    max = number;
                    isFirstTime = false;
                    continue;
                }

                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }

        System.out.println("The maximum number you have entered is: " + max);
        System.out.println("The minimum number you have entered is: " + min);

        scanner.close();
    }
}

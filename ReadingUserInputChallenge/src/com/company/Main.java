package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(count < 10) {
            System.out.println("Please Enter number #" + (count + 1));

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Please enter a valid number.");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("The sum of all ten numbers you have entered is: " + sum);
    }
}

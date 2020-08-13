package com.company;

public class Main {

    public static void main(String[] args) {

        numberToWords(456);
        System.out.println(getDigitCount(1200));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        int reversed = Math.abs(reverse(number));

        while (count > 0) {
            int digit = reversed % 10;
            reversed /= 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count--;
        }
    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
        }

        int absNumber = Math.abs(number);
        int reversed = 0;

        reversed += absNumber % 10;
        absNumber /= 10;

        while (absNumber > 0) {
            reversed = (reversed * 10) + absNumber % 10;
            absNumber /= 10;
        }

        if (isNegative) {
            return reversed * -1;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;

        } while (number > 0);

        return count;
    }
}

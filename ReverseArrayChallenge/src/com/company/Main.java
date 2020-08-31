package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers(5);
        System.out.println("Unreversed Array is: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array is: " + Arrays.toString(arr));
    }

    public static int[] getIntegers(int arrLength) {
        System.out.println("Please enter 5 integers.");
        int[] arr = new int[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void reverse(int[] arr) {
        int centerIndex = (int) Math.floor(arr.length/2);

        for(int i = 0; i < centerIndex; i++) {
            int mem;

            mem = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = mem;
        }
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}

package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] myArr = getIntegers(5);
        sortIntegers(myArr);
        printArray(myArr);
        System.out.println(Arrays.toString(myArr));
    }

    public static Integer[] getIntegers(int arrLength) {
        System.out.println("Please enter 5 integers.");
        Integer[] arr = new Integer[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void printArray(Integer[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Index #" + i + " contains " + arr[i] );
        }
    }

    public static void sortIntegers(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
    }
}

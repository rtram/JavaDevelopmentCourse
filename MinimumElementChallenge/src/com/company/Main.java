package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] arr = getIntegers(5);
        System.out.println("The lowest number in the set is: " + findMin(arr));

    }

    public static int[] getIntegers(int arrLength) {
        System.out.println("Please enter 5 integers.");
        int[] arr = new int[arrLength];

        for(int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

//    public static void readIntegers(int[] arr) {
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
//    }
}

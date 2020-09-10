package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while(!quit) {
            printMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    System.out.println("Goodbye!");
                case 1:

            }
        }
    }

    public static void printMainMenu() {
        System.out.println("Welcome to Spotify!");
        System.out.println("Please enter the number next to the option you would like and press enter.");
        System.out.println("----------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Browse Albums");
        System.out.println("2. Playlist Menu");
        System.out.println("----------------------------");
    }

    public static void albumsMenu(Scanner scanner) {
        boolean quit = false;

        while(!quit) {

        }
    }

    public static void printAlbumsMenu() {

    }

    public static void printPlaylistMenu() {

    }
}

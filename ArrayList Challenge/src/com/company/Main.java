package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            printInstructions();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list contact names and their phone numbers.");
        System.out.println("\t 2 - To add a contact to your address book.");
        System.out.println("\t 3 - To update a contact in your address book.");
        System.out.println("\t 4 - To remove a contact from your address book.");
//        System.out.println("\t 5 - To search for contact in your address book.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact() {
        System.out.println("Please enter a name: ");
        String contactName = scanner.nextLine();
        System.out.println("Please enter " + contactName + "'s phone number");
        String contactPhoneNumber = scanner.nextLine();
        mobilePhone.addContact(new Contacts(contactName, contactPhoneNumber));
    }

    public static void updateContact() {
        System.out.println("Please enter a name or phone number ");
        String search = scanner.nextLine();
        System.out.println("Search " + search);
        int index = mobilePhone.getIndex(search);
        boolean quit = false;
        if(index >= 0) {
            Contacts contactObj = mobilePhone.getMobilePhone().get(index);
            String oldName = contactObj.getName();
            while (!quit) {
                System.out.println("Would you like to edit " + oldName + "'s name or phone number");
                System.out.println("1. Name");
                System.out.println("2. Phone Number");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Please enter a new name for " + oldName + ": ");
                        String name = scanner.nextLine();
                        mobilePhone.updateContactName(index, name);
                        String newName = contactObj.getName();
                        System.out.println(oldName + "'s contact name has been changed from " + oldName + " to " + newName);
                        quit = true;
                        break;
                    case 2:
                        System.out.println("Please enter a new phone number for " + oldName + ".");
                        String oldPhoneNumber = contactObj.getPhoneNumber();
                        String phoneNumber = scanner.nextLine();
                        mobilePhone.updateContactNumber(index, phoneNumber);
                        String newPhoneNumber = contactObj.getPhoneNumber();
                        System.out.println(oldName + "'s contact phone number has been changed from " + oldPhoneNumber + " to " + newPhoneNumber);
                        quit = true;
                        break;
                }
            }
            return;
        }
        System.out.println("Could not find a contact with that name or phone number.");
    }

    public static void removeContact() {
        mobilePhone.printContactList();
        System.out.println("Which please enter the number beside the contact that you want to remove from your address book.");
        int indexToRemove = scanner.nextInt() - 1;
        scanner.nextLine();
        mobilePhone.removeContact(indexToRemove);
    }

//    public static void searchForContact() {
//        System.out.println("Please enter a contact name to search for: ");
//        String searchName = scanner.nextLine();
//        if(mobilePhone.)
//    }
}

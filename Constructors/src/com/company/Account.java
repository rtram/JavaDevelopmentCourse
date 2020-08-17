package com.company;

public class Account {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this(56789, 2.50, "Default name", "Default address", "Default phone number");
        System.out.println("Empty default constructor called");
    }

    public Account(int number, double balance, String name, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this(99999, 100.55, name, email, phoneNumber);
    }

    public void deposit(double deposit) {
        this.balance += deposit;
        System.out.println("$" + deposit + " has been deposited into your account! New balance is $" + this.balance);
    }

    public void withdrawal(double withdrawal) {
        if ((this.balance - withdrawal) < 0) {
            System.out.println("Insufficient funds to withdraw. Your balance available for withdrawal is $" + this.balance);
        } else {
            this.balance -= withdrawal;
            System.out.println("$" + withdrawal + " has been withdrawn from your account, your remaining balance is $" + this.balance);
        }
    }

    public int getAccountNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.number = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }
}

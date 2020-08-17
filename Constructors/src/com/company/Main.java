package com.company;

import org.w3c.dom.html.HTMLImageElement;

public class Main {

    public static void main(String[] args) {
//        Account bobsAccount = new Account();
////        Account bobsAccount = new Account(12345, 0.00, "Bob Brown", "bob@gmail.com", "703-444-4444");
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
//
//        System.out.println(bobsAccount.getBalance());
//
//        Account timsAccount = new Account("Tim", "tim@gmail.com", "12345");
//        System.out.println(timsAccount.getPhoneNumber() + " name " + timsAccount.getName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", "Bob@gmail.com");

        VipCustomer person3 = new VipCustomer("Tim", 100, "tim@gmail.com");

    }
}

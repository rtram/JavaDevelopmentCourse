package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> addressBook = new ArrayList<>();

    public void printContactList() {
        System.out.println("Here is your list of contacts in your address book.");
        for(int i = 0; i < addressBook.size(); i++) {
            Contacts contactObj = addressBook.get(i);
            System.out.println((i+1) + ". " + contactObj.getName() + " - " + contactObj.getPhoneNumber());
        }
    }

    public ArrayList<Contacts> getMobilePhone() {
        return addressBook;
    }

    public void addContact(Contacts contact) {
        addressBook.add(contact);
    }

    public void updateContactName(int index, String name) {
        Contacts contactObj = addressBook.get(index);
        contactObj.setName(name);
    }

    public void updateContactNumber(int index, String number) {
        Contacts contactObj = addressBook.get(index);
        contactObj.setPhoneNumber(number);
    }

    public void removeContact(int index) {
        Contacts contactObj = addressBook.get(index);
        String name = contactObj.getName();
        addressBook.remove(index);
        System.out.println(name + " has been removed from your address book.");
    }

    public int getIndex(String search) {
        for(int i = 0; i < addressBook.size(); i++) {
            Contacts contactObj = addressBook.get(i);
            if(contactObj.getName().equalsIgnoreCase(search) || contactObj.getPhoneNumber().equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }
}

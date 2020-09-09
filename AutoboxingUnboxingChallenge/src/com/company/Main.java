package com.company;

import java.util.ArrayList;

class Bank {
    ArrayList<Branch> branches = new ArrayList<Branch>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }

    public boolean addNewBranch(String name) {
        if(findBranch(name) == null) {
            Branch newBranch = new Branch(name);
            branches.add(newBranch);
            return true;
        }
        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initTransaction) {
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null) {
            foundBranch.addNewCustomer(customerName, initTransaction);
            return true;
        }
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double transaction) {
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null) {
            return foundBranch.addCustomerTransactions(customerName, transaction);
        }
        return false;
    }

    public void listBranchCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            ArrayList<Customer> customerList = retrieveBranchCustomerList(branchName);
            System.out.println("Customer List for " + this.name + " " + branchName + " Branch");
            for(int i = 0; i < customerList.size(); i++) {
                Customer branchCustomer = customerList.get(i);
                System.out.println("Customer " + branchCustomer.getName() + " Transaction Details");
                if(showTransactions) {
                    ArrayList<Double> customerTransaction = branchCustomer.getTransactions();
                    for(int j = 0; j < customerTransaction.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount: " + customerTransaction.get(j));
                    }
                }
            }
        }
    }

    private ArrayList<Customer> retrieveBranchCustomerList(String branchName) {
        Branch foundBranch = findBranch(branchName);
        return foundBranch.getCustomers();
    }

    private Branch findBranch(String branchName) {
        Branch foundBranch = null;
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.getName().equalsIgnoreCase(branchName)) {
                foundBranch = branch;
                break;
            }
        }
        return foundBranch;
    }
}

class Branch {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public boolean addNewCustomer(String customerName, double initTransaction) {
        if(findCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName, initTransaction);
            customers.add(newCustomer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransactions(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }
}

class Customer {
    ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(String name, double initTransaction) {
        this.name = name;
        transactions.add(initTransaction);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}

public class Main {

    public static void main(String[] args) {
	    Bank wellsFargo = new Bank("Wells Fargo");

	    wellsFargo.addNewBranch("Fairfax");

	    wellsFargo.addNewCustomer("Fairfax", "Robin Tram", 19.99);

	    wellsFargo.listBranchCustomers("Fairfax", true);
    }
}

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

    public void addNewBranch(String name) {
        Branch newBranch = new Branch(name);
        branches.add(newBranch);
    }

    public void addNewCustomer(String branchName, String customerName, double initTransaction) {
        Branch foundBranch = findBranch(branchName);

        foundBranch.addNewCustomer(customerName, initTransaction);
    }

    public void addTransaction(String branchName, String customerName, double transaction) {
        Branch foundBranch = findBranch(branchName);

        foundBranch.addNewCustomer(customerName, transaction);
    }

    public void listBranchCustomers(String branchName) {
        ArrayList<Customer> customerList = retrieveBranchCustomerList(branchName);

        customerList.forEach((customer) -> System.out.println(customer.getName()));
    }

    public void listBranchCustomers(String branchName, boolean showTransactions) {
        if(showTransactions) {
            ArrayList<Customer> customerList = retrieveBranchCustomerList(branchName);

            for(int i = 0; i < customerList.size(); i++) {
                Customer customer = customerList.get(i);
                customer.getTransactions().forEach((transaction) -> System.out.println(transaction));
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

    public void addNewCustomer(String customerName, double initTransaction) {
        Customer newCustomer = new Customer(customerName, initTransaction);
        customers.add(newCustomer);
    }

    public void addCustomerTransactions(String name, double transaction) {
        Customer foundCustomer = findCustomer(name);

        foundCustomer.addTransaction(transaction);
    }

    private Customer findCustomer(String name) {
        Customer foundCustomer = null;

        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getName().equalsIgnoreCase(name)) {
                foundCustomer = customer;
                break;
            }
        }

        return foundCustomer;
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

	    wellsFargo.listBranchCustomers("Fairfax");
	    wellsFargo.listBranchCustomers("Fairfax", true);
    }
}

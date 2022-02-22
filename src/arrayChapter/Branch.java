package arrayChapter;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        Customer customer = new Customer(nameOfCustomer, initialTransaction);
        for(int i=0; i < customers.size(); i++) {
            if(nameOfCustomer.equals(customers.get(i).getName())) {
                return false;
            }
        }
        return customers.add(customer);
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        for(int i=0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getName().equals(nameOfCustomer)) {
                return customer.getTransactions().add(transaction);
            }
        }
        return false;

    }

    private Customer findCustomer(String nameOfCustomer) {
        for(int i=0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getName().equals(nameOfCustomer)) {
                return customer;
            }
        }
        return null;
    }

}

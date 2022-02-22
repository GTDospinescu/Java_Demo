package arrayChapter;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String nameOfBranch){
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.getName().equals(nameOfBranch)) {
                return false;
            }
        }
        Branch branch = new Branch(nameOfBranch);
        return branches.add(branch);
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        for(int i=0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(nameOfBranch.equals(branch.getName())) {
                return branch.newCustomer(nameOfCustomer,initialTransaction);
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double newTransaction) {
        for(int i=0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if (nameOfBranch.equals(branch.getName())) {
                for(int j = 0; j < branch.getCustomers().size(); j++) {
                    Customer customer = branch.getCustomers().get(j);
                    if(customer.getName().equals(nameOfCustomer)) {
                        return customer.getTransactions().add(newTransaction);
                    }
                }
                return false;
            }
        }
        return false;

    }

    private Branch findBranch(String nameOfBranch) {
        for(int i = 0; i < branches.size(); i++) {
            if(nameOfBranch.equals(branches.get(i).getName())){
                return branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(nameOfBranch.equals(branch.getName())) {
                System.out.println("Customer details for branch " + nameOfBranch);
                for(int j = 0; j < branch.getCustomers().size(); j++) {
                    Customer customer = branch.getCustomers().get(j);
                    System.out.println("Customer: " + branch.getCustomers().get(j).getName() + "[" +(j + 1) + "]");
                    if(printTransactions) {
                        System.out.println("Transactions");
                        for(int k = 0; k < customer.getTransactions().size(); k++) {
                            System.out.println("[" + (k + 1) + "]  Amount " + customer.getTransactions().get(k));
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }


}

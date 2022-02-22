package OOP;

public class BankAccount {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(50);
        BankAccount acc2 = new BankAccount(70);
        System.out.println(acc1.getBalance());

    }


    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int accountNumber,int balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this(123, 1000, customerName, email, phoneNumber);
        // initializez constructor cu anumiti parametri default
    }

    public BankAccount(int balance){
        this.balance = balance;
    }

    public BankAccount(){
        this(1,1,"T","D",123);
    } //Daca folosesc un contructor si nu bag date pot folosi asta ptr a baga date default

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int number){
        balance+=number;
    }

    public void withdrawFunds(int number){
        if(balance - number <= 0){
            System.out.println("Only " + balance + " available. Withdrawal not processed");;
        } balance -= number;
        System.out.println("Withdrawal processed! " + balance + " remain");
    }

}


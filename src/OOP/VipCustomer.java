package OOP;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private  String emailAddress;

    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer() {
        this("Teo", 100, "tezeu@gmail.com");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "tezeu@gmail.com");
    }



}

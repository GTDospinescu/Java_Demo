import OOP.BankAccount;
import OOP.Car;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());


        BankAccount bobsAccount = new BankAccount(1,2, "Teo", "Dor", 1);
        bobsAccount.withdrawFunds(100);
    }




}

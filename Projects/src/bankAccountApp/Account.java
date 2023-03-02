package bankAccountApp;

public abstract class Account implements IBaseRate {
    //List common properties gor saving and checking account
    String name;
    String sSN;
    double balance;

    String accountNumber;
    double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("Name: " + name + "sSN: " + sSN + "Balance: " + balance);
    }

    //List common methods
}

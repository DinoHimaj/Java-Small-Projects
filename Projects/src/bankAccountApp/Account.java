package bankAccountApp;

public abstract class Account implements IBaseRate {
    //List common properties gor saving and checking account
    private String name;
    private String sSN;
    private double balance;

    private static int index = 1000;
    protected String accountNumber;
    protected double rate;

    //Constructor to set base properties and initialize the account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;
        System.out.println("Name: " + name + " sSN: " + sSN + " Balance: " + balance);

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return sSN.substring(sSN.length() - 2) + index + randomNumber;
    }

    //compound interest
    public void compound(){
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest : €" + accruedInterest);
        showBalance();
    }

    //List common methods - Transactions
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing " + amount + "€");
        showBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing " + amount + "€");
        showBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering " + amount + "€ to" + toWhere);
        showBalance();
    }

    public void showBalance(){
        System.out.println("Your current balance: " + balance + "€");
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                 "\nACCOUNT NUMBER: " + accountNumber +
                 "\nBALANCE: " + balance +
                 "\nRATE: " +rate + "%"
        );
    }
}

package bankAccountApp;

public class Savings extends Account {
    //List properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize savings account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your savings account Features" +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );

    }
}

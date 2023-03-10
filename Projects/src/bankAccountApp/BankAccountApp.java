package bankAccountApp;

public class BankAccountApp {
    public static void main(String[] args){
        Checking chkacc1 = new Checking("Dino Himaj", "123456789", 1500);
        Savings savacc1 = new Savings("Richie Rich", "123456798", 2500);

        savacc1.compound();
        System.out.println("******************************************\n");

        chkacc1.showInfo();
        System.out.println("*********************");
        savacc1.showInfo();

        //Read a CSV file then create new accounts based on that data

    }
}

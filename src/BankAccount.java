public class BankAccount {

    String account = "wfbodsjbfodsj";
    double balance = -1234.9;



    public static void main(String [] args){


        BankAccount bankAccount = new BankAccount();
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        COD cod = new COD();


        savingsAccount.transfers = 5;
        savingsAccount.balance = bankAccount.balance + 200;


        System.out.println(savingsAccount.transfers);
        System.out.println(savingsAccount.account);
        System.out.println(savingsAccount.balance);
        System.out.println(bankAccount.balance);

    }


}

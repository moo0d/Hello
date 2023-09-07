package week3_3.Task1;

public class BankAccount {

    private long account;
    private double balance;
    private static int accounts = 0;

    public BankAccount(long account) {
        this.account = account;
        balance = 0;
        accounts = accounts + 1;
    }

    public void deposit(double number) {
        balance = balance + number;

    }

    public void withdraw(double number) {
        if (balance > number) {
            balance = balance - number;
        }
    }
    public static int getAccounts(){
        return accounts;
    }

    public long getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(20293921);
        BankAccount bankAccount2 = new BankAccount(20391823);

        bankAccount1.deposit(500);
        bankAccount2.deposit(800);
        bankAccount1.withdraw(300);
        bankAccount2.withdraw(300);

        System.out.println("Account " + bankAccount1.getAccount() + " balance: " + bankAccount1.getBalance());
        System.out.println("Account " + bankAccount2.getAccount() + " balance: " + bankAccount2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getAccounts());
    }

}
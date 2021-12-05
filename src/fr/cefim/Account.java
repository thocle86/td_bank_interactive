package fr.cefim;

public class Account {

    private int accountNumber;
    private static int numberAccounts;
    private float sold;

    Account() {
        this.accountNumber = ++numberAccounts;
        this.sold = 100;
    }

    /* COMMON GETTERS */
    public int getAccountNumber() {
        return accountNumber;
    }

    public static int getNumberAccounts() {
        return numberAccounts;
    }

    public float getSold() {
        return sold;
    }

    /* COMMON SETTERS */

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void setNumberAccounts(int numberAccounts) {
        Account.numberAccounts = numberAccounts;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    /* SPECIAL METHODS */

    public void deposit(float value) {
        sold += value;
    }

    public void withdrawal(float value) {
        sold -= value;
    }

    public void displaySold() {
        System.out.println(sold);
    }
}

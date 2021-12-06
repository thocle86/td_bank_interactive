package fr.cefim;

public class Account {

    private int accountNumber;
    private static int numberAccounts;
    private float balance;

    Account() {
        this.accountNumber = ++numberAccounts;
        this.balance = 100;
    }

    /* COMMON GETTERS */
    public int getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    /* SPECIAL METHODS */

    public void deposit(float value) {
        balance += value;
        String response = "";
        response += "*** DEPOSIT OPERATION ***" + "\n";
        response += "   -> account number : " + accountNumber + "\n";
        response += "   -> deposit of : +" + value + "\n";
        System.out.println(response);
    }

    public void withdrawal(float value) {
        balance -= value;
        String response = "";
        response += "*** WITHDRAWAL OPERATION ***" + "\n";
        response += "   -> account number : " + accountNumber + "\n";
        response += "   -> withdrawal of : -" + value + "\n";
        System.out.println(response);
    }

    public void displayBalance() {
        String response = "";
        response += "*** BALANCE OPERATION ***" + "\n";
        response += "   -> account number : " + accountNumber + "\n";
        if (balance >= 0) {
            response += "   -> your balance is : +" + balance + "\n";
        } else {
            response += "   -> your balance is : -" + balance + "\n";
        }
        System.out.println(response);
    }

    public void payment(float value, Account recipient) {
        balance -= value;
        recipient.deposit(value);
        String response = "";
        response += "*** PAYMENT OPERATION ***" + "\n";
        response += "   -> account number : " + accountNumber + "\n";
        response += "   -> payment of : +" + value + "\n";
        response += "   -> account recipient : " + recipient.getAccountNumber() + "\n";
        System.out.println(response);
    }
}

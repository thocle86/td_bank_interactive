package fr.cefim;

public class Client {

    private String name;
    private int clientNumber;
    private static int numberClients;
    private Account account;

    Client(String name) {
        this.name = name;
        this.clientNumber = ++numberClients;
        this.account = new Account();
    }

    /* COMMON GETTERS */

    public String getName() {
        return name;
    }

    /* SPECIAL METHODS */

    public void getBalanceAccount() {
        account.getBalance();
    }

    public void displayBalanceAccount() {
        account.displayBalance();
    }
}

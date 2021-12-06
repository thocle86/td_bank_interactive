package fr.cefim;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Part 1.1 - Account creation");
        System.out.println("-------------------------------------------");
        Account account1 = new Account();
        account1.displayBalance();
        account1.deposit(500);
        account1.displayBalance();
        account1.withdrawal(300);
        account1.displayBalance();

        System.out.println("-------------------------------------------");
        System.out.println("Part 1.2 - Payment account creation");
        System.out.println("-------------------------------------------");
        Account account2 = new Account();
        account2.displayBalance();
        account1.payment(100, account2);
        account1.displayBalance();
        account2.displayBalance();

        System.out.println("-------------------------------------------");
        System.out.println("Part 2.1 - Client creation");
        System.out.println("-------------------------------------------");
        Client client1 = new Client("Dupont");
        client1.displayBalanceAccount();
    }
}

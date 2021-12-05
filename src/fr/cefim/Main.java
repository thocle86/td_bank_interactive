package fr.cefim;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Part 1.1");
        System.out.println("-------------------------------------------");
        Account account1 = new Account();
        account1.displaySold();
        account1.deposit(500);
        account1.displaySold();
        account1.withdrawal(300);
        account1.displaySold();
        System.out.println(account1.getAccountNumber());
        System.out.println(Account.getNumberAccounts());
        Account account2 = new Account();
        System.out.println(account2.getAccountNumber());
        System.out.println(Account.getNumberAccounts());
    }
}

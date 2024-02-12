package behavioral.servant.bank;

import behavioral.servant.bank.account.Account;

public class BankService implements AccountManagement {
    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(Account account, double amount) {
        if (account.getBalance() > amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance(Account account) {
        return account.getBalance();
    }
}

package behavioral.servant.bank;

import behavioral.servant.bank.account.Account;

// Servant interface
public interface AccountManagement {
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    double getBalance(Account account);
}

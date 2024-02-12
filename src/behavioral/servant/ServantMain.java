package behavioral.servant;

import behavioral.servant.bank.AccountManagement;
import behavioral.servant.bank.BankService;
import behavioral.servant.bank.account.Account;
import behavioral.servant.bank.account.DefaultAccount;
import behavioral.servant.bank.account.InvestmentAccount;
import behavioral.servant.bank.account.SavingsAccount;

public class ServantMain {

    public static void main(String[] args) {
        AccountManagement bank = new BankService();

        Account defaultAccount = new DefaultAccount("acc-def-1");
        Account savingsAccount = new SavingsAccount("acc-sav-1");
        Account investmentAccount = new InvestmentAccount("acc-inv-1");

        bank.deposit(savingsAccount, 100.00);
        bank.deposit(savingsAccount, 200.00);

        bank.deposit(investmentAccount, 50);
        bank.deposit(investmentAccount, 30);
        bank.withdraw(investmentAccount, 10);

        String message = "Account %s balance is: %s";
        System.out.printf(message + "\n", defaultAccount.getIdentifier(), bank.getBalance(defaultAccount));
        System.out.printf(message + "\n", savingsAccount.getIdentifier(), bank.getBalance(savingsAccount));
        System.out.printf(message + "\n", investmentAccount.getIdentifier(), bank.getBalance(investmentAccount));


    }

}

package behavioral.servant.bank.account;

public abstract class Account {

    private final String identifier;
    private double balance;

    public Account(String identifier) {
        this.identifier = identifier;
        this.balance = 0.0d;
    }

    public String getIdentifier() {
        return identifier;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

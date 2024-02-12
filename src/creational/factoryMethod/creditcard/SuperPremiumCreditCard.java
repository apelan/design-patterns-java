package creational.factoryMethod.creditcard;

public class SuperPremiumCreditCard implements CreditCard {
    @Override
    public String name() {
        return "Super Premium card";
    }

    @Override
    public double maxLoanAmount() {
        return 40000;
    }
}

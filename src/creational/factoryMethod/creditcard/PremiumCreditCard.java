package creational.factoryMethod.creditcard;

public class PremiumCreditCard implements CreditCard {
    @Override
    public String name() {
        return "Premium card";
    }

    @Override
    public double maxLoanAmount() {
        return 20000;
    }
}

package creational.factoryMethod.creditcard;

public class StandardCreditCard implements CreditCard {

    @Override
    public String name() {
        return "Standard card";
    }

    @Override
    public double maxLoanAmount() {
        return 10000;
    }
}

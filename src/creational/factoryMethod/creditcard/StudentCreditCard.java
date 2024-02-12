package creational.factoryMethod.creditcard;

public class StudentCreditCard implements CreditCard {
    @Override
    public String name() {
        return "Student card";
    }

    @Override
    public double maxLoanAmount() {
        return 0;
    }
}

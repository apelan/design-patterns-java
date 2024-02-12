package creational.factoryMethod.bank;

import creational.factoryMethod.creditcard.CreditCard;
import creational.factoryMethod.creditcard.StandardCreditCard;
import creational.factoryMethod.creditcard.StudentCreditCard;

public class SmallBank extends Bank {

    @Override
    public CreditCard getCreditCard(double salary, boolean haveJob) {

        if (!haveJob) {
            return new StudentCreditCard();
        } else {
            return new StandardCreditCard();
        }

    }
}

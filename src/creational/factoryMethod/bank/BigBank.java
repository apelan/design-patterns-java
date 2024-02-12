package creational.factoryMethod.bank;

import creational.factoryMethod.creditcard.CreditCard;
import creational.factoryMethod.creditcard.PremiumCreditCard;
import creational.factoryMethod.creditcard.StandardCreditCard;
import creational.factoryMethod.creditcard.SuperPremiumCreditCard;

public class BigBank extends Bank {

    @Override
    public CreditCard getCreditCard(double salary, boolean haveJob) {
        if (!haveJob) {
            return new StandardCreditCard();
        } else {
            if (salary < 3000) {
                return new PremiumCreditCard();
            } else {
                return new SuperPremiumCreditCard();
            }
        }
    }


}

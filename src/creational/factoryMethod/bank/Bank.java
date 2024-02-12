package creational.factoryMethod.bank;

import creational.factoryMethod.creditcard.CreditCard;

// This is factory in this example, we have multiple implementations of factory
public abstract class Bank {

    // This is factory method, it is responsible to create concrete objects
    public abstract CreditCard getCreditCard(double salary, boolean haveJob);

}

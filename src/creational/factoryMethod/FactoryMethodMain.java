package creational.factoryMethod;

import creational.factoryMethod.bank.Bank;
import creational.factoryMethod.bank.BigBank;
import creational.factoryMethod.bank.SmallBank;
import creational.factoryMethod.creditcard.CreditCard;

public class FactoryMethodMain {

    public static void main(String[] args) {

        double currentSalary = 1000;
        boolean haveJob = false;

        Bank smallBank = new SmallBank();
        CreditCard smallBankCreditCard = smallBank.getCreditCard(currentSalary, haveJob);
        System.out.println("Small bank give you <" + smallBankCreditCard.name() + ">, " +
                "with loan amount: " + smallBankCreditCard.maxLoanAmount());

        Bank bigBank = new BigBank();
        CreditCard bigBankCreditCard = bigBank.getCreditCard(currentSalary, haveJob);
        System.out.println("Big bank give you <" + bigBankCreditCard.name() + ">, " +
                "with loan amount: " + bigBankCreditCard.maxLoanAmount());

    }

}

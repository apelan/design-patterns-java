package behavioral.strategy;


import behavioral.strategy.discount.BirthdayDiscount;
import behavioral.strategy.discount.BlackFridayDiscount;
import behavioral.strategy.discount.Discount;
import behavioral.strategy.discount.Item;

public class StrategyMain {

    public static void main(String[] args) {

        Item item1 = new Item("Item 1", 100.00);
        Item item2 = new Item("Item 2", 200.00);

        String message = "Original price of item '%s' is %s, after applying %s it is %s %n";

        System.out.println("--------------");
        Discount birthdayDiscount = new BirthdayDiscount();
        System.out.printf(message,
                item1.getName(),
                item1.getPrice(),
                birthdayDiscount.getClass().getSimpleName(),
                item1.getPriceWithDiscount(birthdayDiscount));

        System.out.println("--------------");
        Discount blackFridayDiscount = new BlackFridayDiscount();
        System.out.printf(message,
                item2.getName(),
                item2.getPrice(),
                blackFridayDiscount.getClass().getSimpleName(),
                item2.getPriceWithDiscount(blackFridayDiscount));


    }

}

package behavioral.strategy.discount;

// Concrete Strategy
public class BlackFridayDiscount implements Discount {
    @Override
    public double apply(double amount) {
        System.out.println("Applying Black Friday discount of 50%");
        return amount - ((amount * 50) / 100);
    }
}

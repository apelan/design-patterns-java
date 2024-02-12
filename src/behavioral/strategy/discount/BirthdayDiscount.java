package behavioral.strategy.discount;

// Concrete Strategy
public class BirthdayDiscount implements Discount {
    @Override
    public double apply(double amount) {
        System.out.println("Applying Birthday discount of 20%");
        return amount - ((amount * 20) / 100);
    }
}

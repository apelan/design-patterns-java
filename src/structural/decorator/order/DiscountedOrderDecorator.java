package structural.decorator.order;

// CONCRETE DECORATOR
public class DiscountedOrderDecorator extends BaseOrderDecorator {

    private final int discountPercentage;

    public DiscountedOrderDecorator(Order order, int discountPercentage) {
        super(order);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Applying discount " + discountPercentage + "%");
    }
}

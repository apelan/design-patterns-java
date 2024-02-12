package structural.decorator.order;

// CONCRETE DECORATOR
public class ExpeditedOrderDecorator extends BaseOrderDecorator {
    public ExpeditedOrderDecorator(Order order) {
        super(order);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Processing expedited order...");
    }
}

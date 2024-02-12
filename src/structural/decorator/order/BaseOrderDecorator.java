package structural.decorator.order;

// DECORATOR
public abstract class BaseOrderDecorator implements Order {

    protected final Order order;

    public BaseOrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public void process() {
        order.process();
    }
}

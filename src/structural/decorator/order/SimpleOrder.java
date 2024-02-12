package structural.decorator.order;


// CONCRETE COMPONENT
public class SimpleOrder implements Order {

    private final int orderId;

    public SimpleOrder(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public void process() {
        System.out.println("Processing simple order: " + orderId);
    }
}

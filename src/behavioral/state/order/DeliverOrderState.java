package behavioral.state.order;

public class DeliverOrderState extends OrderState {
    public DeliverOrderState(Order order) {
        super(order);
    }

    @Override
    public void executeNextStep() {
        order.deliver();
        order.setState(new CompleteOrderState(order));
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is being delivered, cannot cancel at this point!");
    }
}

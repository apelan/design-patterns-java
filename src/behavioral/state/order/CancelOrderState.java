package behavioral.state.order;

public class CancelOrderState extends OrderState {
    public CancelOrderState(Order order) {
        super(order);
    }

    @Override
    public void executeNextStep() {
        System.out.println("Order is cancelled, no next step available");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order already cancelled at this point.");
    }
}

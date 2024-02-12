package behavioral.state.order;

public class CompleteOrderState extends OrderState {
    public CompleteOrderState(Order order) {
        super(order);
    }

    @Override
    public void executeNextStep() {
        System.out.println("Order completed, no next step available!");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel order that is already completed!");
    }
}
